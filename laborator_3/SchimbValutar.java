package laborator_3;
//clasa abstracta
abstract class SchimbValutar implements SchimbInterface{
	//interfata se va mosteni de clasele-copil
	double suma;
	double curs;
	
	public SchimbValutar(double suma, double curs) {
		this.suma = suma;
		this.curs = curs;
	}
}

class SchimbLeiToEuro extends SchimbValutar {

	public SchimbLeiToEuro(double suma, double curs) {
		super(suma, curs);
		
	}
	
	//Supraincarcam conversie() pentru SchimbLeiToEuro
	@Override
	public double conversie() {
		System.out.print("Suma convertita din lei in euro este: ");
		return suma / curs;
	}   
}

class SchimbEuroToLei extends SchimbValutar{

	public SchimbEuroToLei(double suma, double curs) {
		super(suma, curs);
	}
	
	//Supraincarcam conversie() pentru SchimbEuroToLei
	@Override
	public double conversie() {
		System.out.print("Suma convertita din euro in lei este: ");
		return suma * curs;
	}
}