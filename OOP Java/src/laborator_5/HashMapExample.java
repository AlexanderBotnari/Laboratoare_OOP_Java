package laborator_5;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, SalonDeAutomobile> numberAndAuto = new HashMap<>();
		
		//adaugam o cheie si o valoare cu ajutorul metodei put()
		numberAndAuto.put(1, new SalonDeAutomobile (1,"BMW","Seria 7","Negru","Germania",200000));
		numberAndAuto.put(2, new SalonDeAutomobile (2,"Lada","Niva","Albastra","Federatia Rusa",60000));
		numberAndAuto.put(3, new SalonDeAutomobile (3,"Dacia","Logan","Rosie","Romania",80000));
		numberAndAuto.put(4, new SalonDeAutomobile (4,"Renault","Megane","Argintiu","Franta",120000));
		numberAndAuto.put(5, new SalonDeAutomobile (5,"Alfa_Romeo","2010","Alba","Italia",90000));
		numberAndAuto.put(1, new SalonDeAutomobile (1,"BMW","Seria 7","Negru","Germania",200000));//se repeta cheia si se suprascrie valoarea
		
		System.out.println(numberAndAuto.get(1));//accesam elementul cu prima cheie prin get()
		
		//Stergem elementul cu ajutorul metodei remove
		numberAndAuto.remove(2);
		
		System.out.println(numberAndAuto);//Afisam elementele HashMap
		
		System.out.println(numberAndAuto.containsKey(11));//verificam daca avem asa cheie cu containsKey()
		System.out.println(numberAndAuto.containsValue("Renault"));//verificam daca avem asa valoare cu containsValue() 
	
	}

}
