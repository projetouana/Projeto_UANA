package org.generation.projeto_uana.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O atributo Nome é obrigatório e não aceita espaço vazio")
	@Size(min = 3, max = 255, message = "O atributo Nome permite no máximo 255 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo Email é obrigatório e não aceita espaço vazio")
	@Size(max = 255, message = "O atributo Email permite no máximo 255 caracteres")
	private String email;
	
	@NotBlank(message = "O atributo Senha é obrigatório e não aceita espaço vazio")
	@Size(min = 8, max = 255, message = "O atributo Senha exige no minimo 8 caracteres e no máximo 255 caracteres")
	private String senha;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	public long getId() {

		return id;
	}

	public void setId(long id) {

		this.id = id;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public String getSenha() {

		return senha;
	}

	public void setSenha(String senha) {

		this.senha = senha;
	}

	public List<Postagem> getPostagem() {

		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {

		this.postagem = postagem;
	}
	
	
}
