//basic if else and switch case in java
public class conditionalsLoops {
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
		
		//While loop
		
		int a;
		a = 5;
		while(a != 0) {
			System.out.print(a + " ");
			a--;
		}
		
		System.out.println();
		
		int b = 5;
		do {
			System.out.print(b + " ");
			b--;
		} while (b != 0);
		
		System.out.println();
		System.out.println();
		
		//FOR loop
		for(int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//nested For
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i <= 20; i++) {
			
			if(i == 11) {
				break; // break stops the loop
			}
			if(i%2 != 0) {
				continue; // continue skips the iteration
			}
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		//Arrays
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		numbers[0] = 99; // changing array elements using array index
		
		System.out.println();
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		//loop through array using for each
		for(int i : numbers) {
			System.out.print(i + " ");
		}
		
	}
}
