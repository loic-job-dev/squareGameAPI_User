package fr.campus_loic.square_games_users.domain;

import fr.campus_loic.square_games_users.model.User;
import org.antlr.v4.runtime.misc.NotNull;


import java.util.List;

public interface UserService {

    @NotNull
    List<User> getAllUsers();

    User getUser(String id);

    User createUser(String name, String email);

    void deleteUser(String id);
}
