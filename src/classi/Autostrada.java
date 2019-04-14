package classi;

import java.util.*;

public class Autostrada {
	private int tarUnA, tarUnB, tarUn3, tarUn4, tarUn5;
	private ArrayList<Casello> caselli;
	private static double iva = 0.22;
	private static final double arrotondamento = 0.1;

	//Costruttore di autostrada con un solo casello
	public Autostrada(int tuA, int tuB, int tu3, int tu4, int tu5, Casello c) { 									
		this.tarUnA = tuA;
		this.tarUnB = tuB;
		this.tarUn3 = tu3;
		this.tarUn4 = tu4;
		this.tarUn5 = tu5;
		caselli.add(c);
	}
	
	//Costruttore di autostrada con un array di caselli
	public Autostrada(int tuA, int tuB, int tu3, int tu4, int tu5, ArrayList<Casello> caselli) { 					
		this.tarUnA = tuA;
		this.tarUnB = tuB;
		this.tarUn3 = tu3;
		this.tarUn4 = tu4;
		this.tarUn5 = tu5;
		this.caselli = caselli;
	}
	
	//Costruttore di autostrada con cui settare nuovo valore di iva
	public Autostrada(double iva, int tuA, int tuB, int tu3, int tu4, int tu5, ArrayList<Casello> caselli) {		
		this.tarUnA = tuA;
		this.tarUnB = tuB;
		this.tarUn3 = tu3;
		this.tarUn4 = tu4;
		this.tarUn5 = tu5;
		this.caselli = caselli;
		Autostrada.iva = iva/100;
	}

	//Metodo per calcolare il pedaggio
	public int Pedaggio(Veicolo v, Percorso p) {
	}
	
	//Metodo per aggiungere un casello all'autostrada
	public boolean aggiungiCasello(Casello c) {																		
	}

	//Metodi get e set
	public int getTarUnA() {
		return tarUnA;
	}

	public void setTarUnA(int tarUnA) {
		this.tarUnA = tarUnA;
	}

	public int getTarUnB() {
		return tarUnB;
	}

	public void setTarUnB(int tarUnB) {
		this.tarUnB = tarUnB;
	}

	public int getTarUn3() {
		return tarUn3;
	}

	public void setTarUn3(int tarUn3) {
		this.tarUn3 = tarUn3;
	}

	public int getTarUn4() {
		return tarUn4;
	}

	public void setTarUn4(int tarUn4) {
		this.tarUn4 = tarUn4;
	}

	public int getTarUn5() {
		return tarUn5;
	}

	public void setTarUn5(int tarUn5) {
		this.tarUn5 = tarUn5;
	}

	public ArrayList<Casello> getCaselli() {
		return caselli;
	}

	public void setCaselli(ArrayList<Casello> caselli) {
		this.caselli = caselli;
	}

	public static double getIva() {
		return iva;
	}

	public static void setIva(double iva) {
		Autostrada.iva = iva;
	}

}
	

