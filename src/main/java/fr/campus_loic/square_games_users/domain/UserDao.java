package fr.campus_loic.square_games_users.domain;

import fr.campus_loic.square_games_users.controllers.dto.UserDto;
import fr.campus_loic.square_games_users.model.User;

import java.util.List;

public interface UserDao {

    List<UserDto> findAll();

    UserDto findById(String userId);

    void save(User user);

    public UserDto update(String id, UserDto userDto);

    void delete(String userId);
}
