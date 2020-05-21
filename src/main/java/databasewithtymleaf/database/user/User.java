package databasewithtymleaf.database.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String password;
    private String userName;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String phone;
    private String birthDate;
    private String address;
    private String city;
    private int pin;
    private double balance;
}
