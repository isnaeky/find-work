package com.isnaeky.app.models.service;

import java.util.List;
import com.isnaeky.app.models.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public List<Usuario> findO(String name);

	public void save(Usuario usuario);

	public Usuario findOne(String name);

	public void delete(Long id);
	
	public Usuario getUsuario(String email);
}
