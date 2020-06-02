package laborator_5;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
	    //creeam si adaugam elemente 
		TreeSet <SalonDeAutomobile> auto = new TreeSet <SalonDeAutomobile>();  
		  auto.add(new SalonDeAutomobile (1,"Volvo","XC90","Negru","Suedia",500000));  
		  auto.add(new SalonDeAutomobile (2,"Audi","A7 TFSI","Orange","Germania",900000));  
		  auto.add(new SalonDeAutomobile (3,"Rolls-Royce","Black Mate Edition","Negru-Mate","GBR",2000000));  
		  auto.add(new SalonDeAutomobile (4,"Bentley","Continental","Alb","GBR",2000000));
		  auto.add(new SalonDeAutomobile (5,"Skoda","Superb","Argintie","Suedia",600000));
		  
		   //cu ajutorul metodei size() aflam cite elemente contine lista
		  System.out.println("Nr de elemente : "+auto.size());
		  System.out.println(auto);
		
		  //cu ajutorul metodei first() aflam care e primul element
		  System.out.println("Primul element este : "+auto.first());
		  
		  //cu ajutorul metodei last() aflam care e ultimul element
		  System.out.println("Ultimul element este :"+auto.last());
		  
		  //traversam elementele cu ajutorul unui ciclu  
		  Iterator<SalonDeAutomobile> it = auto.iterator();  
		  while(it.hasNext()){  
		   System.out.println(it.next());  
		  }  
		  
	}

}
