package laborator_5;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, SalonDeAutomobile > auto = new TreeMap<>();
		//adaugam elemente TreeMap cu metoda put()
		auto.put(10000,new SalonDeAutomobile (1,"BMW","Seria 7","Negru","Germania",200000));
		auto.put(32000,new SalonDeAutomobile (2,"BMW","x5 Restyle","Negru","Germania",1000000));
		auto.put(100000,new SalonDeAutomobile (3,"Bentley","2018","Gri","GBR",2000000));
		auto.put(80000, new SalonDeAutomobile (4,"Toyota","Land Cruiser","ALB","Japonia",1600000));
		auto.put(19000, new SalonDeAutomobile (5,"Honda","CRV2019","Argintiu","Japonia",400000));
		
		System.out.println("Map size is : "+auto.size());
		System.out.println(auto.get(10000));//prin metoda get() aflam valoarea 
		auto.remove(19000);//cu metoda remove() stergem elemente
		 
		System.out.println(auto);//afisam cheia si valoarea elementelor
		
		System.out.println(auto.containsKey(32000));//verificam daca avem asa cheie cu containsKey()
		
	}

}
