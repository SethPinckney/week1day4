public class Scratch {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//***********************
		//*** BREAK STATEMENT ***
		//***********************
		for(int x = 20; true; x+=20) {  		 // for loop A
			boolean isDivisibleByAll = true;
			for(int i = 10; i <= 20; i++) {      // for loop B
				if(x % i != 0) {
					isDivisibleByAll = false;
					break;						 // breaks out of for loop B (comment this line and observe effect on elapsed runtime)
				}
			}
			if(isDivisibleByAll) {
				System.out.println("The answer is "+x);
				long et = System.currentTimeMillis() - start;
				System.out.println("Finished in "+et+"ms");
				break;							  // breaks out of for loop A (comment this line and you have an infinite loop)
			}
		}
		
		
		//***********************
		//*** WHILE LOOP ***
		//***********************
		System.out.println("---- WHILE LOOP ----");
		
		int i = 10;
		while(i > 0) {							// checks the condition at the start of every iteration and continues to iterate if condition is true
			System.out.print(i);			
			i--;
		}
		System.out.print("\n\n");
		
		/*
			The following would be equivalent to the preceding while loop
			
			for(;i > 0;) {
			   ...
			}
		*/
		
		//***********************
		//*** DO WHILE LOOP ***
		//***********************
		
		/* A "do while" loop is used when you want to execute a block at least once.
		   The while condition is evaluated at the end of every iteration and continues
		   to the next iteration if the condition is true */
			
		System.out.println("---- WHILE LOOP ----");
		int j = 0;
		do {
			System.out.print(j);
			j++;
		} while (j > 0 && j < 10);  // if this was a normal while loop, it would never have executed because j was not greater than 0
		System.out.print("\n\n");
		
		//**************************
		//*** CONTINUE STATEMENT ***
		//**************************
		
		/* The continue statement will end the current iteration of a loop. */
		
		System.out.println("---- CONTINUE STATEMENT ----");
		int even = 0;
		while(even <= 10) {
			even++;
			if(even % 2 != 0) {
				continue;
			}
			System.out.println(even);  // when continue executes, this line is skipped
		}
		
		for(int odd = 0; odd <= 10; odd++) {  // the increment still happens even when continue is executed
			if(odd % 2 == 0) {
				continue;
			}
			System.out.println(odd);  // when continue executes, this line is skipped
		}
		
		//************************
		//*** SWITCH STATEMENT ***
		//************************
		System.out.println("---- SWITCH STATEMENT ----");
		
		/* switch statements can do equality comparison and only work with primitives and Strings.
		   For cases where they are appropriate to use, they can provide a little easier to read syntax
			than the equivalent logic using if and else blocks. */
		
		int testValue = 3;
		switch(testValue) {
			case 1 : System.out.println("One");
					 break;								// without this break statement, the code for case 2 would also execute
			case 2 : System.out.println("Two");
					 break;
			case 3 : System.out.println("Three");
					 break;
			case 4 : System.out.println("Four");
		}

		String testString = "One Thousand";
		switch(testString) {						// switch statements are compatible with Strings in JDK >= 7
			case "One"   : System.out.println(1);
					       break;
			case "Two"   : System.out.println(2);
					       break;
			case "Three" : System.out.println(3);
					       break;
			case "Four"  : System.out.println(4);
						   break;
			default : System.out.println("I don't know that number");
		}
		
		//***************
		//*** ARRAYS  ***
		//***************
		
		System.out.println("----- ARRAYS -----");
		
		String[] fruit = new String[4];			// this line declares an array of Strings with 4 elements
		fruit[0] = "Apple";
		fruit[1] = "Orange";
		fruit[2] = "Banana";
		fruit[3] = "Pear";
		System.out.println("I have "+fruit.length+" fruits!");
		for(int k = 0; k < fruit.length; k++) {
			System.out.println(fruit[k]);
		}
		
		String[] trees = new String[3];
		System.out.println("I have room for "+trees.length+" trees!");  // the array has length 3 even when no values have been assigned.
		trees[1] = "Maple";
		System.out.println(trees[1]);
		
		int[] intArray = new int[] { 1, 2, 3 };			// this is how we declare an array literal
		for(int ix = 0; ix < intArray.length; ix++) {
			System.out.print(intArray[ix]);
		}
		System.out.print("\n\n");
		
		int[][] multi = new int[3][3];		// this declares a multi-dimensional (3x3) array of type int
		multi[0][0] = 1;
		multi[0][1] = 2;
		multi[0][2] = 3;
		multi[1][0] = 4;
		multi[1][1] = 5;
		multi[1][2] = 6;
		multi[2][0] = 7;
		multi[2][1] = 8;
		multi[2][2] = 9;
		for(int ix = 0; ix < multi.length; ix++) {
			for(int jx = 0; jx < multi[ix].length; jx++) {
				System.out.println(multi[jx][ix]);
			}
		}
	}
}