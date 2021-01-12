package br.com.projeto.banco.de.dados.Timusic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class UsuarioDto {

	private String nome;
	
	private String email;
	
	private String senha;
}
