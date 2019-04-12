package classi;

public class classeA extends Veicolo{

	public classeA(String modello, String marca, String targa, String classeAmbientale, int anno, int assi, double peso, double altezza) throws Exception{
		super(modello, marca, targa, classeAmbientale, anno, assi, peso, altezza);
		if(this.assi > 2) {
			System.out.println("Appartengono alla classe A solamente i veicoli a 1 o 2 assi.");
			throw new Exception();
		} else {
			if(this.assi==2 && this.altezza > 1.3) {
				System.out.println("I veicoli a 2 assi appartengono alla classe A solamente se alti al massimo 1,3 metri.");
				throw new Exception();
			}
		}
	}
}
