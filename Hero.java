
public class Hero extends Person {

	String power;
	
	Hero(String name, int age, String power){
		
		//refers to the superclass
		super(name, age);
		this.power = power;
		
	}
	
	public String toString() {
		return super.toString() + this.power;
	}
}
