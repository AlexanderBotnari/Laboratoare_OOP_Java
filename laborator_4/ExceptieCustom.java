package laborator_4;

public class ExceptieCustom {

	public static void main(String[] args) {

		Human h = new Human();
		//prindem exceptia in try\catch
		try {
			h.setAge(200);
			System.out.println(h.getAge());
			if(h.getAge() < 14) {
			System.out.println("Pay 10000$!");
		       }
		 }catch (WrongAgeException e) {
			 //aratam mesajul exceptie pe intelesul utilizatorului
			System.out.println("WRONG AGE!");
		}

	}

}