package com.t3h.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t3h.demo.entities.Role;

@Service
public class CacheServiceImpl implements CacheService<List<Role>> {
	
	public List<Role> listRoles = new ArrayList<Role>();
	
	@Autowired
	private RoleService roleService;

	@Override
	@PostConstruct
	public void loadCache() {
		listRoles = roleService.getAll();
	}

	@Override
	public List<Role> getCache() {
		return listRoles;
	}

	
}
