package com.bl;

import java.util.Scanner;

public class Gambler6 
{
	
		public static void main(String[] args) 
		{

			int no_of_days=30;

			int maxWon=0,won=0,daysWon=0;
			int maxLoss=0,daysLoss=0;
			int amt20Day=0;
			int totalGames=0,lostGames=0,wonGames=0;
			int unluckiestDay=0, luckiestDay=0;
			//input from user taken using scanner object
			Scanner sc=new Scanner(System.in);

			//input from user for both stack value and bets value
			System.out.println("enter stake of every day");
			int stake =sc.nextInt();

			System.out.println("enter bet of every day");
			int bet=sc.nextInt();

			int currentstake=stake;


			double number=Math.floor(Math.random()*10) % 2;

			//maximum stack value and minimum stack value taken
			int maxstack= currentstake + 50 % currentstake;
			int minstack= currentstake - 50 % currentstake;
			for(int i=1;i<=no_of_days;i++) {
				while(currentstake < maxstack && currentstake > minstack) {
					if(number==0) {
						currentstake=currentstake-bet; 

						maxLoss++; lostGames++;					//System.out.println("Gambler Loss");

					}
					else
					{
						currentstake=currentstake+bet; 
						maxWon++;wonGames++;
					}
					if(currentstake==stake/2) {
						System.out.println("Gambler would resign for the day as stack decreases to 50% of stack");
						break;
					}
				}
				if(maxWon>maxLoss) {
					luckiestDay=i;
				}
				else {
					daysLoss++;unluckiestDay=i;
				}
			}
				System.out.println("Luckiest Day Max Won on "+luckiestDay+" day.");
				System.out.println("unluckiest Day Max Lost on "+unluckiestDay+" day.");




			sc.close();
		}
	}


