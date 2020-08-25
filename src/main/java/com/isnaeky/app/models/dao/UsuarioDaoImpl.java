package com.isnaeky.app.models.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isnaeky.app.controller.IndexController;
import com.isnaeky.app.models.entity.Usuario;

@Repository("usuarioDaoJPA") 
public class UsuarioDaoImpl implements IUsuarioDao{
	
	Logger logger = LogManager.getLogger(UsuarioDaoImpl.class);
	
	@PersistenceContext // inyectar entitymanager
	private EntityManager em;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void save(Usuario usuario) {
		em.persist(usuario);
	}

	@Override
	public Usuario findOne(String name) {
			 return em.find(Usuario.class, name);	 
	}

	@Override
	public void delete(Long id) {
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findO(String name) {
		return null;
	}

	
	@Override
	public Usuario getUsuario(String email) {
		Query nativeQuery = em.createNativeQuery("SELECT id, email, pass, nombre, apellidop, apellidom, sexo, telefono, fechana FROM Usuario WHERE email = ?", Usuario.class);
        nativeQuery.setParameter(1, email);
        Object result = "";
        try {
            result =  nativeQuery.getSingleResult();
        } catch (Exception e) {
            logger.error("Resultado no encontrado... "+e);
        }
        return (Usuario) result;
	}
	
}
