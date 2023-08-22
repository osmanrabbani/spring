package com.example.login_assing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;
import com.example.login_assing.model.User;
@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
