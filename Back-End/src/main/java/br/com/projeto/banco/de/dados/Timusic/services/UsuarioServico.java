package br.com.projeto.banco.de.dados.Timusic.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.projeto.banco.de.dados.Timusic.dto.UsuarioAutenticarDto;
import br.com.projeto.banco.de.dados.Timusic.dto.UsuarioDto;
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
	
	
	public UsuarioAutenticarDto autenticar(UsuarioAutenticarDto dto) {
		Optional<UsuarioAutenticarDto> usr = usuarioRepositorio.findByEmail(dto.getEmail());
		
		if(!usr.isPresent()) {
			throw new ErroAutenticacao("Usuario nao encontrado para o email informado");
		} 

		if(usr.get().getSenha().equals(dto.getSenha())) {
			throw new ErroAutenticacao("Senha Invalida");
		}
		
		return usr.get();
	}
	
	@Transactional
	public UsuarioDto cadastrar(UsuarioDto usr) {
		Usuario usuario = 
					new Usuario(null, usr.getNome(), usr.getEmail(), usr.getCpf(), LocalDateTime.now(), usr.getPassword());
		
		return new UsuarioDto(usuarioRepositorio.save(usuario));
	}
}
