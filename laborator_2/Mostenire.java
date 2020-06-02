package laborator_2;

public class Mostenire {

	public static void main(String[] args) {
		
		AutoCutieAutomataViteze auto1 = new AutoCutieAutomataViteze(2,"Mercedes","CLS350","alb","Dubai",500000,6,6);
        auto1.show();
        auto1.convertLeiToEuro(500000);
        System.out.println();
        AutoCutieAutomataViteze auto2 = new AutoCutieAutomataViteze(2,"Mercedes","CLS350",6,6);
        auto2.show();
        System.out.println();
        AutoCutieAutomataViteze auto3 = new AutoCutieAutomataViteze();
        auto3.show();
        
        System.out.println();
        AutomobileGPS auto4 = new AutomobileGPS(3,"Lamborghini","Aventador","Gold","Brazilia",1500000,6,6,"GPS-2020");
        auto4.show();
        System.out.println();
        AutomobileGPS auto5 = new AutomobileGPS(3,"Lamborghini","Aventador","GPS-2020");
        auto5.show();
        System.out.println();
        AutomobileGPS auto6 = new AutomobileGPS();
        auto6.show();
	}

}

