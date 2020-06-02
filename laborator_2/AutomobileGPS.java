package laborator_2;

public class AutomobileGPS extends AutoCutieAutomataViteze{
        
	private String tipGPS;

	public AutomobileGPS() {
		super();
		setTipGPS("unknown");
	}

	public AutomobileGPS(int numarul, String marca, String model, String culoare, 
			String tara, float pret, int numarViteze, int numarVitezeReverse, String tipGPS) {
		super(numarul, marca, model, culoare ,tara ,pret, numarViteze, numarVitezeReverse);
		setTipGPS(tipGPS);
	}

	public AutomobileGPS(int numarul, String marca, String model,String tipGPS) {
		this(numarul, marca, model,"unknown", "unknown", 0, 0, 0, tipGPS);
	}

	public String getTipGPS() {
		return tipGPS;
	}

	public void setTipGPS(String tipGPS) {
		if(tipGPS == null || tipGPS.length() <= 2) {
			this.tipGPS = "unknown";
		}else {
			this.tipGPS = tipGPS;
		}
	}
	public void show(){
        super.show();
        System.out.println("Tip GPS : "+tipGPS);
	}
	
}
