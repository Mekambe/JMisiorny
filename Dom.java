import java.util.Scanner;

public class Dom {
	 public static void main(String[] args) {
	        System.out.println("write numbers, if you write zero, program ends");
	        Scanner input = new Scanner(System.in); 
	        int number;
	        int sum = 0;
	        do {
	            number = input.nextInt(); 
	            sum+= number; 
	        } while(number != 0);

	        System.out.println("Sum is : " + sum);
	    }
}
