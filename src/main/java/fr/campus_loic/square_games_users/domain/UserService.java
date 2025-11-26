package fr.campus_loic.square_games_users.domain;

import fr.campus_loic.square_games_users.controllers.dto.UserDto;
import fr.campus_loic.square_games_users.model.User;
import org.antlr.v4.runtime.misc.NotNull;


import java.util.List;

public interface UserService {

    @NotNull
    List<UserDto> getAllUsers();

    UserDto getUser(String id);

    String createUser(String name, String email);

    UserDto updateUser(String id, UserDto userDto);

    void deleteUser(String id);
}
