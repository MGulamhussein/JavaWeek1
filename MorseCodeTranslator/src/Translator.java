import java.util.HashMap;
import java.util.Map;

public class Translator {

	public void morseToEnglish(String morseCode) {

		Map<String, String> morse = new HashMap<>();
		morse.put(".-", "a");
		morse.put("-...", "b");
		morse.put("-.-.", "c");
		morse.put("-..", "d");
		morse.put(".", "e");
		morse.put("..-.", "f");
		morse.put("--.", "g");
		morse.put("....", "h");
		morse.put("..", "i");
		morse.put(".---", "j");
		morse.put("-.-", "k");
		morse.put(".-..", "l");
		morse.put("--", "m");
		morse.put("-.", "n");
		morse.put("---", "o");
		morse.put(".--.", "p");
		morse.put("--.-", "q");
		morse.put(".-.", "r");
		morse.put("...", "s");
		morse.put("-", "t");
		morse.put("..-", "u");
		morse.put("...-", "v");
		morse.put(".--", "w");
		morse.put("-..-", "x");
		morse.put("-.--", "y");
		morse.put("--..", "z");
		morse.put("/", " ");
		
		String[] translate = morseCode.split("");
		for(int i =0; i<translate.length; i++) {
			System.out.print(morse.get(translate[i]));
		}

	}

	public void englishToMorse(String englishToTranslate) {
		

		Map<String, String> english = new HashMap<>();
		english.put("a", ".-");
		english.put("b", "-...");
		english.put("c", "-.-.");
		english.put("d", "-..");
		english.put("e", ".");
		english.put("f", "..-.");
		english.put("g", "--.");
		english.put("h", "....");
		english.put("i", "..");
		english.put("j", ".---");
		english.put("k", "-.-");
		english.put("l", ".-..");
		english.put("m", "--");
		english.put("n", "-.");
		english.put("o", "---");
		english.put("p", ".--.");
		english.put("q", "--.-");
		english.put("r", ".-.");
		english.put("s", "...");
		english.put("t", "-");
		english.put("u", "..-");
		english.put("v", "...-");
		english.put("w", ".--");
		english.put("x", "-..-");
		english.put("y", "-.--");
		english.put("z", "--..");
		english.put(" ", "/");

		String[] translate = englishToTranslate.split("");
		for(int i =0; i<translate.length; i++) {
			System.out.print(english.get(translate[i]));
			
		}
		
	}

}
