import java.util.Scanner;
public class Product {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int integer1;
		int integer2;
		int integer3;
		
		System.out.println("Enter the first number");
	    integer1 = input.nextInt();
	    System.out.println("Enter the second number");
	    integer2 = input.nextInt();
	    System.out.println("Enter the third number");
	    integer3 = input.nextInt();
	    
	    System.out.printf("The product of three integers is %d:", integer1* integer2* integer3);
	    
	 }
}
