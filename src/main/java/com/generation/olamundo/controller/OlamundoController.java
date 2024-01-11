package com.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade1")
public class OlamundoController {
	
	@GetMapping("/ola-mundo")
	public String olaMundo() {
		return "Ola mundo!!";
	}
	
	@GetMapping("/bsm")
	public String bsmGenerationBrasil() {
		return "Responsabilidade Pessoal, "
				+ "\n Mentalidade de Crescimento, "
				+ "\n Orientação ao futuro, "
				+ "\n Comunicação, "
				+ "\n Atenção aos detalhes, "
				+ "\n Trabalho em equipe, "
				+ "\n Proatividade, ";
	}
	
	@GetMapping("/objetivos")
	public String meusOBjetivosDaSemana() {
		return "Não faltar nenhum dia, revisar o cookbook, entregar os conteudos no prazo e fazer um revisao geral no ultimo dia da semana";
	}
}
