package br.com.projeto.banco.de.dados.Timusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.banco.de.dados.Timusic.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
