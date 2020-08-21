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

//		em.createQuery("INSERT INTO `db_springboot`.`usuario` (`id`, `user`, `pass`) VALUES ('1', 'isi', '123');");
		//Query query = em.createQuery("select usuario0_.id as id1_0_0_, usuario0_.pass as pass2_0_0_, usuario0_.user as user3_0_0_ from usuario usuario0_");
		//System.out.println(em.createQuery("select id, pass ,user from usuario"));
		return em.find(Usuario.class, name);
	
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
