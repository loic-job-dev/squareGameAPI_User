package fr.campus_loic.square_games_users.services;

import fr.campus_loic.square_games_users.domain.UserService;
import fr.campus_loic.square_games_users.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public User createUser(String name, String email) {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }
}
