package laborator_3;

public class ClaseAbstr {

	public static void main(String[] args) {
		
		//SchimbValutar schimb1 = new SchimbValutar();eroare deoarece nu putem crea obiecte a unei clase abstracte
        
		SchimbLeiToEuro schimb1 = new SchimbLeiToEuro(10000,19.5);
		SchimbEuroToLei schimb2 = new SchimbEuroToLei(500,19.5);
		
		SchimbValutar valuta;
		valuta = schimb1;//facem referință la un obiect de tip SchimbLeiToEuro
		System.out.println(valuta.conversie());
		
		valuta = schimb2;//facem referință la un obiect de tip SchimbEuroToLei 
		System.out.println(valuta.conversie());
		
	}

}
