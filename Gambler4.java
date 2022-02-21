package com.bl;

import java.util.Scanner;

public class Gambler4 
{
	
		public static void main(String[] args) 
		{

			//input from user taken using scanner object
			Scanner sc=new Scanner(System.in);

			//input from user for both stack value and bets value
			System.out.println("enter stake of every day");
			int stake =sc.nextInt();

			System.out.println("enter bet of every day");
			int bet=sc.nextInt();

			int currentstack=stake;
			int number=(int)Math.floor(Math.random()*10) % 2;
			int maxWon=0,won=0,daysWon=0;
			int maxLoss=0,daysLoss=0;
			int amt20Day=0;
			int totalGames=0,lostGames=0,wonGames=0;
			int currentstake = 0;
			//maximum stack value and minimum stack value taken
			int maxstake= currentstake + 50 % currentstake;
			int minstake= currentstake - 50 % currentstake;
			for(int i=1;i<=20;i++) {
				while(currentstake < maxstake && currentstake> minstake) {
					if(number==0) {
						//System.out.println("Gambler Loss");
						currentstack=currentstack-bet;
						 maxLoss++;lostGames++;
					}
					else
					{
						//System.out.println("Gambler Win");
						currentstack=currentstack+bet;
						 maxWon++;wonGames++;
					}
					if(currentstack==stake/2) {
						System.out.println("Gambler would resign for the day as stack decreases to 50% of stack");
						break;
					}
				}
				amt20Day=maxWon>maxLoss?maxWon-maxLoss:maxLoss-maxWon;
				if(wonGames>lostGames)
					daysWon++;
				else
					daysLoss++;
			}
			if(maxWon>maxLoss)
			System.out.println("Total Amount Won for 20 days is:"+amt20Day);
			else
			System.out.println("Total Amount Loss for 20 days is:"+amt20Day);


			//System.out.println("Current stack value is  "+currentstack);


			sc.close();
		}
	}

