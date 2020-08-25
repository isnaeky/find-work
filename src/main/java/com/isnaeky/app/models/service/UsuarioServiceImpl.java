package com.isnaeky.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.isnaeky.app.models.dao.IUsuarioDao;
import com.isnaeky.app.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	@Autowired
	private IUsuarioDao usuarioDao;

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
	@Transactional(readOnly = true)
	public Usuario findOne(String name) {
		// TODO Auto-generated method stub
		
		return usuarioDao.findOne(name); 
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> findO(String name) {
		// TODO Auto-generated method stub
		return usuarioDao.findO(name);
	}

	@Override
	public Usuario getUsuario(String email) {
		// TODO Auto-generated method stub
		 return usuarioDao.getUsuario(email);
	}
	
	

}
