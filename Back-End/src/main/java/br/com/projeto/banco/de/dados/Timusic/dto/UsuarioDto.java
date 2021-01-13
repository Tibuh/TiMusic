package br.com.projeto.banco.de.dados.Timusic.dto;

import java.time.LocalDateTime;

import br.com.projeto.banco.de.dados.Timusic.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {

	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private LocalDateTime dataCadastro;
	private String password;
	
	public UsuarioDto(Usuario usr) {
		id = usr.getId();
		nome = usr.getNome();
		email = usr.getEmail();
		cpf = usr.getCpf();
		dataCadastro = usr.getDataCadastro();
		password = usr.getPassword();
	}
	
}
