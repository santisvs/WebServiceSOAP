package com.manolo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manolo {

	private List<Cancion> repertorio;
	private Random random;
	private int aleatorio;

	public Manolo() {
		super();
		random = new Random();
		repertorio = new ArrayList<Cancion>();
		iniciarRepertorio();
	}

	/**
	 * Manolo se toma unos carajillos antes de iniciar el repertorio
	 */
	private void iniciarRepertorio() {
		Cancion c = new Cancion();
		c.setCodigo(0);
		c.setTitulo("oe eoeoe oeoeeo ee. Egpaña!!!!");
		repertorio.add(c);

		c = new Cancion();
		c.setCodigo(1);
		c.setTitulo("Vamos con el Tiki-TAKA");
		repertorio.add(c);

		c = new Cancion();
		c.setCodigo(2);
		c.setTitulo("Messi seleccion");
		repertorio.add(c);

		c = new Cancion();
		c.setCodigo(3);
		c.setTitulo("Arriba con el balon");
		repertorio.add(c);

	}

	/* Metodos para el WS */

	public String canta() {
		aleatorio = random.nextInt(repertorio.size());
		return repertorio.get(aleatorio).getTitulo();
	}

	public Cancion cancionActual() {
		return repertorio.get(aleatorio);
	}

	public Cancion[] repertorio() {
		return repertorio.toArray(new Cancion[repertorio.size()]);
	}

}
