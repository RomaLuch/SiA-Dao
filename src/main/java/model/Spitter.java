package model;

import javax.persistence.*;

/**
 * Created by Рома on 01.07.2017.
 */

@Entity
@Table(name = "SPITTER")
public class Spitter {
    private static long schet = 0;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "IDUSER")
    private Long id;
    private String username;
    private String password;
    private String fullName;

    public Spitter() {
    }

    public Spitter(String username, String password, String fullName) {
        /*this.id=schet++;*/
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

