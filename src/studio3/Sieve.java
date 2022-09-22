package studio3;

import java.util.Scanner;

public class Sieve {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("What is n? ");

		int n = in.nextInt();

		boolean[]prime = new boolean [n - 1];

for (int i = 0; i <= n - 1; i++) {
	prime [i] = true;
}
		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (prime[i - 2] == true)
				
			{
				System.out.print(i + ", ");
				for (int j = i*2; j <= n; j = j + i)
					prime [j] = false;
			}
			

		}
		
	}

}
