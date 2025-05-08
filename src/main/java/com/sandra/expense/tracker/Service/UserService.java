package com.sandra.expense.tracker.Service;
import com.sandra.expense.tracker.Entity.User;

import java.util.Optional;

public interface UserService {

    User createUser(User user);


    Optional<User> findByEmail(String email);

    Optional<User> findById(Long id);
}
