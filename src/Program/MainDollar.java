package Program;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class MainDollar {
	
	public static void main(String[] args) {
		
		double brought;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price today?");
		System.out.printf("%.2f%n", CurrencyConverter.DollarPrice);
		System.out.println("How many dollars will be brought?");
		brought = sc.nextDouble();
		System.out.println("Amount to be paid in reais: ");
		double converted = CurrencyConverter.Converter(brought);
		System.out.println(converted);
		
		
		
		sc.close();
		
		
	}
	

}
