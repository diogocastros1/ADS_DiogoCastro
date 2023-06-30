package br.inatel.labs.ADSPadraoMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OlaMundoController {
	
	@GetMapping("/ola")
	public String getOla() {
		return "ola-mundo";
	}
}
