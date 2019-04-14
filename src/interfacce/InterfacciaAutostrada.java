package interfacce;

import classi.Casello;
import classi.Percorso;
import classi.Veicolo;

public interface InterfacciaAutostrada {
	public int Pedaggio(Veicolo v, Percorso p);
	public boolean aggiungiCasello(Casello c);
}
