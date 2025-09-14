import java.util.Scanner;

public class MilesPerGallon{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
	
		int count = 0;
		while(count != -1){
			
			System.out.print("Enter Total miles driven: ");
			int miles = scanner.nextInt();

			System.out.print("Enter Total gallons of gas used: ");
			int gallon = scanner.nextInt();

			float miles_per_gallon =  miles/gallon;
	
			System.out.printf("Miles per gallon is %.2f%n", miles_per_gallon);
			System.out.print("Enter -1 to exit or any number to continue");
			count = scanner.nextInt();
		}

	}
}