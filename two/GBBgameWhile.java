package com.java.two;

import java.util.Scanner;

public class GBBgameWhile {

	public static void main(String[] args) {
		//����1 ����2 ��3
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			
		System.out.println("<<GBBgame>>");	
		System.out.println("����:1 ����:2 ��:3");
		System.out.println("ö�� �Է�");
		int cNum=sc.nextInt();
		if(cNum==-1) break;
		
		System.out.println("���� �Է�");
		int yNum=sc.nextInt();
		if (yNum==-1) break;
		boolean cFlag=(cNum==1 && yNum==3) || (cNum==2 && yNum==1) 
				|| (cNum==3 && yNum==2);
		
		//ö�� �¸�
		if (cFlag) {
			System.out.println("ö�� �¸�");}
		
		//���� �¸�
		else if ((cNum==3 && yNum==1) || (cNum==1 && yNum==2)
				|| (cNum==2 && yNum==3)) {
			System.out.println("���� �¸�");}
	
		//���º�
		else {
			System.out.println("���º�");
		}
		}
	
	}
		
}
