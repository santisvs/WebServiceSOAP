package com.manolo;

import java.io.Serializable;

public class Cancion implements Serializable {

	private static final long serialVersionUID = 1L;

	private String titulo;
	private int codigo;

	public Cancion(String titulo) {
		super();
		this.codigo = -1;
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
