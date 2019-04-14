package classi;

public class classe4 extends Veicolo{
	
	//costruttore
	public classe4(String modello, String marca, String targa, String classeAmbientale, int anno, int assi, double peso, double altezza) throws Exception{
		super(modello, marca, targa, classeAmbientale, anno, assi, peso, altezza);
		if(this.assi != 4) {
			System.out.println("Appartengono alla classe 4 solamente i veicoli a 4 assi.");
			throw new Exception();
		}
	}
}
