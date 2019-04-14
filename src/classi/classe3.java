package classi;

public class classe3 extends Veicolo{

	//costruttore
	public classe3(String modello, String marca, String targa, String classeAmbientale, int anno, int assi, double peso, double altezza) throws Exception{
		super(modello, marca, targa, classeAmbientale, anno, assi, peso, altezza);
		if(this.assi != 3) {
			System.out.println("Appartengono alla classe 3 solamente i veicoli a 3 assi.");
			throw new Exception();
		}
	}
}
