package fr.campus_loic.square_games_users.controllers;

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
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping
    public String createUser(@RequestBody String name, String email) {
        User user = userService.createUser(name, email);
        return user.getId();
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
