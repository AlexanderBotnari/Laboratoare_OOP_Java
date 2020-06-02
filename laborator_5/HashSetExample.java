package laborator_5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<SalonDeAutomobile> auto = new HashSet<SalonDeAutomobile>();

        // adaugam elemente cu metoda add()
        auto.add(new SalonDeAutomobile (1,"Mercedes","G65","Negru","Germania",250000));
        auto.add(new SalonDeAutomobile (2,"Mazda","Series 5","Albastru","Japonia",350000));
        auto.add(new SalonDeAutomobile (3,"Porsche","Cayenne","Alb","Germania",2000000));
        auto.add(new SalonDeAutomobile (4,"Smart","Mini3s","Gri","China",500000));
        auto.add(new SalonDeAutomobile (5,"Peugeut","407","Argintiu","Franta",100000));
        
        System.out.println("List size is : "+auto.size());

        // afisam elemetele HashSet 
        System.out.println(auto);

        // traversam elementele HashSet cu ajutorul iteratorului
        System.out.println("Iterating over list:");
        Iterator<SalonDeAutomobile> it = auto.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        

	}

}
