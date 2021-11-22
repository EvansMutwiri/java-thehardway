import java.util.Scanner;

public class Sequencing {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double price = 0, salesTax, total;
		
		System.out.print("How much is the price?");
		price = s.nextDouble();
		
		salesTax = price * 0.0825;
		total = price + salesTax;
		
		System.out.println("Item price: \t" + price);
		System.out.println("Sales tax:\t" + salesTax);
		System.out.println("TotalCost:\t" + total);
		
	}
}
