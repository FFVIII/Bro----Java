import java.util.Scanner;	
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args){
		
//----------------------------------------------------------------		
//#1 Java tutorial for beginners
		
//    System.out.print("I love pizza");
      
//                      \n = new line = go to next line
//	  System.out.print("I love pizza\n");
	
	  //\t = some empty space
//	  System.out.println("\tI love pizza");
		
	  //" "" "
//	  System.out.println("\"I love pizza\"");
	  
	  //\
//	  System.out.println("\\I love pizza");
	  
	  // This is a comment
	  
	  /**
	   * 
	   * This
	   * is
	   * a
	   * comment
	   * 
	   * */
//----------------------------------------------------------------		 
	  
		
//----------------------------------------------------------------	  
//#2 variables 	  

	  //int x; //declartion
	  //x = 123; //assignment
	  //int x = 123; //initializtion
	  //System.out.println("My number is: " + x);
	  
//	  long x = 123456123132165465464L;
	  
//	  byte x = 100;
		
//	  float y = 3.14f;
		
//	  double y = 3.14;
	
//	  boolean z = true;
		
//	  char symbol = '@';
		
//	  String name = "Bro";
//	  System.out.println("My number is: " + name);
		
//-------extends--------
		
	  //decimalformat
//	  import java.text.*;
		
//	  decimalFormat df = new DecimalFormat("0.00");
	  
//	  df.format(earnings)
		
//	  char[]
//	  x.charAt()

//		public static String reverse(String s) {	
//			
//			//this way print out the number not a char, so we use char[]
//			//***let letter save in char***
//			char[] letters = new char[s.length()];
//			
//			int letterIndex = 0;
//			
//			//for loop display reverse letter
//			for(int i = s.length() - 1; i >= 0; i--) {
//				//print out reverse each letters
//				//System.out.println(s.charAt(i));
//				//charAt(i) = g[0] o[1] d[3]
//				//***insert each s.charAt(i) into letterIndex***
//				letters[letterIndex] = s.charAt(i);
//				letterIndex++;
//			}
//			
//			//restart put the reverse order to save new string
//			String reverse = "";
//			for(int i = 0; i < s.length(); i++) {
//									//add current letter array
//				reverse = reverse + letters[i];
//			}
//			
//			return reverse;
//		}
	   
//----------------------------------------------------------------		  
	  
	  
//----------------------------------------------------------------		  
//#3 swap two variables
		
//	  String x = "water";
//	  String y = "Kool-Aid";
//	  String temp;
//	  
//	  temp = x;
//	  x = y;
//	  y = temp;
//	  
//	  System.out.println("x: "+x);
//	  System.out.println("y: "+y);
//----------------------------------------------------------------		 	  
	  
	  
//----------------------------------------------------------------	  
//#4 user input - import java.util.Scanner;	
		
//	  Scanner scanner = new Scanner(System.in);	
//	  
//	  System.out.println("What is your name? ");
//	  String name = scanner.nextLine();
//	  
//	  System.out.println("How old are you? ");
//	  int age = scanner.nextInt();
//	  
//	  //need to user scanner.nextLine() again
//	  scanner.nextLine();
//	  System.out.println("What is your favorite food?");
//	  String food = scanner.nextLine();
//	  
//	  System.out.println("Hello "+name);
//	  System.out.println("Your are "+age+" years old");	
//	  System.out.println("You like "+food);	

	  
//----------------------------------------------------------------	 		
//#5 expressions 		
	  
	  // expression = operands & operators
      // operands = values, variables, numbers, quantity
	  // operators = + = * / %
	
//	  int friends = 10;
//	  
//	  //friends = friends + 1;
//	  friends++;
//	  friends--;
		
//	  double friends = 10;
//	  
//	  friends = (double) friends / 3;
	  
//	  System.out.println(friends);		
//----------------------------------------------------------------		
		
		
//----------------------------------------------------------------		
//#6 GUI intro - import javax.swing.JOptionPane;

//	  String name = JOptionPane.showInputDialog("Enter your name: ");	
//	  JOptionPane.showMessageDialog(null, "Hello "+name);
//		
//	  int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));	 	
//	  JOptionPane.showMessageDialog(null, "You are "+age+" Year old");
//		
//	  double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));	 	
//	  JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");		
//----------------------------------------------------------------			
		
		
//----------------------------------------------------------------		  
//#7 Math class
	  
//	  double x = 3.14;
//	  double y = -10;
	  
//	  double z = Math.max(x, y);
//	  double z = Math.min(x, y);
//	  double z = Math.abs(y);
//	  double z = Math.sqrt(x);
//	  double z = Math.round(x);
//	  double z = Math.ceil(x);
//	  double z = Math.floor(x);
	  
//	  System.out.println(z);
		
//-------------------
	  
//	  double x;
//	  double y;
//	  double z;
//	  
//	  Scanner scanner = new Scanner(System.in);
//	  
//	  System.out.println("Enter side x: ");
//	  x = scanner.nextDouble();
//	  
//	  System.out.println("Enter side y: ");
//	  y = scanner.nextDouble();
//	  
//	  z = Math.sqrt((x*x + y*y));
//	  
//	  System.out.println("The hypotenuse is: " + z);
//	  
//	  scanner.close();
//----------------------------------------------------------------		  

	  
//----------------------------------------------------------------		  
//#8 random numbers	  
//import java.util.Random;	  
		
//	  Random random = new Random();
	  
	  //nextInt = 0 - 5;
//	  int x = random.nextInt(6);
	  
	  //nextInt = 1 - 6;
//	  int x = random.nextInt(6)+1;
	  
//	  double x = random.nextDouble();
	  
//	  boolean x = random.nextBoolean();
	 
//	  float x = random.nextFloat();
		
//	  System.out.println(x);
//----------------------------------------------------------------		
		
		
//----------------------------------------------------------------			
//#9 if statements	  
//if statement = performs a block of code if it's conditon evaluates to be true
		
//	  if() {
//		  
//	  }
//	  else if() {
//		  
//	  }
//	  else {
//		  
//	  }
	   
//	  int age = 10;
//	  
//	  if(age >= 75) {
//		  System.out.println("You are an old man!!!");
//	  }
//	  else if(age >= 18){
//		  System.out.println("You are an adult");
//	  }
//	  else if(age >= 13) {
//		  System.out.println("You are an children");
//	  }
//	  else {
//		  System.out.println("You are a bady");
//	  }
//----------------------------------------------------------------
	  

//----------------------------------------------------------------	
//#10 switches   
// switch = statement that allows a variable to be 
//			tested for equality against a list of values
//	 String X = "X";
		
//   switch(X) {
//   		case "X": System.out.println("");
//   		break;
//   		
//   		case "X": System.out.println("");
//   		break;
//   		
//   		case "X": System.out.println("");
//   		break;
//   		
//   		default : System.out.println("");
//   }  
	  
//	 String day = "Dog";
//	 
//	 switch(day) {
//	 	case "Sunday" : System.out.println("It is Sunday");
//	 	break;
//	 	
//	 	case "Monday" : System.out.println("It is Monday");
//	 	break;
//	 	
//	 	case "Tuesday" : System.out.println("It is Tuesday");
//	 	break;
//	 	
//	 	case "Wednesday" : System.out.println("It is Wednesday");
//	 	break;
//	 	
//	 	case "Thursday" : System.out.println("It is Thursday");
//	 	break;
//	 	
//	 	case "Friday" : System.out.println("It is Friday");
//	 	break;
//	 	
//	 	case "Saturday" : System.out.println("It is Saturday");
//	 	break;
//	 	
//	 	default : System.out.println("This is not a day!!!");
//	 }
	  
	  
	  
//----------------------------------------------------------------		  
//#11 logical operators 	  
// logical operators = used to connect two or more expressions
		
//					   && = (AND) both conditons must be true
//					   || = (OR) either conditons must be true
//	                   != (NOT) reverses boolean value of a condtion
	  
//		int temp = 21;
//		
//		if(temp >= 35) {
//			System.out.println("It is hot outside");
//		}
//		else if(temp >=20 && temp <= 30) {
//			System.out.println("It is warm outside");
//		}
//		else {
//			System.out.println("It is cold outside");
//		}
		
//-------------------		

//		Scanner scanner = new Scanner(System.in);
//		
//	    System.out.println("You are playing a game! Press q or Q to quit");
//	    
//	    //store variable
//	    String response = scanner.next();
//	  
//	    if(response.equals("q") || response.equals("Q")) {
//	    	System.out.println("You quit the game!");
//	    }
//	    else {
//	    	System.out.println("You are still playing the game");
//	    }
		
//-------------------
		
//		Scanner scanner = new Scanner(System.in);
//		
//	    System.out.println("You are playing a game! Press q or Q to quit");
//	    
//	    //store variable
//	    String response = scanner.next();
//	  
//	    if(!response.equals("q") && !response.equals("Q")) {
//	    	System.out.println("You are still playing the game");
//	    }
//	    else {
//	    	System.out.println("You quit the game!");
//	    }
//----------------------------------------------------------------		    

	    
//----------------------------------------------------------------		  
//#12 while loop  	  
//while loop = executes a black of code as long as a it's condition remains true
		
//while() {
//	
//}
		
//do{
//	
//}while();
		
//isBlank()
//nextLine()
		
//		Scanner scanner = new Scanner(System.in);
//		
//		String name = "";
//	 
//		while(name.isBlank()) {
//			System.out.println("Enter your name: ");
//			name = scanner.nextLine();	
//		}
//		System.out.println("Hello "+name);  
//----------------------------------------------------------------		  
	  
				
//----------------------------------------------------------------		  
//#13 for loop  	  
//for loop = executes a block of code a limited amount of times
//for() {
//	
//}
 
//		for(int i = 0; i <= 10; i++) {
//			System.out.println(i);
//		}
		
//		for(int i = 10; i >= 0; i--) {
//			System.out.println(i);
//		}
//		System.out.println("Happy New Year!!!");
		
//		for(int i = 10; i >= 0;) {
//			System.out.println(i);
//			i--;
//		}
//		System.out.println("Happy New Year!!!");		  
//----------------------------------------------------------------			
		
		
//----------------------------------------------------------------		  
//#14 nested loops		
//nest loops = a loop inside of a loop
//for() {
//	for() {
//		
//	}
//}		
//		Scanner scanner = new Scanner(System.in);
//		int rows;
//		int columns;
//		String symbol = "";
//		
//		System.out.println("Enter # of row");
//		rows = scanner.nextInt();
//		
//		System.out.println("Enter # of column");
//		columns = scanner.nextInt();
//		
//		System.out.println("Enter symbol");
//		symbol = scanner.next();
//		
//		for(int i = 1; i <= rows; i++) {
//			System.out.println();
//			for(int j = 1; j <= columns; j++) {
//				System.out.print(symbol);
//			}
//		}
//----------------------------------------------------------------			
		
		
//----------------------------------------------------------------		  
//#15 arrays 			
//array = used to store multiple values in a single variable
	
	//type[] names
//  String[] names = {"","",""};
	
	  					//String 0 - 2
//  String[] names = new String[3];
//  names[0] = "item_name";
//  names[1] = "item_name";
//  names[2] = "item_name";
		
//		String[] cars = {"BMW", "Benz", "Tesla"};
	  
	   	//change #2 item
//		cars[2] = "Honda";
//		System.out.println(cars[2]);
		
//		String[] cars = new String[3];
//		cars[0] = "BMW";
//		cars[1] = "Benz";
//		cars[2] = "Tesla";
//		
//		System.out.println(cars[0]);
		
//		String[] cars = new String[3];
//		cars[0] = "BMW";
//		cars[1] = "Benz";
//		cars[2] = "Tesla";
//		
//		for(int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}	
//----------------------------------------------------------------			
		
						
//----------------------------------------------------------------			
//#16 ***arrays*** 		
//2D arrays = an array of arrays
		
//String[][] cars = new String[3][3]; 		
		
//String[][] cars = {
//						{},
//						{},
//						{}
//					}; 	 		
		
//		String[][] cars = new String[3][3];
//		
//		cars[0][0] = "BMW";
//		cars[0][1] = "Benz";
//		cars[0][2] = "Tesla";
//		cars[1][0] = "Mustang";
//		cars[1][1] = "Ranger";
//		cars[1][2] = "Mini";
//		cars[2][0] = "Ferrari";
//		cars[2][1] = "Lambo";
//		cars[2][2] = "Honda";
//		
		//use nest for loop
//		for(int i = 0; i <cars.length; i++) {
//			System.out.println();
//			for(int j = 0; j<cars[i].length; j++) {
//				System.out.print(cars[i][j]+" ");
//			}
//		}
		
//-------------------			
//		String[][] cars = {
//							{"BMW", "Benz", "Tesla" },
//							{"Mustang", "Ranger", "Mini"},
//							{"Ferrari", "Lambo", "Honda"},
//						  };
//		
//		for(int i = 0; i <cars.length; i++) {
//			System.out.println();
//			for(int j = 0; j<cars[i].length; j++) {
//				System.out.print(cars[i][j]+" ");
//			}
//			
//		}
//----------------------------------------------------------------			
		
		
//----------------------------------------------------------------			
//#17 ***String methods*** 		
//String = a reference data type that can store one or more characters
//		   reference data types have access to useful methods
	   
//		String name = "Bro";
		
//					     name.equals("Bro");
//		boolean result = name.equals("Bro");
//		boolean result = name.equalsIgnoreCase("bRO");
		
//		int result = name.length();
		
		//		      name.charAt(index)
//		char result = name.charAt(0);
		
		//			  name.find the postion
//		int result = name.indexOf("B");
		
//		boolean result = name.isEmpty();
		
//		String result = name.toUpperCase();
//		String result = name.toLowerCase();
		
		//remove empty space
//		String result = name.trim();
		
		//				replace('','');
//		String result = name.replace('o', 'a');
		
//		System.out.println(result);
	  
//-------other ways uesd--------

//		name.length();	
	  
//	    char[] name = new char[s.length()];
	  
	    
	  
//----------------------------------------------------------------			
				
		
//----------------------------------------------------------------			
//#18 wrapper classes		
/* wrapper class = provides a way to use primitive data types as reference data types
		           reference data types contain useful methods
		           can be used with collections (ex.ArrayList)
*/		
//primitive		//wrapper

//boolean		  Boolean
//char 			  Character
//int 			  Integer
//double 		  Double
		
//autoboxing = the automatic conversion that the Java compiler makes between the primitive types
// 			   and their corresponding object wrapper classes
		
//unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
//		Boolean a = true;
//		Character b = '@';
//		Integer c = 123;
//		Double d = 3.14;
//		String e = "Bro";
//		
//		if(a==true) {
//			System.out.println("This is true");
//		}
		
				
//----------------------------------------------------------------	
		
		
//----------------------------------------------------------------			
//#19 ArrayList -> import java.util.ArrayList;
		
/*ArrayList = a resizable array.
		      Elements can be added and removed after compilation phase
		      store reference data types
*/
		
//ArrayList<String> name = new ArrayList<String>();
		
//		ArrayList<String> food = new ArrayList<String>();
//		
//		food.add("pizza");
//		food.add("hamburger");
//		food.add("hotdog");
//	
//		food.set(0, "sushi");
//		food.remove(2);
//		
//		//delete all the items from food ArrayList
////		food.clear();
//		
//		for(int i = 0; i < food.size(); i++) {
//			System.out.println(food.get(i));
//		}
//		
			
//----------------------------------------------------------------		
//#20 2D ArrayList - shpping list
		
//2D ArrayList = a dynamic list of lists
//			     You can change the size of these lists during runtime
		
// ArrayList<ArrayList<String>> name = new ArrayList();
		
//		ArrayList<String> bakeryList = new ArrayList();
//		
//		bakeryList.add("pasta");
//		bakeryList.add("garlic bread");
//		bakeryList.add("donuts");
//		
//		System.out.println(bakeryList);
//		System.out.println(bakeryList.get(1));
		
//		ArrayList<String> produceList = new ArrayList();
//		
//		produceList.add("tomatoes");
//		produceList.add("zucchini");
//		produceList.add("peppers");
//		
//		ArrayList<String> drinksList = new ArrayList();
//		
//		drinksList.add("soda");
//		drinksList.add("coffee");
//		
//		System.out.println(drinksList);
		
//		ArrayList<String> bakeryList = new ArrayList();
//		
//		bakeryList.add("pasta");
//		bakeryList.add("garlic bread");
//		bakeryList.add("donuts");
//	
//		ArrayList<String> produceList = new ArrayList();
//		
//		produceList.add("tomatoes");
//		produceList.add("zucchini");
//		produceList.add("peppers");
//		
//		ArrayList<String> drinksList = new ArrayList();
//		
//		drinksList.add("soda");
//		drinksList.add("coffee");
//	
//		//2D Array
//		ArrayList<ArrayList<String>> groceryList = new ArrayList();
//		
//		groceryList.add(bakeryList);
//		groceryList.add(produceList);
//		groceryList.add(drinksList);
//		
//		System.out.println(groceryList);
//		
//		//get single list
//		System.out.println(groceryList.get(0));
//		
//		//get single list item
//		System.out.println(groceryList.get(0).get(0));
		
		
//----------------------------------------------------------------		
//#21 for-each loop		
/*for - each = traversing technique to iterate through the elements in an array/collection
			   less steps, more readable
			   less flexible
*/
		
//		String[] animals = {"cat", "dog", "rat", "bird"};
//		
//		for(String i : animals) {
//			System.out.println(i);
//		}
		
//		ArrayList<String> animals = new ArrayList<String>();
//		
//		animals.add("cat");
//		animals.add("dog");
//		animals.add("rat");
//		animals.add("bird");
//		
//		for(String i : animals) {
//			System.out.println(i);
//		}
			
//----------------------------------------------------------------		
	
		
//----------------------------------------------------------------			
//#22 methods		
//method = a block of code that is executed whenever it is called upon
		
//		String name = "Bro";
//		int age = 21;
//		
//		//call function
//		hello(name,age);
		
//-------------------	
//		int x = 3;
//		int y = 4;
//		
//		int z = add(x,y);
//		
//		System.out.println(z);	
//----------------------------------------------------------------		
		
	
//----------------------------------------------------------------			
//#23 overloaded methods
/*	
 * 	overloaded = methods = methods that share the same name but have different parameters
 * 				 method name + parmeters = method signature 
 */

//		int x = add(1,2);
//		System.out.println(x);
		
//-------------------
//		double y = add(2.0, 3.0, 5.0);
//		System.out.println(y);
//----------------------------------------------------------------
		
				
//----------------------------------------------------------------			
//#24 printf 
/*	
* printf() = an optional method to control, format, and display text
* 			 to the console window 
* 			 two arguments = format string + (object/variable/value)
* 			 % [flags] [precision] [width] [conversion-character] 
* 
*System.out.printf("",propertise);
*/

//		System.out.printf("This is a format string %d",123);
		
		//[conversion-character]
//		boolean myBoolean = true;
//		System.out.printf("%b", myBoolean);
//		
//		char myChar = '@';
//		System.out.printf("%c", myChar);
//		
//		String myString = "Bro";
//		System.out.printf("%s", myString);
//		
//		int myInt = 50;
//		System.out.printf("%d", myInt);
//		
//		double myDouble = 1000;
//		System.out.printf("%f", myDouble);
		
//-------------------	
//		[width]
// 		minimum number of characters to be written as output
//		System.out.printf("Hello %10s",myString);
		
//		[precision]
//		sets number of digits of precision when outputting floating-point values
//		System.out.println("You have this much money %.2f ",myDouble);
		
//		[flags]
//		adds an effect to output based on the flag added to format specifier
//		- : left-justify
//		+ : output a plus ( + ) or minus ( - ) sign for a numeric value
//		0 : numeric values are zero-padded
//		, : comma grouping separator if numbers > 1000
//		System.out.println("You have this much money %+f ",myDouble);
//		System.out.println("You have this much money %,f ",myDouble);
//----------------------------------------------------------------
		
		
//----------------------------------------------------------------			
//#25 final keyword 
/*	final - can't change the value
 */
//		final double PI = 3.14159;		
//		System.out.println(PI);
//----------------------------------------------------------------		
		
		
//----------------------------------------------------------------		
//#26 objects (OOP)	- car class	
/*
 *	object = an instance of a class that may contain attributes and methods
 *	example: (phone, desk, computer, coffee cup)
 */		
	//	create object
	//	Car myCar = new Car();
	//	
	//	System.out.println(myCar.make);
	//	System.out.println(myCar.model);
		
	//	//call method
	//	myCar.drive();
	//	myCar.brake();
	
//		Car myCar2 = new Car();	
//		
//		System.out.println(myCar2.make);
//		System.out.println(myCar2.model);
//			
//		//call method
//		myCar2.drive();
//		myCar2.brake();	
//----------------------------------------------------------------			

					
//----------------------------------------------------------------			
//#27 constructors  - Human class
/*	
 * constructor = special method that is called when an object is instanted (created)
*/
		
//		Human human1 = new Human("Rick",65,70);
//		Human human2 = new Human("Tim",15,40);
//		
//		System.out.println(human1.name);
//		System.out.println(human1.age);
//		System.out.println(human1.weight);
//	
//		human1.eating();
//		human2.drinking();
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#28 variable scope - DiceRoller class
/*		
 * 	local = declared inside a method
 * 			visible only to that method
 * 
 * 	global = declared outside a method, but within a class
 * 			 visible to all parts of a class
 */
		
//		DiceRoller diceRoller = new DiceRoller();
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#29 overloaded constructors
/*	
 * 	overloaded constructors = multiple constructors within a class with the same name,
 * 							  but have different parameters
 * 							  name + parameters = signature
 */

//	Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");	
	
//	System.out.println("Here are the ingredients of your pizza: ");
//	System.out.println(pizza.bread);
//	System.out.println(pizza.sauce);
//	System.out.println(pizza.cheese);
//	System.out.println(pizza.topping);
		
//	Pizza pizza2 = new Pizza("thicc crust");	
//	System.out.println(pizza2.bread);
//	System.out.println(pizza2.sauce);
//	System.out.println(pizza2.cheese);
//	System.out.println(pizza2.topping);	
	
//	Pizza pizza3 = new Pizza();
//	System.out.println(pizza3.bread);
//	System.out.println(pizza3.sauce);
//	System.out.println(pizza3.cheese);
//	System.out.println(pizza3.topping);	
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#30 toString method - car1 class
/*	
 * to String() = special method that all objects inherit,
 * 			 	 that returns a string that "textually represents" an object.
 * 				 can be used both implicitly and explicitly
 */

//	Car1 car = new Car1();
//	System.out.println(car.make);
//	System.out.println(car.model);
//	System.out.println(car.color);
//	System.out.println(car.year);
//	System.out.println(car.toString());
//	System.out.println(car);	
//----------------------------------------------------------------	
	

//----------------------------------------------------------------	
//#31 array of objects - food class
	
//	int[] numbers = new int[3];
//	char[] characters = new char[4];
//	String[] strings = new String[5];
	
//	Food[] refrigerator = new Food[3];
//	
//	Food food1 = new Food("pizza");
//	Food food2 = new Food("hamburger");
//	Food food3 = new Food("hotdog");
//	
//	refrigerator[0] = food1;
//	refrigerator[1] = food2;
//	refrigerator[2] = food3;
//	
//	System.out.println(refrigerator[0].name);
//	System.out.println(refrigerator[1].name);
//	System.out.println(refrigerator[2].name);

//-------------------different ways

//	Food food1 = new Food("pizza");
//	Food food2 = new Food("hamburger");
//	Food food3 = new Food("hotdog");
//	
//	Food[] refrigerator = {food1, food2, food3};
//	
//	System.out.println(refrigerator[0].name);
//	System.out.println(refrigerator[1].name);
//	System.out.println(refrigerator[2].name);
	  
	
	  
//----------------------------------------------------------------		
		
		
//----------------------------------------------------------------	
//#32 object passing - Car2 + Garage
	
//	Garage garage = new Garage();
//	
//	Car2 car = new Car2("BMW");
//	Car2 car1 = new Car2("Tesla");
//	
//	garage.park(car);
//	garage.park(car1);
//----------------------------------------------------------------		
		
		
//----------------------------------------------------------------	
//#33 static keyword - Friend class
/*
 *	static = modifier, A single copy of a variable/method is created and shared.
 *			The class "owns" the static member 
 */	

//	Friend friend = new Friend("Dennis");
//	Friend friend1 = new Friend("Squall");
//	Friend friend2 = new Friend("Squall");
//	Friend friend3 = new Friend("Zell");
	
//	System.out.println(friend.numberOfFriends);
	
//	Friend.displayFriends();
//----------------------------------------------------------------
	
	
//----------------------------------------------------------------			
//#34 inheritance Vehicle + Car3 + Bicycle class
/*	
 * inheritance = the process where one class acquires,
 * 				 the attributes and methods of another.
 */

//	Car3 car = new Car3();
//	
//	car.go();
//	
//	Bicycle bike = new Bicycle();
//	
//	bike.stop();
//	
//	System.out.println(car.doors);
//	System.out.println(car.wheels);
//	
//	System.out.println(bike.pedal);
//	System.out.println(bike.wheel);	
//----------------------------------------------------------------		

	
//----------------------------------------------------------------			
//#35 method overriding  animal + dog
/*	
 * 	method overriding = declaring a method in sub class,
 * 						which is already present in parent class.
 * 						done so that a child class can give its own
 * 						implementation
 */
	
	//create object
//	Animal animal = new Animal();
//	Dog dog = new Dog();
//	
//	//excute dog override function
//	//if dog not override, it will excute animal function
//	dog.speak();	
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#36 super keyword Person + Hero class
/*	
 * 	super = keyword refers to the superclass (parents) of an object
 * 			very similar to the "this" keyword
 */

//	Hero hero1 = new Hero("Batman", 43, "$$$");
//	Hero hero2 = new Hero("Superman", 100, "everything");
	
//	System.out.println(hero1.name);
//	System.out.println(hero1.age);
	
//	System.out.println(hero2.toString());
//----------------------------------------------------------------
	
	
//----------------------------------------------------------------			
//#37 abstraction Vehicle1 + Car4
/*	
 * 	abstract = abstract classes cannot be instantiated, but they can have a subclass
 * 			   abstract methods are declared without an implementation
 */

//	Vehicle1 vehicle = new Vehicle();
	
//	Car4 car = new Car4();
//	car.go();	
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#38 access modifiers - skip
/*	
 * 	
 */


		
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#39 encapsulation - Car5 
/*	
 * 	encapsulation = attributes of class will be hidden or private,
 * 					can be accessed only through methods (getterts & setters)
 * 					you shuold make attributes private if you don't have a reason to 
 * 					make them public/protected
 */

//	Car5 car  = new Car5("BMW", "i7", 2023);
//	
//	//get method
//	System.out.println(car.getMake());
//	System.out.println(car.getModel());
//	System.out.println(car.getYear());
//	
//	//set method
//	car.setYear(1991);
//	System.out.println(car.getYear());	
//----------------------------------------------------------------		

	
//----------------------------------------------------------------			
//#40 copy objects Car5 - not easy
	
// 	Car6 car1 = new Car6("Chevrolet", "Camaro", 2021);
// 	
//// 	Car6 car2 = new Car6("BMW", "i7", 2023);
////	car2.copy(car1);
//
// 	//copy object
// 	Car6 car2 = new Car6(car1);
// 	
// 	System.out.println(car1);
// 	System.out.println(car2);
// 	System.out.println();
// 	System.out.println(car1.getMake());
// 	System.out.println(car1.getModel());
// 	System.out.println(car1.getYear());
// 	System.out.println();
// 	System.out.println(car2.getMake());
// 	System.out.println(car2.getModel());
// 	System.out.println(car2.getYear());
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#41 interface 
/*	
 * interface = a template that can be applied to a class.
 * 			   similar to inheritance, but specifies that what a class has/must do.
 * 			   classes can apply more than one interface, inheritance is limited to 1 super class	   
 */
	
//	Rabbit rabbit = new Rabbit();
//	rabbit.flee();
//	
//	Hawk hawk = new Hawk();
//	hawk.hunt();
//	
//	Fish fish = new Fish();
//	fish.hunt();
//	fish.flee();

//----------------------------------------------------------------
	
	
//----------------------------------------------------------------			
//#42 polymorphism Vehicle2 + Car7 + Bicyle1 + Boat
/*	
 * polymrphism = greek word for ploy-"many", morph-"form"
 * 				The ability of an object to odentify as more than one type
 * 	
 */

//	Car7 car = new Car7();
//	Bicycle1 bicycle = new Bicycle1();
//	Boat boat = new Boat();
//	
//	Vehicle2[] racers = {car, bicycle, boat};
	
//	car.go();
//	bicycle.go();
//	boat.go();
	
//-------------------better method
	
//	for(Vehicle2 x : racers) {
//		x.go();
//	}	
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#43 dynamic polymorphism
/*	
 * 	polymorphism = many shapes/forms
 *  dynamic = after compliation (during runtime)
 *  
 *  ex. A corvette is a : corvette, and a car, and a vehicle, and an object
 *  
 */

//	Scanner scanner = new Scanner(System.in);
//	
//	Aniaml1 animal;
//	
//	System.out.println("What animal do you want?");
//	System.out.println("(1 = dog) or (2 = cat): ");
//	
//	int choice = scanner.nextInt();
//	
//	if(choice == 1) {
//		animal = new Dog1();
//		animal.speak();
//	}
//	else if(choice == 2) {
//		animal = new Cat();
//		animal.speak();
//	}
//	else {
//		animal = new Aniaml1();
//		System.out.println("That choice was invalid");
//		animal.speak();
//	}	
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#44 exception handling - import java.util.InputMismatchException;
/*	
 * exception = an event taht occurs during the execution of a program that,
 * 			   disrupts the normal flow of instructions
 */
//	Scanner scanner = new Scanner(System.in);
//	
//	try {
//		
//		System.out.println("Enter a whole number to divide: ");
//		int x = scanner.nextInt();
//		
//		System.out.println("Enter a whole number to divide by: ");
//		int y = scanner.nextInt();
//		
//		int z = x/y;
//		
//		System.out.println("result: " + z);
//	}
//	
//	catch(ArithmeticException e) {
//		System.out.println("You can't divide by zero!");
//	}
//	catch(InputMismatchException e) {
//		System.out.println("Please ENTER A NUMBER OMFG!!!");	
//	}
//	catch(Exception e) {
//		System.out.println("Something went wrong");
//	}
//	finally {
////		System.out.println("This will always print");
//		scanner.close();
//	}
		
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#45  File class - import java.io.File;
/*	
 * file = an abstract representation of file and directory pathnames
 */

//	File file = new File("D:/Computer Skills/Java Eclipse/Bro - Java tutorial/src/secret_message.txt");
//	
//	if(file.exists()) {
//		System.out.println("That file exists! :O!");
//		System.out.println(file.getPath());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.isFile());
//		file.delete();
//	}
//	else{
//		System.out.println("That file doesn't exist :(");
//	}	
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#46 FileWriter (write to a file) - import java.io.FileWriter; 
//								     import java.io.IOException;

//	try {
//		FileWriter writer = new FileWriter("poem.txt");
//		writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin");
//		writer.append("\n(A poem by Bro)");
//		writer.close();
//	}
//	catch(IOException e) {
//		e.printStackTrace();
//	}
//----------------------------------------------------------------
	
	
//----------------------------------------------------------------			
//#47 FileReader (read a file) - import java.io.FileReader;
/*	
 * FileReader = read the contents of a file as a stream of characters.
 * 				One by one read() returns an int value which contains the
 * 				byte value when read() returns -1, there is no more data to
 * 				be read
 * 
 * 	try{
 * 
 * 	}
 * 	catch(){
 * 
 *  }
 * 
 */
//	try {
//		FileReader reader = new FileReader("art.txt");
//		int data = reader.read();
//		while(data != -1) {
//			System.out.print((char)data);
//			data = reader.read();
//		}
//		reader.close();
//	}
//	
//	catch(FileNotFoundException e) {
//		e.printStackTrace();
//	}
//	catch(IOException e) {
//		e.printStackTrace();
//	}	
//----------------------------------------------------------------
	
	
	
//----------------------------------------------------------------			
//#48 audio
/*	
 * 
 */


		
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#49 GUI 
/*	
 * 
 */


		
//----------------------------------------------------------------		
	
	
//----------------------------------------------------------------			
//#50 labels 
/*	
 * 
 */


		
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#51 panels  
/*	
 * 
 */


		
//----------------------------------------------------------------		
	
	
//----------------------------------------------------------------			
//#52 buttons  
/*	
 * 
 */


		
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------			
//#77 threads   
/*	
 * thread = a thread of execution in a program(kind of like a virtual CPU)
 * 			The JVM allows an application to have multiple threads running
 * 			concurrently each thread can execute parts of you code in parallel
 * 			with the main thread
 * 			Each thread has a priority.
 * 			Threads with higher priority are executed in preference compared to threads
 * 			with a lower priority
 * 
 * 			The java virtual machine continues to execute threads until either of the 
 * 			following occurs
 * 			1. The exit method of class Runtime has been called
 * 			2. All user threads have died
 * 
 * 			When a JVM starts up, there is a thread which calls the main method
 * 			This thread is called "main"
 * 
 * 			Daemon thread is a low priority thread that runs in background to perform
 * 			tasks such as garbage collection
 * 			JVM terminated itself when all user threads (non-daemon threads) finish their execution
 * 			
 */

	
//	System.out.println(Thread.activeCount());
//	Thread.currentThread().setName("Main");
//	System.out.println(Thread.currentThread().getName());
//	
//	Thread.currentThread().setPriority(10);
//	System.out.println(Thread.currentThread().getPriority());
//	
//	System.out.println(Thread.currentThread().isAlive());
	
//public static void main(String[] args) throws InterruptedException {
		
//	for(int i = 3; i > 0; i--) {
//		System.out.println(i);
//		Thread.sleep(1000);
//	}
//	
//	System.out.println("You are done!");
		
//	MyThread thread2 = new MyThread();
//	
//	thread2.setDaemon(true);
//	System.out.println(thread2.isDaemon());
//	
//	thread2.start();
//	
//	System.out.println(thread2.isAlive());
	
//	thread2.setName("2nd thread");
//	System.out.println(thread2.getName());	
	
//	thread2.setPriority(10);
//	System.out.println(thread2.getPriority());
	
//	System.out.println(Thread.activeCount());
//----------------------------------------------------------------		
	
	
//----------------------------------------------------------------			
//#78 multithreading 
/*	
 * 
 */


		
//----------------------------------------------------------------
	
	
//----------------------------------------------------------------			
//#81 executable (.jar)
/*	create an executable jar with Eclipse IDE
 * 
 * 	1. right click on Java project (pick a project with a GUI)
 *  2. export
 *  3. Java > Runnable Jar file
 *  4. At launch configureation select your project
 *  5. At export destination, select where you want this jar file exported to
 *  6. finish
 */


		
//----------------------------------------------------------------	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
//---------------------This is other methods-------------------------	
//#22 methods	
//	static void hello(String name, int age) {
//		System.out.println("My name is " + name);
//		System.out.println("I am " + age);
//	}
//	
//	static int add(int x, int y) {
//		return x + y;
//	}	
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------		
//#23 overloaded methods 	
	
//	static int add(int a, int b) {
//		System.out.println("This is overloaded method #1");
//		return a + b;
//	}
//	
//	static int add(int a, int b, int c) {
//		System.out.println("This is overloaded method #2");
//		return a + b + c;
//	}
//	
//	static int add(int a, int b, int c, int d) {
//		System.out.println("This is overloaded method #3");
//		return a + b + c + d;
//	}
//	
//	static double add(double a, double b) {
//		System.out.println("This is overloaded method #1");
//		return a + b;
//	}
//	
//	static double add(double a, double b, double c) {
//		System.out.println("This is overloaded method #2");
//		return a + b + c;
//	}
//	
//	static double add(double a, double b, double c, double d) {
//		System.out.println("This is overloaded method #3");
//		return a + b + c + d;
//	}
//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------	



//----------------------------------------------------------------	
	
	
//----------------------------------------------------------------	
	
	
	
	
	
	
	
	

}
