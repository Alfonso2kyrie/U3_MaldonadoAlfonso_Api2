package com.utez.sda.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/index")
	public String index() {
		logger.trace("trace messagge");
		logger.debug("Debug message");
		logger.info("Info message");
		logger.warn("Warn message");
		logger.error("Error message");
		
		return"Hola desde el login";
	}
}
