package com.erp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/usuario")
public class UsuarioController {

	@GetMapping
	public String holaMundo() {
		return "Hola Mundo Azure";
	}
}
