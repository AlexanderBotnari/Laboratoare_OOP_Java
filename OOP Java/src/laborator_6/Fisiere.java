package laborator_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class Fisiere {

	public static void main(String[] args) throws IOException {
		
		SalonDeAutomobile automobil1 = new SalonDeAutomobile(1,"BMW","Seria 7","Negru","Germania",200000);
		SalonDeAutomobile automobil2 = new SalonDeAutomobile(2,"Lambo","Aventador");
	
		 try {
	            FileOutputStream file = new FileOutputStream(new File("myObjects.txt"));
	            ObjectOutputStream object = new ObjectOutputStream(file);
       //adaugam obiecte in fisierul existent
	   SalonDeAutomobile automobil3 = new SalonDeAutomobile(3,"Honda","crv","argintie","japonia",190000);
	   SalonDeAutomobile automobil4 = new SalonDeAutomobile(4,"Jaguar","XF 2017","Negru","GBR",2000000);
	   SalonDeAutomobile automobil5 = new SalonDeAutomobile(5,"Porsche","Panamera","Galben","Germania",1000000);         
	            
	       //Scriem obiectele in fisier cu ajutorul metodei writeObject
	            object.writeObject(automobil1);
	            object.writeObject(automobil2);
	            object.writeObject(automobil3);
	            object.writeObject(automobil4);
	            object.writeObject(automobil5);

	            //inchidem fluxul de scriere a obiectul si fisierul
	            object.close();
	            file.close();

	            FileInputStream fileIn = new FileInputStream(new File("myObjects.txt"));
	            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

	            //citim obiectele din fisier cu metoda readObject() si le atribuim
	            SalonDeAutomobile object1 = (SalonDeAutomobile) objectIn.readObject();
	            SalonDeAutomobile object2 = (SalonDeAutomobile) objectIn.readObject();
	            SalonDeAutomobile object3 = (SalonDeAutomobile) objectIn.readObject();
	            SalonDeAutomobile object4 = (SalonDeAutomobile) objectIn.readObject();
	            SalonDeAutomobile object5 = (SalonDeAutomobile) objectIn.readObject();
	            
	            //modificarea datelor cu ajutorul metodei setCuloare()
	            object3.setCuloare("Negru");

	            //afisarea obiectelor care corespund conditie
	            if(object1.getCuloare().contentEquals("Negru")) 
	                System.out.println(object1.toString());
	            if(object2.getCuloare().contentEquals("Negru"))
	                System.out.println(object2.toString());
	            if(object3.getCuloare().contentEquals("Negru"))
	                System.out.println(object3.toString());
	            if(object4.getCuloare().contentEquals("Negru"))
		            System.out.println(object4.toString());
	            if(object5.getCuloare().contentEquals("Negru"))
	            	System.out.println(object5.toString());
	            else 
	            	System.out.println("Sunt afisate doar automobile de culoare : Negru!");
	            
	            //inchidem fluxul de citire si fisierul 
	            objectIn.close();
	            fileIn.close();

	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Error initializing stream");
	        } catch (ClassNotFoundException e) {
	            System.err.println("Class error!");
	        }finally {
	        	//inchiderea programului
	        	System.out.println("Va multumim ca ati ales serviciile noastre!");
	        }
	}	         
}
class SalonDeAutomobile implements Serializable{

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
		if(culoare == null || culoare.length() <= 3 || culoare.length() >= 15 ) {
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
		return "SalonDeAutomobile [numarul=" + numarul + ", marca=" + marca + ", model=" + model + ", culoare="
				+ culoare + ", tara=" + tara + ", pret=" + pret + "]";
		}
}