package com.erp.service;

import java.util.List;

import com.erp.entity.UsuarioEntity;

public interface UsuarioService {

	List<UsuarioEntity> usuarios();
	
	UsuarioEntity registrar(UsuarioEntity usuario);
}
