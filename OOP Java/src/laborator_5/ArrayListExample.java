package laborator_5;
//importam clasa din java.util
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//creeam un obiect al clasei ArrayList
		ArrayList <SalonDeAutomobile> auto = new ArrayList <SalonDeAutomobile> ();
		
		//adaugam obiecte in lista cu ajutorul metodei add()
		auto.add(new SalonDeAutomobile (1,"BMW","Seria 7","Negru","Germania",200000));
		auto.add(new SalonDeAutomobile (2,"Mercedes","G65","Negru","Germania",250000));
		auto.add(new SalonDeAutomobile (3,"Toyota","Land Cruiser","Alb","Japonia",1000000));
		auto.add(new SalonDeAutomobile (4,"Ford","Mustang","Galben","SUA",2000000));
		auto.add(new SalonDeAutomobile (5,"Honda","CRV2019","Argintiu","Japonia",500000));
		auto.add(new SalonDeAutomobile (6,"Aston Martin","Series 2016","Gri","GBR",1300000));
		
		//putem sterge cu ajutorul metodei remove() obiecte din lista indicind indexul
		auto.remove(1);
		
	    System.out.println(auto);//Afisam obiectele din lista
		//putem afisa aparte obiectul pe aceea pozitie care sta in lista
        System.out.println(auto.get(4));
        //cu ajutorul metodei size() aflam cite elemente contine lista
        System.out.println("Nr de elemente in lista este : "+auto.size());
        System.out.println();
        //utilizarea Iteratorului
        Iterator <SalonDeAutomobile> it = auto.iterator();
        SalonDeAutomobile value = it.next();
        //la fiecare chemare it.next() metoda ne reintoarce cite o valoare
        System.out.println(value);
        
        System.out.println();
        //folosim iteratia in ciclu pentru a citi valorile listei ramase
        while(it.hasNext()) {
        	 value = it.next();
        	 System.out.println(value);
        	 }
        //utilizarea comparatorului dupa pret 
        PretComparator myPretComparator = new PretComparator();
   	    auto.sort(myPretComparator);
   	    System.out.println("Sorted : ");
   	       for (SalonDeAutomobile salonDeAutomobile : auto) {
			System.out.println(salonDeAutomobile);
		   }
	}

}
class SalonDeAutomobile implements Comparable<SalonDeAutomobile>{

	private int numarul;
	private String marca;
	private String model;
	private String culoare;
	private String tara;
	private float pret;
	
	//Constructor fara parametri
	public SalonDeAutomobile() {}
	
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
		this(numarul, marca, model,null,null,0);
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
		if(culoare == null || culoare.length() <= 3 || culoare.length() >= 15) {
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

	@Override
	public String toString() {
		return "Automobil : [numarul=" + numarul + ", marca=" + marca + ", model=" + model + ", culoare="
				+ culoare + ", tara=" + tara + ", pret=" + pret + "]";
	}

	@Override
	public int compareTo(SalonDeAutomobile o) {
		
		if(this.pret == o.pret) {
			return 0;
		}else if(this.pret < o.pret) {
			return -1;
		}else {
			return 1;
		}
		
	}
}
	
class PretComparator implements Comparator<SalonDeAutomobile>{

	@Override
	public int compare(SalonDeAutomobile o1, SalonDeAutomobile o2) {
		
		 if (o1.getPret() == o2.getPret()) {
	            return 0;
	        }
	        if (o1.getPret() > o2.getPret()) {
	            return 1;
	        }
	        else {
	            return -1;
	        }
	}
}
 

