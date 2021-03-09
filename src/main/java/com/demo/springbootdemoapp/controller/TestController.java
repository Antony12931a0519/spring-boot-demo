package com.demo.springbootdemoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("test")
public class TestController {

	@GetMapping("/")
	public String welcome() {
		return "Welome";  
	}

	@GetMapping("/1")
	public String welcome1() {
		return "Welome";  
	}
	

	/*@PostMapping("/accountdevices")
	public String getAcountDevices(@RequestBody AccountDeviceModel model) {
		return "Welome";  
	}*/

}
