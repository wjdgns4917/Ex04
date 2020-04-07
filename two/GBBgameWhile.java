package com.java.two;

import java.util.Scanner;

public class GBBgameWhile {

	public static void main(String[] args) {
		//°¡À§1 ¹ÙÀ§2 º¸3
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			
		System.out.println("<<GBBgame>>");	
		System.out.println("°¡À§:1 ¹ÙÀ§:2 º¸:3");
		System.out.println("Ã¶¼ö ÀÔ·Â");
		int cNum=sc.nextInt();
		if(cNum==-1) break;
		
		System.out.println("¿µÈñ ÀÔ·Â");
		int yNum=sc.nextInt();
		if (yNum==-1) break;
		boolean cFlag=(cNum==1 && yNum==3) || (cNum==2 && yNum==1) 
				|| (cNum==3 && yNum==2);
		
		//Ã¶¼ö ½Â¸®
		if (cFlag) {
			System.out.println("Ã¶¼ö ½Â¸®");}
		
		//¿µÈñ ½Â¸®
		else if ((cNum==3 && yNum==1) || (cNum==1 && yNum==2)
				|| (cNum==2 && yNum==3)) {
			System.out.println("¿µÈñ ½Â¸®");}
	
		//¹«½ÂºÎ
		else {
			System.out.println("¹«½ÂºÎ");
		}
		}
	
	}
		
}
