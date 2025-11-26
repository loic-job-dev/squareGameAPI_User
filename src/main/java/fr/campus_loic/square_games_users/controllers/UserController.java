package fr.campus_loic.square_games_users.controllers;

import fr.campus_loic.square_games_users.controllers.dto.UserDto;
import fr.campus_loic.square_games_users.domain.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Tag(name = "User Controller", description = "Operations related to users")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping
    @Operation(summary = "Get all users", description = "Retrieve a list of all users")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a user by ID", description = "Retrieve a user by their unique ID")
    public UserDto getUserById(
            @Parameter(description = "ID of the user to retrieve", required = true)
            @PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping
    @Operation(summary = "Create a new user", description = "Create a new user with name and email")
    public String createUser(
            @Parameter(description = "User object containing name and email", required = true)
            @RequestBody UserDto userDto) {
        return userService.createUser(userDto.name(), userDto.email());
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a user", description = "Update a user's information by their ID")
    public UserDto updateUser(
            @Parameter(description = "ID of the user to update", required = true)
            @PathVariable String id,
            @Parameter(description = "Updated user object", required = true)
            @RequestBody UserDto userDto) {
        return userService.updateUser(id, userDto);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a user", description = "Delete a user by their unique ID")
    public void deleteUserById(
            @Parameter(description = "ID of the user to delete", required = true)
            @PathVariable String id) {
        userService.deleteUser(id);
    }

}
