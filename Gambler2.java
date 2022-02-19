package com.bl;

import java.util.Random;
import java.util.Scanner;

public class Gambler2
{
	 
			public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);

				System.out.println("enter won money of every day");
				int won =sc.nextInt();
				System.out.println("enter lost of every day");
				int lost=sc.nextInt();
				int presentcash=won;
				double number=Math.floor(Math.random()*10) % 2;
				//System.out.println(number);
				if(number==0) {
				presentcash--;
				}
				else
				{
					
					presentcash++;
				}
				System.out.println("present cash is  "+presentcash);
			}
		}