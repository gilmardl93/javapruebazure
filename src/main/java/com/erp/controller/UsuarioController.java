package com.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.entity.UsuarioEntity;
import com.erp.service.UsuarioService;

@RestController
@RequestMapping(value = "api/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public List<UsuarioEntity> usuarios() {
		return usuarioService.usuarios();
	}
	
	@PostMapping
	public UsuarioEntity registrar(@RequestBody UsuarioEntity usuario) {
		return usuarioService.registrar(usuario);
	}
}
