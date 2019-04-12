package classi;

import java.util.*;

public class Autostrada {
	private int tarUnA, tarUnB, tarUn3, tarUn4, tarUn5;
	private ArrayList<Casello> caselli;
	private static double iva = 0.22;

	public Autostrada(int tuA, int tuB, int tu3, int tu4, int tu5, ArrayList<Casello> caselli) {
		this.tarUnA = tuA;
		this.tarUnB = tuB;
		this.tarUn3 = tu3;
		this.tarUn4 = tu4;
		this.tarUn5 = tu5;
		this.caselli = caselli;
	}
	
	public Autostrada(double iva, int tuA, int tuB, int tu3, int tu4, int tu5, ArrayList<Casello> caselli) {
		this.tarUnA = tuA;
		this.tarUnB = tuB;
		this.tarUn3 = tu3;
		this.tarUn4 = tu4;
		this.tarUn5 = tu5;
		this.caselli = caselli;
		Autostrada.iva = iva/100;
	}

	public int Pedaggio(Veicolo v, int arrotondamento, Percorso p) {
		
	}
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int i) {
		iva = i;
	}
	
	public int getTuA() {
		return tuA;
	}

	public void setTuA(int tuA) {
		this.tuA = tuA;
	}

	public int getTuB() {
		return tuB;
	}

	public void setTuB(int tuB) {
		this.tuB = tuB;
	}

	public int getTu3() {
		return tu3;
	}

	public void setTu3(int tu3) {
		this.tu3 = tu3;
	}

	public int getTu4() {
		return tu4;
	}

	public void setTu4(int tu4) {
		this.tu4 = tu4;
	}

	public int getTu5() {
		return tu5;
	}

	public void setTu5(int tu5) {
		this.tu5 = tu5;
	}

	public ArrayList<Casello> getCaselli() {
		return caselli;
	}

	public void setCaselli(ArrayList<Casello> caselli) {
		this.caselli = caselli;
	}
	
	public boolean addCasello(Casello c) {
	}

}
	

