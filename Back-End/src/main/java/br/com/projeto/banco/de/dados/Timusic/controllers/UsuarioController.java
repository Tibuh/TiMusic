package br.com.projeto.banco.de.dados.Timusic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.banco.de.dados.Timusic.dto.UsuarioAutenticarDto;
import br.com.projeto.banco.de.dados.Timusic.dto.UsuarioDto;
import br.com.projeto.banco.de.dados.Timusic.entities.Usuario;
import br.com.projeto.banco.de.dados.Timusic.services.UsuarioServico;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioServico usuarioServico;
	
	//Retorna todos os Usuarios Cadastrados
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> listaUsuario = usuarioServico.findAll();
		return ResponseEntity.ok().body(listaUsuario);
	}
	
	//INSERT INTO TB_USR(CPF, DATA_CADASTRO, EMAIL, NOME, PASSWORD) VALUES ('069', parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'emailtest', 'vitor', '123456')
	@PostMapping("/autenticar")
	public ResponseEntity<UsuarioAutenticarDto> autenticarUsuario(@RequestBody UsuarioAutenticarDto usr) {
		return ResponseEntity.ok().body(usuarioServico.autenticar(usr));
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<UsuarioDto> cadastrarUsuario(@RequestBody UsuarioDto usr){
		return ResponseEntity.ok().body(usuarioServico.cadastrar(usr));
	}
}
