package com.t3h.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.t3h.demo.entities.Role;
import com.t3h.demo.entities.User;
import com.t3h.demo.repo.UserRepo;

@Service
public class UserRegisterServiceImpl implements UserRegisterService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private CacheService<List<Role>> cache;
	
	@Override
	public void dangky(User user) {
		if (user.getRoles() == null || user.getRoles().size() == 0) {
			Role rol = new Role();
			for (Role role : cache.getCache()) {
				if (role.getName().equals("ROLE_USER")) {
					rol = role;
				}
			}
			List<Role> listRole = new ArrayList<Role>();
			listRole.add(rol);
			user.setRoles(listRole);
		}
		user.setId(UUID.randomUUID().toString());
		user.setPassword(encoder.encode(user.getPassword()));
		userRepo.save(user);
	}

}
