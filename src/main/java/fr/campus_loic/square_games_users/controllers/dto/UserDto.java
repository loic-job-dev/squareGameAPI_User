package fr.campus_loic.square_games_users.controllers.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Schema(name = "UserDto", description = "Data transfer object representing a user")
public record UserDto(
        @Schema(description = "Unique identifier of the user", example = "123")
        String id,

        @Schema(description = "Full name of the user", example = "Loïc Dupont", required = true)
        String name,

        @Schema(description = "Email address of the user", example = "loic@example.com", required = true)
        String email,

        @Schema(description = "Password of the user", example = "secret123", required = true)
        String password
) {}
