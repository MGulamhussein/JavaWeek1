package doggo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dogo {
public static void main(String[] args) {
	
	System.out.println(numToSpokenEnglish(10));
}

public static String numToSpokenEnglish(int dogPlace) {
	String[] spokenEnglish = new String[100];
	for (int i = 0; i<100; i++) {
		if (((i) % 10)==0) {
			spokenEnglish[i] = ((i+1) + "st");
			
		} else if (((i-1) % 10) == 0) {
			spokenEnglish[i] = ((i+1) + "nd");
			
		} else if (((i-2) % 10) == 0) {
			spokenEnglish[i] = ((i+1) + "rd");
			
		} else {
			spokenEnglish[i] = ((i+1) + "th");
			
		}
	}
		spokenEnglish[10] = ("11th");
		spokenEnglish[11] = ("12th");
		spokenEnglish[12] = ("13th");
		spokenEnglish[dogPlace-1] = ("Doggo");
		return (Arrays.toString(spokenEnglish));
		
	

	}
		
				
}
		
	










