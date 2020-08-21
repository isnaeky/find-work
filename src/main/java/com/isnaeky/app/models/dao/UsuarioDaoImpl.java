package com.isnaeky.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.isnaeky.app.models.entity.Usuario;

@Repository("usuarioDaoJPA") 
public class UsuarioDaoImpl implements IUsuarioDao{
	
	@PersistenceContext // inyectar entitymanager
	private EntityManager em;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findOne(String name) {
		// TODO Auto-generated method stub
		return em.find(Usuario.class, name);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
