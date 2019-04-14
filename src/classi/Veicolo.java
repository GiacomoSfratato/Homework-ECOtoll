package classi;

public abstract class Veicolo implements Comparable<Veicolo>{
	//variabili
	protected String modello, marca, targa, classeAmbientale;
	protected int anno, assi;
	protected double peso, altezza;
	
	//costruttore
	public Veicolo(String modello, String marca, String targa, String classeAmbientale, int anno, int assi, double peso, double altezza) {
	this.modello = modello;
	this.marca = marca;
	this.targa = targa;
	this.classeAmbientale = classeAmbientale;
	this.assi = assi;
	this.anno = anno;
	this.peso = peso;
	this.altezza = altezza;
	}
	
	//metodi get() e set()
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	@Override
	public boolean equals(Object o) {		
	}
	
	@Override
	public String toString() {	
	}
	
	public int compareTo(Veicolo v) {	
	}

}


