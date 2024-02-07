package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// getting sticks
		System.out.print("Enter a number: ");
		// establishing variables
		int n = in.nextInt();
		boolean [] values = new boolean[n];
		
		for (int i = 0; 2 <= i <= n; i++)
		{
			for (i < j <= n)
			{
				if (i % 2 == 0)
				{
					values [i] = true;
					
				}
				
			}
			
		}

	}

}
