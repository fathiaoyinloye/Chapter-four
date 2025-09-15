import java.util.Scanner;

public class Palindromes{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a five digit number: ");
		int number = scanner.nextInt();

		while(true){
			if(number <= 9999 || number >= 100000){
				System.out.print("Invalid input, please input a five digit number");
			}
				System.out.print("Enter a five digit number: ");
		}

		int digit1 = number/10000;
		int digit2 = (number % 10000) / 1000;
		int digit3 = (number % 1000) / 100;
		int digit4 = (number % 100) / 10;
		int digit5 = number % 10;
		
		if(digit1 == digit5 && digit2  == digit4){
			System.out.print( number + " is a palindromes number");
		}
		


	}
}

