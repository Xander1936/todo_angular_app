package com.alexandre.Todo_SpringBoot.repositories;

import com.alexandre.Todo_SpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
