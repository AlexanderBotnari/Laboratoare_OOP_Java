package laborator_5;
import java.util.Collections;
import java.util.Iterator;
//importam clasa din java.util
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		//creeam un obiect al clasei LinkedList
		LinkedList <SalonDeAutomobile> auto = new LinkedList <SalonDeAutomobile> ();
		
		//adaugam obiecte in lista cu ajutorul metodei add()
        auto.add(new SalonDeAutomobile (1,"Lamborghini","Gallardo","Galben","Brazilia",2000000));
        auto.add(new SalonDeAutomobile (2,"VolksWagen","Golf 5","Alb","Germania",200000));
        auto.add(new SalonDeAutomobile (3,"Mitsubishi","Lancer","Albastru","Japonia",100000));
        auto.add(new SalonDeAutomobile (4,"Chevrolet","Camaro","Galben","SUA",1500000));
        auto.add(new SalonDeAutomobile (5,"Dacia","Duster","Cafeniu","Romania",160000));
        
        //putem sterge cu ajutorul metodei remove() obiecte din lista indicind indexul
        auto.remove(4);
        Collections.sort(auto);//sortam automat obiectele din colectie in ordine alfabetica in cazul nostru
        
        System.out.println(auto);//Afisam obiectele din lista
        //putem afisa aparte obiectul pe aceea pozitie care sta in lista
        System.out.println(auto.get(0));
        
        //cu ajutorul metodei size() aflam cite elemente contine lista
        System.out.println("Nr de elemente in lista este : "+auto.size());
        System.out.println();
        //utilizarea Iteratorului
        Iterator <SalonDeAutomobile> it = auto.iterator();
        SalonDeAutomobile value = it.next();
        //la fiecare chemare it.next() metoda ne reintoarce cite o valoare
        System.out.println(value);
        
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
