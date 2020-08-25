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

import com.isnaeky.app.models.entity.Registrar;
import com.isnaeky.app.models.entity.Usuario;
import com.isnaeky.app.models.service.IUsuarioService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Controller
public class IndexController {

	Logger logger = LogManager.getLogger(IndexController.class);

	@Autowired // inyecta la dependencia
	// @Qualifier("clienteDaoJPA")//Se pone cuando exista mas de una implementacion
	// de Dao ya que solo es posible tener uno
	private IUsuarioService usuarioDao;

	@GetMapping({ "", "/", "/index", "/inicio" })
	public String index() {
		logger.info("Entro a index");
		return "/inicio/index";
	}

	@GetMapping("/registrar")
	public String registrar() {
		logger.info("Entro a registrar");
		return "/register/register";
	}

	@GetMapping({ "/login", "/iniciarsesion" })
	public String login() {
		logger.info("Entro a login");
		return "/login/login";
	}

	@GetMapping("/panel")
	public String panel() {
		logger.info("Entro al panel");
		return "/private/panel";
	}

	@PostMapping("/formlogin")
	public String dateLogin(HttpServletRequest request, Model model) {
		Usuario user = null;

		if (request.getParameter("email") == null && request.getParameter("pass") == null) {
			logger.error("Se encontro un error en los datos obtenidos");
			return "/login/login";
		}

		try {
			user = usuarioDao.getUsuario(request.getParameter("email"));
		} catch (Exception e) {
			logger.error("No se encontro datos disponibles");
		}

		if (user == null) {
			logger.error("Sin datos en el objeto");
		} else {
			logger.info(user.getId());
			logger.info(user.getPass());
			logger.info(user.getEmail());
			if (user.getId() == null) {
				logger.error("No hay datos disponibles verifique");
			}

			if (user.getPass().equals(request.getParameter("pass"))) {
				logger.info("Login correcto redirigiendo a panel principal");
				return "redirect:/panel";
			}
		}

		logger.error("Error en el login redireccionando al login");
		return "/login/login";
	}

	@PostMapping("/register")
	public String crearUser(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, Model model) {
		Usuario user = null;
		try {
			user = usuarioDao.getUsuario(usuario.getEmail());
		} catch (Exception e) {
			logger.error("No se encontro datos disponibles");
		}
		if (user == null) {
			logger.error("Sin datos en el objeto");
		} else if (user.getEmail().equals(usuario.getEmail())) {
			logger.error("El email ya se encuentra registrado");
			logger.error("Redirigiendo a registrar");
			return "redirect:/registrar";
		}
		logger.info("Intentanto registrar el usuario");
		usuarioDao.save(usuario);
		logger.info("Redirigiendo a la bienvenida");
		return "redirect:/panel";
	}

	// Forma de obtener la respuesta del front
	@PostMapping("/formlogins")
	public String createAbc(@RequestBody String requestBody) {
		logger.info("Request body: " + requestBody);
		// logger.info(requestBody.users);
		return "redirect:/panel";
	}

}
