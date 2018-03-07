import java.util.Scanner;

public class Runner {

	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		String userIn;
		Translator t = new Translator();
		System.out.println("Do you wish to translate from english or morse?");
		String inputOne;
		inputOne = input.nextLine();
		if (inputOne=="morse") {
			System.out.println("Welcome to the Morse to English Translator\n\nPlease enter your message in Morse:\n\n");
			userIn = input.nextLine();
			
			t.morseToEnglish(userIn);
		}
		else if (inputOne== "english") {
			System.out.println("Welcome to the english to Morse Translator\n\nPlease enter your message in lower case:\n\n");
		userIn = input.nextLine();
		
		t.englishToMorse(userIn);
		}
		
		else {
			System.out.println("Invalid input, start programme again");
		}
		

	}
	
}
