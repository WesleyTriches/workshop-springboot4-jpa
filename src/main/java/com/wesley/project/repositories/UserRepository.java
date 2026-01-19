package com.wesley.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
