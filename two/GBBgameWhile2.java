package com.java.two;

import java.util.Scanner;

public class GBBgameWhile2 {

	public static void main(String[] args) {
		//if »ç¿ë
		//°¡À§1 ¹ÙÀ§2 º¸3
		//°è¼Ó¹Ýº¹ -1 ÀÔ·Â exit
		
		//¹è¿­(arr)¿¡ ÀúÀå ÀÌ¿ëÇÏ¿©
		//¿µÈñ ½Â¸® : 10¹øÁß¿¡ 3¹ø ½Â¸®
		//Ã¶¼ö ½Â¸® : 10¹øÁß¿¡ 3¹ø ½Â¸®
		//¹«½ÂºÎ : 10¹øÁß¿¡ 4¹ø ¹«½ÂºÎ
		Scanner sc=new Scanner(System.in);
		int cnt=0;//°ÔÀÓÈ½¼ö
		//½Â¸®È½¼ö ¹è¿­
		int arr[]=new int[3];
		
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
			arr[0]++;//½Â¸®È½¼ö Áõ°¡
			System.out.println("Ã¶¼ö ½Â¸®");}
		
		//¿µÈñ ½Â¸®
		else if ((cNum==3 && yNum==1) || (cNum==1 && yNum==2)
				|| (cNum==2 && yNum==3)) {
			arr[1]++;
			System.out.println("¿µÈñ ½Â¸®");}
	
		//¹«½ÂºÎ
		else {
			arr[2]++;
			System.out.println("¹«½ÂºÎ");
		}
		cnt++;
		}
			System.out.println("°ÔÀÓÈ½¼ö : "+cnt);
			System.out.println("Ã¶¼ö½Â¸® : "+cnt+"¹ø Áß "+arr[0]+"¹ø ½Â¸®");
			System.out.println("¿µÈñ½Â¸® : "+cnt+"¹ø Áß "+arr[1]+"¹ø ½Â¸®");
			System.out.println("¹«½ÂºÎ : "+cnt+"¹ø Áß "+arr[2]+"¹ø ¹«½ÂºÎ");
	}
		
}
