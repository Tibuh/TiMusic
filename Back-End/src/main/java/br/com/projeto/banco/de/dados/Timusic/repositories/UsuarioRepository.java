package br.com.projeto.banco.de.dados.Timusic.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.projeto.banco.de.dados.Timusic.dto.UsuarioAutenticarDto;
import br.com.projeto.banco.de.dados.Timusic.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Transactional(readOnly = true)
	public Optional<UsuarioAutenticarDto> findByEmail(String email);
	
}
