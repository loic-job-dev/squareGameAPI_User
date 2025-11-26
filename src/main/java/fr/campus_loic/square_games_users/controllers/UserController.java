package fr.campus_loic.square_games_users.controllers;

import fr.campus_loic.square_games_users.controllers.dto.UserDto;
import fr.campus_loic.square_games_users.domain.UserService;
import fr.campus_loic.square_games_users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping
    public String createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto.name(), userDto.email());
    }

    @PutMapping("/{id}")
    public UserDto updateUser(@PathVariable String id, @RequestBody UserDto userDto) {
        return userService.updateUser(id, userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
