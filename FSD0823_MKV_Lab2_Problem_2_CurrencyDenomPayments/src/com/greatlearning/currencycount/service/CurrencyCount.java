package com.greatlearning.currencycount.service;

public class CurrencyCount {

	public void notesCountImplementation(int currency[], int amount) {

		// Create instance of new currencyCounter
		int[] currencyCounter = new int[currency.length];

		try {
			for (int i = 0; i < currency.length; i++) {
				if (amount >= currency[i]) {
					currencyCounter[i] = amount / currency[i]; // 10, 0, 1, 0
					amount = amount - currencyCounter[i] * currency[i]; // 0

					if (amount == 0)
						break;
				}
			}

			if (amount > 0) {
				System.out.println("Exact amount cannot be given with the highest denomination. ");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be ");
				for (int i = 0; i < currency.length; i++) {
					if (currencyCounter[i] != 0) {
						System.out.println(currency[i] + ":" + currencyCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid.");
		}
	}
}