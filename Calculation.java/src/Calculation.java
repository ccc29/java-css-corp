
import java.util.Scanner;
public class Calculation {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num1=0,num2=0;
		System.out.printf("Enter the first number:\t ");
		num1 = input.nextInt();
		System.out.printf("Enter the second number:\t ");
		num2 = input.nextInt();
		
		System.out.printf("\tsum = \t\t %d\n", num1+num2);
		System.out.printf("\tProduct =\t %d\n", num1*num2);
		System.out.printf("tDifference = \t %d\n", num1-num2);
		System.out.printf("\tQuotient = \t %d\n", num1/num2);
	}

}
