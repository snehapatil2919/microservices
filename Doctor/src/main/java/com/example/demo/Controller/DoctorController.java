package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	@GetMapping("/doctorData")
	public String getDoctor() {
		return "Hii these is a Doctor!....";
	}
}
