package classi;

public class Percorso {
private Casello inizio;
private Casello fine;
private int lunghezza;
	public Percorso(Casello inizio, Casello fine) {
		this.inizio = inizio;
		this.fine = fine;
		this.lunghezza = Math.abs(this.inizio.getChilometro() - this.fine.getChilometro()); //lunghezza è il valore assoluto della differenza fra i chilometri dei caselli
	}
	
	public Casello getInizio() {
		return inizio;
	}
	public void setInizio(Casello inizio) {
		this.inizio = inizio;
	}
	public Casello getFine() {
		return fine;
	}
	public void setFine(Casello fine) {
		this.fine = fine;
	}
	public int getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}

}
