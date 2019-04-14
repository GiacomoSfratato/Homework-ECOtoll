package classi;

import interfacce.*;
import java.util.*;

public class Autostrada implements InterfacciaAutostrada,Comparable<Autostrada> {
	private double tarUnA, tarUnB, tarUn3, tarUn4, tarUn5;
	private ArrayList<Casello> caselli;
	private static double iva = 0.22;
	private static final double arrotondamento = 0.1;

	public Autostrada(double tuA, double tuB, double tu3, double tu4, double tu5) { 									
		this.tarUnA = tuA;
		this.tarUnB = tuB;
		this.tarUn3 = tu3;
		this.tarUn4 = tu4;
		this.tarUn5 = tu5;
	}
	
	//Costruttore di autostrada con un array di caselli
	public Autostrada(double tuA, double tuB, double tu3, double tu4, double tu5, ArrayList<Casello> caselli) { 					
		this.tarUnA = tuA;
		this.tarUnB = tuB;
		this.tarUn3 = tu3;
		this.tarUn4 = tu4;
		this.tarUn5 = tu5;
		this.caselli = caselli;
	}
	
	//Costruttore di autostrada con cui settare nuovo valore di iva
	public Autostrada(double iva, double tuA, double tuB, double tu3, double tu4, double tu5, ArrayList<Casello> caselli) {		
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

	//metodi get e set
	public double getTarUnA() {
		return tarUnA;
	}

	public void setTarUnA(double tarUnA) {
		this.tarUnA = tarUnA;
	}

	public double getTarUnB() {
		return tarUnB;
	}

	public void setTarUnB(double tarUnB) {
		this.tarUnB = tarUnB;
	}

	public double getTarUn3() {
		return tarUn3;
	}

	public void setTarUn3(double tarUn3) {
		this.tarUn3 = tarUn3;
	}

	public double getTarUn4() {
		return tarUn4;
	}

	public void setTarUn4(double tarUn4) {
		this.tarUn4 = tarUn4;
	}

	public double getTarUn5() {
		return tarUn5;
	}

	public void setTarUn5(double tarUn5) {
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

	public static double getArrotondamento() {
		return arrotondamento;
	}
	
	@Override
	public boolean equals(Object o) {		
	}
	
	@Override
	public String toString() {	
	}
	
	public int compareTo(Autostrada a) {	
	}
}