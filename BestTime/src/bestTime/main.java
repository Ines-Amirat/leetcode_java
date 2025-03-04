package bestTime;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the table");
		int N = scanner.nextInt();

		int[] prices = new int[N];
		System.out.println("Give the prices");
		for (int i = 0; i < N; i++) {
			System.out.print("Price " + i + " ");
			prices[i] = scanner.nextInt();
		}

		System.out.println("\n prices table");
		for (int i = 0; i < N; i++) {
			System.out.print(prices[i] + " ");
		}
		System.out.println("\n");

		bestTime b = new bestTime();

		int profit = b.profit(prices);

		if (profit == 0) {
			System.out.print("No Profit");
		} else {
			System.out.print("the Profit is : " + profit);
		}

	}
}
