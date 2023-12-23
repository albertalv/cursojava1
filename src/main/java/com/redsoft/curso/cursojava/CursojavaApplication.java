package com.redsoft.curso.cursojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.redsoft.curso.cursojava.modelo.Usuario;
import com.redsoft.curso.cursojava.servicio.UsuarioService;

@SpringBootApplication
public class CursojavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursojavaApplication.class, args);
		System.out.print("holamundo");
		UsuarioService usr1 = new UsuarioService();
		
		/*Usuario user = new Usuario();
		user.setId(23);
		user.setNombre("Josue");
		user.setCorreo("josue@gmail.com");
		user.setContraseña("1234");
		usr1.agregarUsuario(user);*/
	
		// servicio.agregarUsuario(usuario);
		usr1.findAllUsuarios();
	}

}
