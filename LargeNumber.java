import java.util.Scanner;

public class LargeNumber{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int largest = 0;
		
		for(int count = 0; count < 10; count++){
			System.out.print("Enter a number: ");
			number = scanner.nextInt();

			if (number > largest){
				largest = number;
			}
			
			
		}
		System.out.println("The largest number is: " + largest);

	}
}