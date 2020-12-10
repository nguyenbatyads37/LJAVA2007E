package com.t3h.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3h.demo.entities.Role;

public interface RoleRepo extends JpaRepository<Role, String>{

}
