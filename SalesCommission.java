import java.util.Scanner;

public class SalesCommission{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int receivables = 200;

		int count = 0;
		int total = 0;
		while(count != -1){

		System.out.print("Enter week sales: ");
		int sales = scanner.nextInt();

		total = total + sales;

		System.out.print("Enter -1 if all sales have been inputed or enter any number to continue: ");
		count = scanner.nextInt();
		
		}
		System.out.println(total);


		double sales_interest = total * 9 / 100;
		System.out.println(sales_interest);

		double total_receivables = receivables + sales_interest;
		System.out.printf("The total receivables is %.2f%n", total_receivables);

	}
}