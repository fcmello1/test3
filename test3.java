//Fábio Cervi de Mello
//Done
//Test 3

import java.util.ArrayList;
import java.util.Scanner;

class solution
{
	ArrayList<Integer> chocolates = new ArrayList<Integer>();

	void setArray(int N)
	{
		int i;
		int num = 0;
		for(i = 0; i < N; i++)
			chocolates.add(num);
	}

	public int solution(int N, int M)
	{
		int i = 0;
		int choc = 0;

		if((chocolates.get(i)) == 0)
		{
			chocolates.set(i, 1);
			choc++;
		}

		i = (i + M) % N;
		while(chocolates.get(i) == 0)
		{
			chocolates.set(i, 1);
			choc++;
			i = (i + M) % N;
		}

		System.out.println("The number of chocolates eaten is: " + choc);
		return 0;
	}
}


class Program
{
	public static void main(String[] args)
	{
		solution s = new solution();

		Scanner input = new Scanner(System.in);
		
		int M, N;
		//n = number of chocolates
		//m = number of the order you will eat the chocolates

		System.out.print("Type the N: ");
		N = input.nextInt();

		s.setArray(N);

		System.out.print("Type the M: ");
		M = input.nextInt();

		s.solution(N, M);
	}
}