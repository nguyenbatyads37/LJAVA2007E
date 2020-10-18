package t3h.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import t3h.springboot.service.TinhTongService;

@RestController // Handle rest request (API)
public class TinhTongController {
	
	@Autowired // bean
	TinhTongService tinhTongService;

	@RequestMapping(value = "/tinhtong", method = RequestMethod.GET)
	public ResponseEntity<String> tinhTong(
			@RequestParam int num1, 
			@RequestParam int num2) {
		int total = tinhTongService.tinhtong(num1, num2);
		return new ResponseEntity<String>(String.valueOf(total), HttpStatus.OK);
	}
}
