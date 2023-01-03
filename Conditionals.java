//basic if else and switch case in java
public class Conditionals{
	public static void main(String[] args){
		
		int age = 19;
		age = 17;
		
		if(age >= 18) {
			System.out.println("Elgible to drink");
		}else {
			System.out.println("Khadja Halle " + (18-age) + " saal");
		}
		
		//alternate way of if else in java
		
		String result = (age >= 18) ? "elgible to vote" : "not elgible to vote";
		System.out.println(result);
		
		
		//SWITCH
		
		char mychar = 'a';
		mychar = 'b';
		
		
		//A switch works with the byte , short , char , and int primitive data types
		switch (mychar) {
		case 'a':
			System.out.println("apple");
			break;
		case 'b':
			System.out.println("ball");
			break;
		case 'c':
			System.out.println("cat");
			break;

		default:
			break;
		}
	}
}
