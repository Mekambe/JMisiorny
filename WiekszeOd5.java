import java.util.Scanner;

public class WiekszeOd5 {
	 public static void main(String[] args) {
	        System.out.println("write numbers, if you write zero, program ends");
	        Scanner input = new Scanner(System.in);
	        int number;
	        int sum = 0;
	        do {
	            number = input.nextInt(); 
	            sum+= number; 
	            if (sum<5) {
	            	System.out.println("Input number larger than 5");
					
				}
	        } while(number != 0);

	        System.out.println("Sum is : " + sum);
	    }

}
