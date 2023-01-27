
public class Friend {
	
	String name;
	static int numberOfFriends;
	
	Friend(String name) {
		this.name = name;
		
		//total of amount
		numberOfFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+numberOfFriends+" friends");
	}
	
	
}
