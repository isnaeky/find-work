package com.isnaeky.app.models.dao;

import java.util.List;

import com.isnaeky.app.models.entity.Usuario;

public interface IUsuarioDao {
		
		public List<Usuario> findAll();
		
		public void save(Usuario usuario);
		
		public Usuario findOne(String name);
		
		public void delete(Long id);
	
}
