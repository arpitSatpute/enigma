package com.teamarc.demo.repository;


import com.teamarc.demo.entity.User;
import com.teamarc.demo.entity.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    User findByRoles(Role role);

}

