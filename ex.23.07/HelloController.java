package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Habilidades: 1. Concentração 2. Criatividade 3. Curiosidade"
				+ "\nMentalidade: 1. Orientação aos detalhes 2. Persistência";		
	}

}
