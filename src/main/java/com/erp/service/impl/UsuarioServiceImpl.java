package com.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.entity.UsuarioEntity;
import com.erp.repository.UsuarioRepository;
import com.erp.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<UsuarioEntity> usuarios() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public UsuarioEntity registrar(UsuarioEntity usuario) {
		UsuarioEntity usuarioRegistrar = new UsuarioEntity();
		usuarioRegistrar.setNombre(usuario.getNombre());
		usuarioRegistrar.setApellido(usuario.getApellido());
		UsuarioEntity usuarioRespuesta = usuarioRepository.save(usuarioRegistrar);
		return usuarioRespuesta;
	}
}
