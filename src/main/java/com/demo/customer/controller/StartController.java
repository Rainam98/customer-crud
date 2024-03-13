package com.demo.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class StartController {
	
	Logger logger = LoggerFactory.getLogger(StartController.class);

	@GetMapping("/")
	  public ModelAndView login() {
		logger.info("Inside Login Method");


	    return new ModelAndView("index");
	  }
}
