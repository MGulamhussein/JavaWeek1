
public class FactorialCalculator {

	public static void main(String[] args) {
		
		factorial(6);
		
	}
	
	public static void factorial(int x) {
			
				int i=2;
				
				for (i=1; i<100; i++) {
					if (x>1) {
						if (x%i==0) {
							x=x/i;
						} else {
							System.out.println("None");
							break;
						}
					}
						else if (x==1) {
							System.out.println(i-1);
							break;
							
						}
				}
				
	}
}
				
					


				
	
	



