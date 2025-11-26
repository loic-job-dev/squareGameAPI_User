package fr.campus_loic.square_games_users.repositories;

import fr.campus_loic.square_games_users.controllers.dto.UserDto;
import fr.campus_loic.square_games_users.domain.UserDao;
import fr.campus_loic.square_games_users.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Primary
public class JpaUserDao implements UserDao {

    private final UserEntityRepository repository;

    public JpaUserDao(UserEntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<UserDto> findAll() {
        List<UserEntity> listEntyties = repository.findAll();
        List<UserDto> listUsers = new ArrayList<>();
        for  (UserEntity userEntity : listEntyties) {
            UserDto user = new UserDto(userEntity.getId(), userEntity.getName(), userEntity.getEmail(), null);
            listUsers.add(user);
        }
        return listUsers;
    }

    @Override
    public UserDto findById(String userId) {
        UserEntity userEntity = repository.findById(userId).orElse(null);
        try {
            UserDto user = new UserDto(userEntity.getId(), userEntity.getName(), userEntity.getEmail(), null);
            return user;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void save(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setName(user.getName());
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        repository.save(userEntity);
    }

    @Override
    public UserDto update(String id, UserDto userDto) {
        try {
            UserEntity userEntity = repository.findById(id).orElse(null);
            User user = new User(userDto.name(), userDto.email());
            userEntity.setName(user.getName());
            userEntity.setEmail(user.getEmail());
            userEntity.setPassword(user.getPassword());
            repository.save(userEntity);
            UserDto newUserDto = new UserDto(userEntity.getId(), userEntity.getName(), userEntity.getEmail(), null);
            return newUserDto;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void delete(String userId) {
        try {
            repository.deleteById(userId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

