package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Payers;
import entities.PF;
import entities.PJ;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Payers> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Tax payer #" + (i+1) + "data:");
			
			System.out.print("Individual or company (i/c)? ");
			char p = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if(p == 'i') {
				
				System.out.print("Health expenditures: ");
				double healthExpends = sc.nextDouble();
				list.add(new PF(name, income, healthExpends));
				
			} else if (p == 'c') {
				
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new PJ(name, income, employees));
				
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for(Payers payers : list) {
			
			double taxesPaidPayers = payers.taxesPaid();
			sum += taxesPaidPayers;
			System.out.println(payers.getName() + ": $ " + String.format("%.2f", taxesPaidPayers));
			
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
