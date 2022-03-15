import java.util.Scanner;
public class Larger {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
	    int num1=0, num2=0, bigger = 0;
	    System.out.printf("Enter first number: ");
	    num1 = input.nextInt();
	    System.out.printf("Enter second number: ");
	    num2 = input.nextInt();
	    
	    if(num1>num2) {
	    	bigger=num1;
	    	System.out.printf("%d is Larger", bigger);
	    }
	    else if (num1<num2) {
	    	bigger = num2;
	    	System.out.printf("%d is Larger", bigger);
	    }
	    else {
	    	System.out.printf("The numbers are equal");
	    }
	}

}
