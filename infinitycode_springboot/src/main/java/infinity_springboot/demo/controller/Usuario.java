package infinity_springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Usuario {

	@RequestMapping("/login")
	public String login() {
		return "infinity_springboot.controller.Usuario/login";
	}

	@RequestMapping("/cadastro")
	public String CadastroUsuario() {
		return "infinity_springboot.controller.Usuario/cadastro";
	}

	@RequestMapping("/esquecisenha")
	public String esqueciSenha() {
		return "infinity_springboot.controller.Usuario/esquecisenha";
	}
}
