package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

	@RestController
	@RequestMapping("/BSM")

public class ListaBSM {

		@GetMapping
		public String listaBsm() {
			return "Lista BSM: Orientação ao Futuro, Responsabilidade Pessoal, Mentalidade de Crescimento e Persistência.";
		}
}
