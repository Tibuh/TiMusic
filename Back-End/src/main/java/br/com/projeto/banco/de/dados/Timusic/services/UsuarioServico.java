package br.com.projeto.banco.de.dados.Timusic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.banco.de.dados.Timusic.entities.Usuario;
import br.com.projeto.banco.de.dados.Timusic.repositories.UsuarioRepository;

@Service
public class UsuarioServico {

	@Autowired
	private UsuarioRepository usuarioRepositorio;
	
	public List<Usuario> findAll() {
		return usuarioRepositorio.findAll();
	}
}
