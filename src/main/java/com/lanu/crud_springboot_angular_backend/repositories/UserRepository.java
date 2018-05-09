package com.lanu.crud_springboot_angular_backend.repositories;

import com.lanu.crud_springboot_angular_backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(Long id);
}
