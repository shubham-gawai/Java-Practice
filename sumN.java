import java.util.Scanner;

public class sumN {
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			
			int n = input.nextInt();
			int sum = 0;
			
			for(int i=0; i<n; i=i+1) {
				sum = sum+i;
			}
			System.out.println(sum);
			
		}
		 
}		//sum of all the numbers till N :

		//here we have 0 as our first digit so we can get sum of elements till first number as of given input ;
		//for example 5 is input sum will be 10 && for 6 input sum will be 15;