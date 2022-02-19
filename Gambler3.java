package com.bl;

import java.util.Scanner;

public class Gambler3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stake of every day");
		int stake =sc.nextInt();
		System.out.println("enter bet of every day");
		int bet=sc.nextInt();
		int presentcash=stake;
		double number=Math.floor(Math.random()*10) % 2;
		//System.out.println(number);
		int maxstake= stake + 50 %stake;
		int minstake= stake - 50 %stake;

		int currentstake = 0;
		while(currentstake < maxstake && currentstake > minstake)
		if(number==0) {
			currentstake--;
		}
		else
		{
			
			currentstake++;
		}
		System.out.println("Current stake is  "+currentstake);
		
		
		sc.close();
	}}
	
		