package _01_Lambda_Methods;

public class LambdaMethods {
	static String fin;
	static String finn;
	static String finnn;
	static String finnnn;
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s)->{
			System.out.println(" ");
			System.out.println(s);
			
			fin = "";
			
			for (int i = s.length()-1; i >= 0; i--) {
				fin += s.charAt(i);
			}
			System.out.println(fin);
			
		}, "taco");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			System.out.println(" ");
			System.out.println(s);
			
			finn = "";
			
			for (int i = 0; i <= s.length()-1; i++) {
			if (i % 2 == 0) {
				finn += s.toUpperCase().charAt(i);
			}
			else {
				finn += s.charAt(i);
			}
			}
			System.out.println(finn);
			
		}, "taco");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		printCustomMessage((s)->{
			System.out.println(" ");
			System.out.println(s);
			
			finnn = "";
			
			for (int i = 0; i <= s.length()-1; i++) {
			  finnn += s.charAt(i) + ".";
			}
			System.out.println(finnn);
			
		}, "taco");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		
		printCustomMessage((s)->{
			System.out.println(" ");
			System.out.println(s);
			
			finnnn = "";
			
			for (int i = 0; i <= s.length()-1; i++) {
			  if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
				finnnn += s.charAt(i);
			}
			}
			System.out.println(finnnn);
			
		}, "taco");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
