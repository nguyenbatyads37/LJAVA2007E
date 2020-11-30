package com.t3h.demo.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadFileController {

	@GetMapping(value = "/getUpload")
	public String getUploadFile() {
		return "upload";
	}
	
	@PostMapping(value = "/postUpload")
	public String postUploadFile(
			@RequestParam MultipartFile file,
			Model model) {
		// Lay dia chi file
		Path location = Paths.get("D:/" + file.getOriginalFilename());
		
		try {
			// Luu file xuong server
			Files.copy(file.getInputStream(), 
					location, 
					StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			model.addAttribute("msg", "Error");
		}
		
		model.addAttribute("msg", "Them file thanh cong");
		return "upload";
	}
}
