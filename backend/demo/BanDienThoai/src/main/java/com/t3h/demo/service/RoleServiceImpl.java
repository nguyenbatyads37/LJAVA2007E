package com.t3h.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t3h.demo.entities.Role;
import com.t3h.demo.repo.RoleRepo;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepo roleRepo;
	
	@Override
	public List<Role> getAll() {
		return roleRepo.findAll();
	}

}
