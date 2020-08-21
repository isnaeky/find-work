package com.isnaeky.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.isnaeky.app.formbean.LoginBean;
import com.isnaeky.app.models.entity.Usuario;
import com.isnaeky.app.models.service.IUsuarioService;


@Controller
public class IndexController {
	
	@Autowired//inyecta la dependencia
	//@Qualifier("clienteDaoJPA")//Se pone cuando exista mas de una implementacion de Dao ya que solo es posible tener uno 
	private IUsuarioService usuarioDao;
	
	
	@GetMapping({ "", "/", "/index", "/inicio" })
	public String index() {
		System.out.println("Entro a index");
		return "/inicio/index";
	}

	@GetMapping({ "/registrar", "/register" })
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
		//Usuario usuario = null;
		//
		if (result.hasErrors()) {
			System.out.println("Hay errores");
			return "/login/login";
		}
		if (usuarioDao.findOne(usuario.getUser()) != null) {
		System.out.println("Encontrado");	
		
		}
				
		return "redirect:/panel";
	}//385431732
	
	
	
	//Forma de obtener la respuesta del front 
	@PostMapping("/formlogins")
	public String createAbc(@RequestBody String requestBody){
	    System.out.println("Request body: " + requestBody);
	   // System.out.println(requestBody.users);
	    return "redirect:/panel";
	}
	
}
