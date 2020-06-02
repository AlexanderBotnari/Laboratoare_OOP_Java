package laborator_2;
//clasa parinte
public class SalonDeAutomobile {

	private int numarul;
	private String marca;
	private String model;
	private String culoare;
	private String tara;
	private float pret;
	
	//Constructor fara parametri
	public SalonDeAutomobile() {
		setNumarul(0);
		setMarca("unknown");
		setModel("unknown");
		setCuloare("unknown");
		setTara("unknown");
		setPret(0);
	}
	
	//Constructor cu toti parametrii
	public SalonDeAutomobile(int numarul, String marca, String model, String culoare, String tara, float pret){
		setNumarul(numarul);
		setMarca(marca);
		setModel(model);
		setCuloare(culoare);
		setTara(tara);
		setPret(pret);
	}
	//Constructor cu citiva parametri
	public SalonDeAutomobile(int numarul, String marca, String model) {
		this(numarul, marca, model,"unknown","unknown",0);
	}

	public int getNumarul() {
		return numarul;
	}

	public void setNumarul(int numarul) {
		if( numarul > 0 && numarul <= 1000) {
			this.numarul = numarul;
		}else {
			this.numarul = 0;
		}
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if(marca == null || marca.length() <= 2) {
			this.marca = "unknown";
		}else {
			this.marca = marca;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(model == null || model.length() <= 2) {
			this.model = "unknown";
		}else {
			this.model = model;
		}
	}
    public String getCuloare() {
		return culoare;
	}
    
    public void setCuloare(String culoare) {
		if(culoare == null || culoare.length() < 3 || culoare.length() >= 15) {
				this.culoare = "unknown";
		}else {
			this.culoare = culoare;
		}
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		if(tara == null || tara.length() < 3 || tara.length() > 15) {
			this.tara = "unknown";
		}else {
			this.tara = tara;
		}
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		if(pret >= 100000 && pret <= 2000000) {
			this.pret = pret;
		}else {
			this.pret = 0;
		}
    }
	public void convertLeiToEuro(float pret) {
		float result = pret / 19.5f;
		System.out.println("Ati introdus : "+pret+" lei\n"
				+ "Suma in euro este de : "+result+" euro");
	}
	public void show() {
		System.out.println("Numarul : "+numarul);
		System.out.println("Marca : "+marca);
		System.out.println("Model : "+model);
		System.out.println("Culoare : "+culoare);
		System.out.println("Tara : "+tara);
		System.out.println("Pret : "+pret);
	}
}
