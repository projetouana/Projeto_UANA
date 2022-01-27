package org.generation.projeto_uana.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Size(max = 255, message = "O atributo IMG_URL permite no máximo 255 caracteres")  //PErguntar sobre o tamanho da imagem
	private String img_url;
	
	@NotBlank(message = "O atributo Texto é obrigatório e não aceita espaço vazio")
	@Size(max = 3000, message = "O atributo Texto permite no máximo 3000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private Date dat_public = new java.sql.Date(System.currentTimeMillis());
	
	@Size(max = 80, message = "O atributo Contato permite no máximo 80 caracteres")
	private String contato;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	
	// Getters e Setters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDat_public() {
		return dat_public;
	}

	public void setDat_public(Date dat_public) {
		this.dat_public = dat_public;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
