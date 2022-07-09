package com.developersmill.testdoubles.contracts;

import com.developersmill.testdoubles.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(long id);

}
