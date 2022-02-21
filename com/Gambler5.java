package com.bl;

import java.util.Scanner;

public class Gambler5
{
		public static void main(String[] args) {

			int no_of_days=30;


			//input from user taken using scanner object
			Scanner sc=new Scanner(System.in);

			//input from user for both stack value and bets value
			System.out.println("enter stake of every day");
			int stake =sc.nextInt();

			System.out.println("enter bet of every day");
			int bet=sc.nextInt();

			int currentstake=stake;


			//maximum stack value and minimum stack value taken
			int maxstack= currentstake + 50 % currentstake;
			int minstack= currentstake - 50 % currentstake;
			int maxWon=0,won=0,daysWon=0;
			int maxLoss=0,daysLoss=0;
			int totalGames=0,lostGames=0,wonGames=0;


			for(int i=1;i<=30;i++)
			{
				int minstake = 0;
				int maxstake = 0;
				while(currentstake < maxstake && currentstake > minstake) 
				{
				   int number=(int) (Math.floor(Math.random()*10) % 2);
					//System.out.println("number:: "+number);
						if(number==0)
						{
							currentstake=currentstake-bet; 
							maxLoss++; lostGames++;
						}
						else
						{
							currentstake=currentstake+bet; 
							maxWon++;wonGames++;
						}
					if(stake/2==currentstake)
						break;
				}
				//System.out.println("Total::"+totalGames+"---Lost :"+lostGames);
				if(wonGames>lostGames)
					daysWon++;
				else
					daysLoss++;
				//System.out.println("currentstack--"+currentstack);

			}

			 int amount30Days=maxWon>maxLoss?maxWon-maxLoss:maxLoss-maxWon;

				System.out.println("For 1 month,Days won is:"+daysWon+" & amount is:"+maxWon);
				System.out.println("For 1 month,Days lost is:"+daysLoss+" & amount is:"+maxLoss);


		}

		}


