package com.manolo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manolo {

	private List<String> repertorio;
	private Random random;
	private int aleatorio;

	public Manolo() {
		super();
		random = new Random();
		repertorio = new ArrayList<String>();
		iniciarRepertorio();
	}

	/**
	 * Manolo se toma unos carajillos antes de iniciar el repertorio
	 */
	private void iniciarRepertorio() {
		repertorio.add("oe eoeoe oeoeeo ee. Egpaña!!!! ");
		repertorio.add("Mesi paga");
		repertorio.add("Vamos con el Tiki-Taka");
		repertorio.add("Ala Madrid");
		repertorio.add("Raul selección, Shakira es de Todos ");
		repertorio.add("Arbitro hoy tu de negro, mañana tu familia");
	}

	/* Metodos para el WS */

	public String canta() {
		aleatorio = random.nextInt(repertorio.size());
		return repertorio.get(aleatorio);

	}

	public Cancion cancionActual() {
		Cancion resul = new Cancion("sin nombre");
		resul.setCodigo(aleatorio);
		resul.setTitulo(repertorio.get(aleatorio));
		return resul;
	}

}
