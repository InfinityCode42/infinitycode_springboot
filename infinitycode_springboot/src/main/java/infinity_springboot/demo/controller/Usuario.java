package infinity_springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Usuario {

	@RequestMapping("/")
	public String Site() {
		return "Site/site";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "Usuario/login";
	}

	@RequestMapping("/cadastro")
	public String CadastroUsuario() {
		return "Usuario/cadastro";
	}

	@RequestMapping("/esquecisenha")
	public String esqueciSenha() {
		return "Usuario/esquecisenha";
	}
	
}
