package com.t3h.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3h.demo.entities.User;

public interface UserRepo extends JpaRepository<User, String> {
	public Optional<User> findByUsername(String username);
}
