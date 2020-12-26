import java.util.*;
import java.util.Scanner;
class tictactoe
{
	public static void uc2()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Chhose between X and O: ");
	        String input=sc.nextLine();
		if(input.equals("X"))
		{
			System.out.println("It is Player turn");
		}
		else {
			System.out.println("O has been chosen for computer");
		}

	}
	public static void uc1()
	{
		char board[]=new char[10];
		for(int i=1;i<10;i++)
		{
			System.out.println(board[i]+ " ");
			board[i]='\0';
		}
	
		System.out.println("|---|---|---|");
		System.out.println("|---|---|---|");
		System.out.println("|---|---|---|");
		System.out.println("|---|---|---|");
		System.out.println("|---|---|---|");
		System.out.println();
	}


public static void main(String[] args)
{
	tictactoe ob=new tictactoe();
	//Scanner sc=new Scanner(System.in);
	//String input=sc.nextLine();
	ob.uc1();
	ob.uc2();
}
}


