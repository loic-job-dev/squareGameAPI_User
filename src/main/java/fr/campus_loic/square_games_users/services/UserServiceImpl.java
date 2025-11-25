package fr.campus_loic.square_games_users.services;

import fr.campus_loic.square_games_users.controllers.dto.UserDto;
import fr.campus_loic.square_games_users.domain.UserService;
import fr.campus_loic.square_games_users.model.User;
import fr.campus_loic.square_games_users.repositories.JpaUserDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final JpaUserDao userDao;

    public UserServiceImpl(JpaUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserDto getUser(String id) {
        return null;
    }

    @Override
    public String createUser(String name, String email) {
        User user =  new User(name, email);
        userDao.save(user);
        return user.getId();
    }

    @Override
    public void deleteUser(String id) {

    }
}
