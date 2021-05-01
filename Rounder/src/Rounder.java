import java.util.Scanner;
public class Rounder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter value: ");
		double height = input.nextDouble();
		
		System.out.printf("Your rounded value is %.1f cm", height);
	
		input.close();
	}

}
