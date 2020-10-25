package t3h.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import t3h.springboot.pojo.FacebookResponse;
import t3h.springboot.service.FacebookService;

@RestController
@RequestMapping(value = "/api")
public class FacebookController {
	
	@Autowired
	FacebookService facebookService;

	@RequestMapping(value = "/kiemtra")
	public ResponseEntity<FacebookResponse> kiemTraLogin(
			@RequestParam String username,
			@RequestParam String password) {
		FacebookResponse response = 
				facebookService.kiemTraLogin(
						username, password);
		return ResponseEntity.ok(response);
	}
}
