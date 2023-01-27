import java.util.Random;

public class DiceRoller {

	//local
	//constructor
	DiceRoller(){
		int number = 0;
		Random random = new Random();
		roll(random, number);
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
	
	//global
//	Random random;
//	int number;
//	
//	//constructor
//	DiceRoller(){
//		random = new Random();
//		roll();
//	}
//	
//	void roll() {
//		number = random.nextInt(6)+1;
//		System.out.println(number);
//	}
}
