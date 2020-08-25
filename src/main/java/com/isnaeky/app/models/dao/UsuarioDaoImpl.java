package com.isnaeky.app.models.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	}

	@Override
	public Usuario findOne(String name) {
//		em.createQuery("INSERT INTO `db_springboot`.`usuario` (`id`, `user`, `pass`) VALUES ('1', 'isi', '123');");
		//Query query = em.createQuery("select usuario0_.id as id1_0_0_, usuario0_.pass as pass2_0_0_, usuario0_.user as user3_0_0_ from usuario usuario0_");
		//System.out.println(em.createQuery("select id, pass ,user from usuario")); 
			 return em.find(Usuario.class, name);	 
		//return "";	
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	//Query query = em.createQuery("select pass from usuario where user = nam ");
	// query.setParameter("nam", name);
	 //return = query.getResultList();
//return Usuario = em.createQuery("select pass from usuario where user = nam ");
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findO(String name) {
		//Query query = em.createQuery("select id,user,pass from usuario as u where u.user = 'isi'");
		//return  query.getResultList( );
		return null;
	}

	
	@Override
	public Usuario getUsuario(String email) {
		Query nativeQuery = em.createNativeQuery("SELECT id, email, pass FROM Usuario WHERE email = ?", Usuario.class);
        nativeQuery.setParameter(1, email);
        return (Usuario) nativeQuery.getSingleResult();
	}
	
}
