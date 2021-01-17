package com.game.start.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "libro")
public class Libro {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long idlibro;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "autor")
	private String autor;
	
	@Column(name = "n_paginas")
	private int n_paginas;
	
	@Column(name = "editorial")
	private String editorial;
	
	@Column(name = "img")
	private String img;
	
	@Column(name = "categoria_idcategoria")
	private int categoria_idcategoria;
	
	@Column(name = "pdf")
	private String pdf;

	public Long getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(Long idlibro) {
		this.idlibro = idlibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getN_paginas() {
		return n_paginas;
	}

	public void setN_paginas(int n_paginas) {
		this.n_paginas = n_paginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getCategoria_idcategoria() {
		return categoria_idcategoria;
	}

	public void setCategoria_idcategoria(int categoria_idcategoria) {
		this.categoria_idcategoria = categoria_idcategoria;
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}
	
	
}
