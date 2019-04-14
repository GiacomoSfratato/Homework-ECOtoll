package classi;

public class ProvaVeicolo {

	public static void main(String[] args) throws Exception{
		Veicolo peugeot = new classeA("Peugeot 2008", "Peugeot", "BM201CZ", "Eco", 2011, 2, 1200, 1.3); 	//Creo un nuovo veicolo
		Veicolo kia = new classeA("Kia Picanto", "Kia", "CW133BX", "Eco", 2009, 2, 900, 1.2); 				//Creo un nuovo veicolo
		
		Autostrada A24 = new Autostrada(0.07231,0.07401,0.09862,0.14864,0.17530);							//Creo una nuova autostrada
		
		Casello aquilaEst = new Casello("Aquila Est",106.7, A24);											//Creo tre caselli che appartengono all'autostrada
		Casello aquilaOvest = new Casello("Aquila Ovest",101.0,A24);					
		Casello assergi = new Casello("Assergi", 116.8, A24);
		
		System.out.println(A24.Pedaggio(peugeot, new Percorso(aquilaEst,aquilaOvest)));
		
		System.out.println(A24.Pedaggio(kia, new Percorso(aquilaOvest, assergi)));
	}

}
