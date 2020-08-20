package com.isnaeky.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.isnaeky.app.models.entity.Usuario;

@Controller
public class IndexController {

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
	
	/*@PostMapping("/formlogin")
	public String dateLogin(@Valid @ModelAttribute("usuario") Usuario cliente, Model model){
		//return "redirect:/private/panel";
		//System.out.println("Entro a form*********************************");
		//System.out.println(request);
		//System.out.println("\n *********************************");
		//System.out.println(resp);
		//System.out.println("\n *********************************");
//		System.out.println(data);
		return "";
	}*/
}
