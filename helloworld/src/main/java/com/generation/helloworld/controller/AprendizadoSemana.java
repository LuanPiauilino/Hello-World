package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

	@RestController
	@RequestMapping("/aprendizagem-semana")

public class AprendizadoSemana {

		@GetMapping
		public String AprendizagemSemana() {
			return "Como fazer um Banco de Dados e Tabelas no MySQL, como fazer um DER de um Banco de Dados e a Introdução ao Spring Boot.";
		}
}
