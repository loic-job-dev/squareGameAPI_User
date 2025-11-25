package fr.campus_loic.square_games_users.domain;

import fr.campus_loic.square_games_users.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    User findById(String userId);

    void save(User user);

    void update(User user);

    void delete(String userId);
}
