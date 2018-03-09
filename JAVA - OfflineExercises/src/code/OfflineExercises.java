package code;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		
		String doubleCharFinal="";
		for(int i=0;i<input.length();i++) {
			doubleCharFinal = ""+ input.charAt(i) + input.charAt(i);
		}
		
		return doubleCharFinal;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String input) {
		
	String [] sandwhichFilling = input.split("bread");
	
		//was going to 
		
		
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
		boolean spacedEvenly;
		
		int [] evenSpacing = new int[3];
		evenSpacing[0]=a;
		evenSpacing[1]=b;
		evenSpacing[2]=c;
		if( (evenSpacing[0] + evenSpacing[1] +evenSpacing[2]) %3==0) {
			spacedEvenly = true;
			
		}
		else {
			spacedEvenly = false;
		}
		return spacedEvenly;
		
//		I tried doing the sort method and failed :( 
//		List<Integer>evenSpacing=new ArrayList<Integer>();
//		evenSpacing.add(a);
//		evenSpacing.add(b);
//		evenSpacing.add(c);
//		Collections.sort(evenSpacing);
//		
//		evenSpacing.
//		
//		
//		
//		if (evenSpacing[2] - evenSpacing[1] == evenSpacing[1] - evenSpacing[0]) {
//			spacedEvenly=false;
//		}
//		
//		
//		return spacedEvenly;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		char[] stringToChar = new char[a];
		String finalOutput="";

		for (int i = 0; i < a; i++) {
			stringToChar[i] = input.charAt(i);
		}
		for (int i = (stringToChar.length - (a + 1)); i < stringToChar.length; i++) {
			stringToChar[i] = input.charAt(i);
		}
		for (char i : stringToChar) {
			finalOutput = "" + i;
		}
// can't get it to print array
		return finalOutput;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		
	
		
		
		return false;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		return "";
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		
		int element[] = new int [input+3];
		element[0]=0;
		element[1]=1;
		for(int i=2; i< input+3;i++) {
			
			element[i]=element[i-1]+element[i-2];
		}
		
		
		
		return element[input];
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		
		
		return -1;
	}

}
