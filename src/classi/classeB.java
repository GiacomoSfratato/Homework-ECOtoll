package classi;

public class classeB extends Veicolo{

	public classeB(String modello, String marca, String targa, String classeAmbientale, int anno, int assi, double peso, double altezza) throws Exception{
		super(modello, marca, targa, classeAmbientale, anno, assi, peso, altezza);
		if(this.assi != 2) {
			System.out.println("Appartengono alla classe B solamente i veicoli a 2 assi.");
			throw new Exception();
		} else {
			if(this.altezza > 1.3) {
				System.out.println("Appartengono alla classe B solamente i veicoli alti più di 1,3 metri.");
				throw new Exception();
			}
		}
	}
}