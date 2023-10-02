package com.greatlearning.currencycount.main;

//import Java Scanner Utility
import java.util.Scanner;

//import user created services
import com.greatlearning.currencycount.service.MergeSortImplementation;
import com.greatlearning.currencycount.service.CurrencyCount;

public class CurrencyCountDriver {
	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		CurrencyCount notesCount = new CurrencyCount();

		System.out.println("Welcome Traveller! Your tool to manage your currency payment. ");
		System.out.println("");

		System.out.println("Enter size of currency denominations: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] currency = new int[size];

		System.out.println("Enter the currency denominations value: ");
		for (int i = 0; i < size; i++) {
			currency[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(currency, 0, currency.length - 1);
		notesCount.notesCountImplementation(currency, amount);

		// Close the scanner
		sc.close();

		// Execution Normal
		System.out.println("");
		System.out.println("Welcome Traveller! Visit again. ");

	}
}
