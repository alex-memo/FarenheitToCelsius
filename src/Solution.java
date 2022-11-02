import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {		 
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a temperature in fahrenheit: ");
		double temperature = input.nextDouble();        
		double celsius = temperature;
		double fahrenheit = temperature; 
		celsius = (5*(fahrenheit-32)/9);
		System.out.print("The fahrenheit degree " + fahrenheit + " is " + celsius + " in celsius." );
	}
}
