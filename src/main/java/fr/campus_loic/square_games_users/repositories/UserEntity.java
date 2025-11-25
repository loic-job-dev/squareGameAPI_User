package fr.campus_loic.square_games_users.repositories;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "User")
public class UserEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public void setId(String id) {this.id = id;}
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
