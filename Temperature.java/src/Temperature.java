import java.util.*;
public class Temperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double celcius;
		double tempInFahrenheit = 0.0;
		
		celcius = (tempInFahrenheit = 32.0)*5.0/9.0;
		System.out.println("Enter the fahrenheit value");
		tempInFahrenheit = input.nextDouble();
		
		System.out.printf("The celsius value of %10.2f is %2.2f", tempInFahrenheit, celcius);
	}

}
