import java.util.Scanner;

public class DoPieciuLiczb {
	 public static void main(String[] args) {
	        System.out.println("write numbers, if you write zero, program ends");
	        Scanner input = new Scanner(System.in); 
	        float number;
	        float sum = 0;
	     
	        
	        
	            float jeden = input.nextFloat();
	            float dwa = input.nextFloat();
	            float trzy = input.nextFloat();
	            float cztery = input.nextFloat();
	            float piec = input.nextFloat();
	            sum = (jeden + dwa + trzy + cztery + piec);
	       
	    

	        System.out.println("Sum is : " + sum);
	    }
}

