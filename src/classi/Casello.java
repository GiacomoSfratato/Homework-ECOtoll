package classi;

public class Casello {
private String nome;
private int chilometro;

	public Casello(String nome, int chilometro, Autostrada a) {
		this.nome = nome;
		this.chilometro = chilometro;
		a.addCasello(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getChilometro() {
		return chilometro;
	}

	public void setChilometro(int chilometro) {
		this.chilometro = chilometro;
	}

}
