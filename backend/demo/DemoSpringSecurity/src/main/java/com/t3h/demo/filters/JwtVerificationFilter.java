package com.t3h.demo.filters;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

public class JwtVerificationFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(
			HttpServletRequest request, 
			HttpServletResponse response, 
			FilterChain filterChain)
			throws ServletException, IOException {
		// Kiem tra jwt duoc gui den
		String inComingAuth = request.getHeader("Authorization");
		
		if (inComingAuth == null || inComingAuth.isEmpty()) {
			filterChain.doFilter(request, response);
			return;
		}
		
		String jwtToken = inComingAuth.replace("Bearer ", "");
		
		Jws<Claims> claim = Jwts.parser()
				.setSigningKey(JwtUsernamePasswordFilter.key)
				.parseClaimsJws(jwtToken);
		
		Claims body = claim.getBody();
		String username = body.getSubject();
		
		List<Map<String, String>> authorities = 
				(List<Map<String, String>>) body.get("authorities");
		
		Authentication authentication =
				new UsernamePasswordAuthenticationToken(
						username,
						null,
						authorities.stream()
						.map(m -> new SimpleGrantedAuthority(m.get("authority")))
						.collect(Collectors.toList())
						);
		
		// Khai bao authen voi spring security
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		filterChain.doFilter(request, response);
	}

}
