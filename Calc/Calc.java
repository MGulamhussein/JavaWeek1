import java.lang.Math;

public class Calc {
	
	public static void main(String[] args) {
		
		relation(4, 2, 8);
		
	}

	public static void relation(int a, int b, int c) {
		int[][] combination = {{a, b, c}, {a, c, b}, {b, a, c}, {b, c, a}, {c, a, b}, {c, b, a}};
		
		for(int i = 0; i <= 4; i++) {
			switch (i) {
			case 1:
				for(int j = 0; j < combination.length; j++) {
					int result = Math.addExact(combination[j][0], combination[j][1]);
					if (result == combination[j][2]) {
						System.out.println(combination[j][0] + " + " + combination[j][1] + " = " + combination[j][2]);
					}
				}
				break;
			case 2:
				for(int j = 0; j < combination.length; j++) {
					int result = Math.subtractExact(combination[j][0], combination[j][1]);
					if (result == combination[j][2]) {
						System.out.println(combination[j][0] + " - " + combination[j][1] + " = " + combination[j][2]);
					}
				}
				break;
			case 3:
				for(int j = 0; j < combination.length; j++) {
					int result = Math.multiplyExact(combination[j][0], combination[j][1]);
					if (result == combination[j][2]) {
						System.out.println(combination[j][0] + " * " + combination[j][1] + " = " + combination[j][2]);
					}
				}
				break;
			case 4:
				for(int j = 0; j < combination.length; j++) {
					int result = divide(combination[j][0], combination[j][1]);
					if (result == combination[j][2]) {
						System.out.println(combination[j][0] + " / " + combination[j][1] + " = " + combination[j][2]);
					}
				}
				break;
			}
		}
		
	}
	
	public static int divide(int a, int b) {
		int sum = a / b;
		return sum;
	}
}