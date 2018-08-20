import java.util.Scanner;

public class PoprzecinkuSkaner {
	 public static void main(String[] args) {
	        System.out.println("write numbers, if you write zero, program ends");
	        Scanner input = new Scanner(System.in); 
	        float number;
	        float sum = 0;
	        do {
	            number = input.nextFloat(); 
	        } while(number != 0); 

	        System.out.println("Sum is : " + sum);
	    }
}
