package laborator_2;

public class AutoCutieAutomataViteze extends SalonDeAutomobile{
    
	private  int numarViteze;
	private  int numarVitezeReverse;
	
	public AutoCutieAutomataViteze() { super(); }

	public AutoCutieAutomataViteze(int numarul, String marca, String model, String culoare, 
			String tara, float pret, int numarViteze, int numarVitezeReverse) {
		super(numarul, marca, model, culoare ,tara,pret);
		setNumarViteze(numarViteze);
		setNumarVitezeReverse(numarVitezeReverse);
	}
	public AutoCutieAutomataViteze(int numarul, String marca, String model,int numarViteze, int numarVitezeReverse) { 
		this(numarul, marca, model, "unknown", "unknown", 0, numarViteze, numarVitezeReverse);
	}

	public int getNumarViteze() {
		return numarViteze;
	}

	public void setNumarViteze(int numarViteze) {
		if(numarViteze > 0 && numarViteze < 8) {
			this.numarViteze = numarViteze;
		}else {
			this.numarViteze = 0;
		}
	}

	public int getNumarVitezeReverse() {
		return numarVitezeReverse;
	}

	public void setNumarVitezeReverse(int numarVitezeReverse) {
		if(numarVitezeReverse > 0 && numarVitezeReverse < 8) {
			this.numarVitezeReverse = numarVitezeReverse;
		}else {
			this.numarVitezeReverse = 0;
		}
	}
	public void show(){
        super.show();
        System.out.println("Numar viteze : "+numarViteze);
        System.out.println("Numar viteze reverse : "+numarVitezeReverse);
	}
	
}
