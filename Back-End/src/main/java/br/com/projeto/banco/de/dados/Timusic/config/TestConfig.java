package br.com.projeto.banco.de.dados.Timusic.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.projeto.banco.de.dados.Timusic.entities.Usuario;
import br.com.projeto.banco.de.dados.Timusic.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Maria Brown", "45646578978", LocalDate.now(), "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "45646578978", LocalDate.now(), "123456");
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
	} 

}
