import java.util.Scanner;

public class WzorHerona {
		
		     
		
		    public static void main ( String args[] )
		
		    {
		    	Scanner skaner = new Scanner(System.in);
		
		        System.out.print("Enter side 'a' of the triangle: ");
		
		        double a = skaner.nextDouble();
		
		         
		
		        System.out.print("Enter side 'b' of the triangle: ");
		
		        double b = skaner.nextDouble();
		
		        
		
		        System.out.print("Enter side 'c' of the triangle: ");
		
		        double c = skaner.nextDouble();
		
		         
		
		        double s = 0.5 * (a + b + c);
		         double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		         
			        if (a +b < c) {
			        	 
			        	 System.out.println("It is not a triangle");
						
					}
		         
		       
			        else {
		
		        System.out.print("Field is  " + area);
		
			        }
		
		         
		
		    }


}
