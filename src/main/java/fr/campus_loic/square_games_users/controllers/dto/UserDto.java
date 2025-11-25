package fr.campus_loic.square_games_users.controllers.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record UserDto(
    String id,
    String name,
    String email,
    String password) {
}
