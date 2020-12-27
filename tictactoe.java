package Tic_Tac_Toe;
import java.util.*;
public class tictactoe 
{
	public void uc2()
	{
		int choice;
	        char input;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter your choice: 1 for X and 2 for O :");
	        choice=sc.nextInt();
	        System.out.println("Chhose between X and O: ");
                input=sc.next().charAt(0);
	        switch(choice)
	        {
	         	case 1:         			
	        		if(input=='X')
	                    	{
	                    		System.out.println("Player chose O for the game");
	                        } 
	                    	else{
	                    		System.out.println("O has been chosen for computer"); 
	                    	}
	                    	break;
	        	case 2:
	                    	if(input=='O')
	                    	{
	                    		System.out.println("Player chose X for the game");
	                    	}
	                    	else{
	                    		System.out.println("X has been chosen for computer");
	                    	}
	                    	break;
	       		default:
	                    	System.out.println("Enter valid Choice");
	                    	break;
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
	    }

	public static void main(String[] args)
	{
		tictactoe t=new tictactoe();
	        t.uc2();
	        t.uc1();
	        }
	}

