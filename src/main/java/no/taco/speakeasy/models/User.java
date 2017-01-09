package no.taco.speakeasy.models;

import org.springframework.data.annotation.Id;

/**
 * Created by catoda on 07.11.2016.
 */
public class User {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
