package classi;

public class Veicolo {
private String modello;
private String marca;
private String targa;
private char classeVeicolo;
private String classeAmbientale;
private int anno;
private int assi;
private int peso;
private int altezza;

public Veicolo(String modello, String marca, String targa, String classeAmbientale, int anno, int assi, int peso,
		int altezza) {
	//si definisce la classe di appartenenza del Veicolo in base all'altezza e al numero di assi, usando il metodo setClasseVeicolo;
		}

	public void setClasseVeicolo(int assi, int altezza) {
	}

	public char getClasseVeicolo() {
		return this.classeVeicolo;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getClasseAmbientale() {
		return classeAmbientale;
	}

	public void setClasseAmbientale(String classeAmbientale) {
		this.classeAmbientale = classeAmbientale;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getAssi() {
		return assi;
	}

	public void setAssi(int assi) {
		this.assi = assi;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}



}


