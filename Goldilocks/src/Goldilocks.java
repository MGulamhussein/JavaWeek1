import java.util.ArrayList;

public class Goldilocks {

	public static void main(String[] args) {
		
		System.out.println(checkSeat(100, 120));
		
	}
	
	
	public static ArrayList<String> checkSeat(int weight, int temp){
		
		ArrayList<String> chairs = new ArrayList<String>();
		
		int chairsAndPorridge[][] = {{297,90}, {66,110}, {257,113}, {276,191}, {280,129}, {219,163}, 
			{254,193}, {86,153}, {206,147}, {71,137}, {104,40}, {238,127}, {52,146}, {129,197}, {144,59}, 
			{157,124 },{210,59}, {11,54}, {268,119}, {261,121}, {12,189}, {186,108}, {174,21} , {77,18}, 
			{54,90},{174,52}, {16,129}, {59,181}, {290,123},{248,132}};
		
		for (int i=0; i<chairsAndPorridge.length; i++) {
			if (chairsAndPorridge [i][0] > weight && chairsAndPorridge [i][1] < temp){
				chairs.add("Chair " + (i+1) + " is Suitable");
			}
		
		}
		return chairs;
	}
	
	
	
}
