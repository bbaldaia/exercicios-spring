package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Meu objetivo é primeiramente conseguir absorver todo o conhecimento que os instrutores"
				+ "estarão me passando. Além disso, tenho como objetivo estudar mais sobre GitHub.";		
	}

}
