package t3h.springboot.service.impl;

import org.springframework.stereotype.Service;

import t3h.springboot.pojo.FacebookResponse;
import t3h.springboot.service.FacebookService;

@Service
public class FacebookServiceImpl implements FacebookService{
	
	private final static String SUCCESS_STATE = "OK";
	private final static String FAIL_STATE = "FAIL";

	@Override
	public FacebookResponse kiemTraLogin(
			String username, String password) {
		FacebookResponse response = new FacebookResponse();
		response.setUsername(username);
		response.setPassword(password);
		
		// Kiem tra thong tin dang nhap
		if (username.equals("admin") && 
				password.equals("admin")) {
			response.setLoginState(SUCCESS_STATE);
			response.setResponseCode("200");
		} else  {
			response.setLoginState(FAIL_STATE);
			response.setResponseCode("300");
		}
		return response;
	}

}
