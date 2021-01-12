package br.com.projeto.banco.de.dados.Timusic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.banco.de.dados.Timusic.entities.Usuario;
import br.com.projeto.banco.de.dados.Timusic.repositories.UsuarioRepository;
import br.com.projeto.banco.de.dados.Timusic.services.exception.ErroAutenticacao;

@Service
public class UsuarioServico {

	@Autowired
	private UsuarioRepository usuarioRepositorio;
	
	//Busca todos os Usuarios na base de dados
	public List<Usuario> findAll() {
		return usuarioRepositorio.findAll();
	}
	
	public Usuario autenticar(String email, String senha) {
		Optional<Usuario> usr = usuarioRepositorio.findByEmail(email);
		
		if(!usr.isPresent()) {
			throw new ErroAutenticacao("Usuario nao encontrado para o email informado");
		} 

		if(usr.get().getPassword().equals(senha)) {
			throw new ErroAutenticacao("Senha Invalida");
		}
		
		return usr.get();
	}
}
