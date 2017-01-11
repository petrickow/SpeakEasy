package no.taco.speakeasy.services;

import no.taco.speakeasy.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by catoda on 07.11.2016.
 */

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    public User[] findByFirstName(String firstName); // find all with a given firstName, does this work

    public User findByFirstNameAndLastName(String firstName, String lastName);
    public User findUniqueByFirstName(String firstName); // first?


}
