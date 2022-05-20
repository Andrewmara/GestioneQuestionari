package it.f2informatica.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.f2informatica.test.service.HomeService;



@RestController
public class HomeController {
	
	@Autowired
	HomeService service;
	
	
	@RequestMapping("/")
	public String Testo() {
		return this.service.testo();
	}
}
