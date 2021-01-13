package br.com.projeto.banco.de.dados.Timusic.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.projeto.banco.de.dados.Timusic.dto.UsuarioDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode @ToString
@Table(name = "tb_usr")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 150)
	private String nome;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@Column(nullable = false, length = 11)
	private String cpf;
	
	@Column
	private LocalDateTime dataCadastro;
	
	@Column(nullable = false, length = 20)
	private String password;
	
}
