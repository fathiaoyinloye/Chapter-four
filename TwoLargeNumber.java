import java.util.Scanner;

public class TwoLargeNumber{
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int largest = 0;
		int largest2 = 0;
		for(int count = 0; count < 10; count++){
			System.out.print("Enter a number: ");
			number = scanner.nextInt();
			if(count == 0){
				largest2 = number;
			}

			if (number > largest){
				largest = number;
			}
			else if(number > largest && number > largest2){
				largest2 = number; 
			}
		}
		System.out.println("The largest number is: " + largest);
		System.out.println("The second largest number is: " + largest2);

	}
}