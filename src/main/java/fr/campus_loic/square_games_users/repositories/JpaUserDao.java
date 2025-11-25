package fr.campus_loic.square_games_users.repositories;

import fr.campus_loic.square_games_users.domain.UserDao;
import fr.campus_loic.square_games_users.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class JpaUserDao implements UserDao {

    private final UserEntityRepository repository;

    public JpaUserDao(UserEntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User findById(String userId) {
        return null;
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
    public void update(User user) {

    }

    @Override
    public void delete(String userId) {

    }
}

