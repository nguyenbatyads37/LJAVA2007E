package t3h.springboot.service;

import t3h.springboot.pojo.FacebookResponse;

public interface FacebookService {
	
	public FacebookResponse kiemTraLogin(
			String username, String password);
}
