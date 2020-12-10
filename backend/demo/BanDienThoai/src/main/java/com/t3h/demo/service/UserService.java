package com.t3h.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.t3h.demo.entities.Authorities;
import com.t3h.demo.entities.Role;
import com.t3h.demo.entities.User;
import com.t3h.demo.repo.UserRepo;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		User user = userRepo.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("No user!"));
		return new org.springframework.security.core.userdetails.User(
				user.getUsername(),
				user.getPassword(),
				getAuthorities(user)
				);
	}

	private Collection<? extends GrantedAuthority> getAuthorities(User user) {
		List<Authorities> listAu = new ArrayList<Authorities>();
		List<Role> roles = user.getRoles();
		for (Role role : roles) {
			List<Authorities> authorities = role.getAuthorities();
			listAu.addAll(authorities);
		}
		
		return listAu.stream().map(e -> new SimpleGrantedAuthority(e.getName()))
				.collect(Collectors.toList());
	}
}
