package classi;

public class Casello implements Comparable<Casello>{
private String nome;
private double chilometro;

	//costruttore
	public Casello(String nome, double chilometro, Autostrada a) {
		this.nome = nome;
		this.chilometro = chilometro;
		a.aggiungiCasello(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getChilometro() {
		return chilometro;
	}

	public void setChilometro(double chilometro) {
		this.chilometro = chilometro;
	}
	
	@Override
	public boolean equals(Object o) {		
	}
	
	@Override
	public String toString() {	
	}
	
	public int compareTo(Casello c) {	
	}

}
