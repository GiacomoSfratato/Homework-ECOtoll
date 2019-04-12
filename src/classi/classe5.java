package classi;

public class classe5 extends Veicolo{

	public classe5(String modello, String marca, String targa, String classeAmbientale, int anno, int assi, double peso, double altezza) throws Exception{
		super(modello, marca, targa, classeAmbientale, anno, assi, peso, altezza);
		if(this.assi < 5) {
			System.out.println("Appartengono alla classe 5 solamente i veicoli con 5 o più assi.");
			throw new Exception();
		}
	}
}
