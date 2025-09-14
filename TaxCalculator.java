import java.util.Scanner;

public class TaxCalculator{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your total earnings: $");
		int earnings = scanner.nextInt();
		float tax_rate = 0;

		if(earnings <= 30000){
		tax_rate = (20/100) * earnings ;
		}
		else if(earnings > 30000){
		tax_rate =  (20/100) * earnings ;

		System.out.println("Tax payable is: $" + tax_rate );
		}
		
	

	}
}



	