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
@Table(name = "tb_temas")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "O atributo assunto não aceita apenas espaços vazios.")
	@Size(max = 80, message = "O atributo assunto máximo de 80 caracteres.")
	private String assunto;

	private long relevancia;

	@NotBlank(message = "O atributo descrição não aceita apenas espaços vazios.")
	@Size(max = 100, message = "O atributo descricao máximo de 100 caracteres.")
	private String descricao;
	
	@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem;

	// Getters e Setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public long getRelevancia() {
		return relevancia;
	}

	public void setRelevancia(long relevancia) {
		this.relevancia = relevancia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	

}
