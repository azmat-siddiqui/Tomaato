package com.azmat.onlinefoodordering.repository;

import com.azmat.onlinefoodordering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String username);
}
