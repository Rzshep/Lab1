import java.util.Scanner;

public class Lab1Jan22 {
	
	public static void main(String[] args) {
		
		char userChar;
		
		userChar = 'y';
		
		while (userChar == 'y' || userChar == 'Y') {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		
		double length = scan.nextDouble();
		
		System.out.print("Enter width: ");
		
		double width = scan.nextDouble();
		
		System.out.print("Enter height: ");
		
		double height = scan.nextDouble();
		
		double area = (length * width);
		
		System.out.println("Area: " + area);
		
		double perimeter = (2 * length) + (2 * width);
		
		System.out.println("Perimeter: " + perimeter);
		
		double volume = (length * width * height);
		
		System.out.println("Volume: " + volume);
		
		System.out.print("Continue? (y/n): ");
		
		userChar = scan.next().charAt(0);
		
		}
		
		
		
	}

}
