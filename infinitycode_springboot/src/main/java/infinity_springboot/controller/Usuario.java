package infinity_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Usuario {

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
