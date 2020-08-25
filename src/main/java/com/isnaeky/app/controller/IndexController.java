package com.isnaeky.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.isnaeky.app.models.entity.Usuario;
import com.isnaeky.app.models.service.IUsuarioService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Controller
public class IndexController {
	
	Logger logger = LogManager.getLogger(IndexController.class);
	
	@Autowired//inyecta la dependencia
	//@Qualifier("clienteDaoJPA")//Se pone cuando exista mas de una implementacion de Dao ya que solo es posible tener uno 
	private IUsuarioService usuarioDao;
	
	
	@GetMapping({ "", "/", "/index", "/inicio" })
	public String index() {
		System.out.println("Entro a index");
		return "/inicio/index";
	}

	@GetMapping("/registrar")
	public String registrar() {
		System.out.println("Entro a registrar");
		return "/register/register";
	}

	@GetMapping({ "/login", "/iniciarsesion" })
	public String login() {
		System.out.println("Entro a login");
		return "/login/login";
	}
	
	@GetMapping("/panel")
	public String panel() {
		System.out.println("Entro al panel");
		return "/private/panel";
	}
	
	@PostMapping("/formlogin")
	public String dateLogin(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, Model model){
		Usuario user = null;
		if (result.hasErrors()) {
			logger.error("Se encontro un error en los datos obtenidos");
			return "/login/login";
		}
		logger.error(usuario.getEmail());
		user = usuarioDao.getUsuario(usuario.getEmail());
		logger.info(user.getId());
		logger.info(user.getPass());
		logger.info(user.getEmail());
		if (user.getId() == null) {
			logger.error("No hay datos disponibles verifique");
		}
		
		if (user.getPass().equals(usuario.getPass())) {
			logger.info("Login correcto redirigiendo a panel principal");
			return "redirect:/panel";
		}
		logger.error("Error en el login redireccionando al login");
		return "/login/login";
	}
	
	@PostMapping("/register")
	public String crearUser(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, Model model) {
		//String name = request.getParameter("nombre");
		
		return "redirect:/";
	}
	
	//Forma de obtener la respuesta del front 
	@PostMapping("/formlogins")
	public String createAbc(@RequestBody String requestBody){
	    System.out.println("Request body: " + requestBody);
	   // System.out.println(requestBody.users);
	    return "redirect:/panel";
	}
	
}
