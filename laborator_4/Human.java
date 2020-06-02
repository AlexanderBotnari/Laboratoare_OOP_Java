package laborator_4;

public class Human {

	private int age;

	public Human() {}
	public Human(int age) {
		this.age = age;
	}
    //Accesor
	public int getAge() {
		return age;
	}
     //Modifier
	//in signatura metodei unde utilizam exceptia adaugam throw si numele clasei de exceptie
	public void setAge(int age) throws WrongAgeException {
		if(age > 0 && age < 100) {
			this.age = age;
		}else {
			//creeam si aruncam obiectul-exceptie mai departe 
			throw new WrongAgeException();
		}
		
	}
}
