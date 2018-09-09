package math.problems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int i = 0;
		int pnt = 0;
		String primeNumbers = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = scan.nextInt();
		scan.close();
		for (i = 1; i <= n; i++){
			int count = 0;
			for (pnt = i; pnt >= 1; pnt--){
				if(i%pnt == 0){
					count = count + 1;
				}
			}
			if (count == 2){
				primeNumbers = primeNumbers + i + "\n";
			}
		}
		System.out.println("The total prime numbers in the series are: ");
		System.out.println(primeNumbers);
	}


}
