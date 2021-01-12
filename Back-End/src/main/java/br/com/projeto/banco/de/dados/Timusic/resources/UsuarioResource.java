package br.com.projeto.banco.de.dados.Timusic.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.banco.de.dados.Timusic.entities.Usuario;
import br.com.projeto.banco.de.dados.Timusic.services.UsuarioServico;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioServico usuarioServico;
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> listaUsuario = usuarioServico.findAll();
		return ResponseEntity.ok().body(listaUsuario);
	}
}
