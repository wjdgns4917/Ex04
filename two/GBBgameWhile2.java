package com.java.two;

import java.util.Scanner;

public class GBBgameWhile2 {

	public static void main(String[] args) {
		//if ���
		//����1 ����2 ��3
		//��ӹݺ� -1 �Է� exit
		
		//�迭(arr)�� ���� �̿��Ͽ�
		//���� �¸� : 10���߿� 3�� �¸�
		//ö�� �¸� : 10���߿� 3�� �¸�
		//���º� : 10���߿� 4�� ���º�
		Scanner sc=new Scanner(System.in);
		int cnt=0;//����Ƚ��
		//�¸�Ƚ�� �迭
		int arr[]=new int[3];
		
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
			arr[0]++;//�¸�Ƚ�� ����
			System.out.println("ö�� �¸�");}
		
		//���� �¸�
		else if ((cNum==3 && yNum==1) || (cNum==1 && yNum==2)
				|| (cNum==2 && yNum==3)) {
			arr[1]++;
			System.out.println("���� �¸�");}
	
		//���º�
		else {
			arr[2]++;
			System.out.println("���º�");
		}
		cnt++;
		}
			System.out.println("����Ƚ�� : "+cnt);
			System.out.println("ö���¸� : "+cnt+"�� �� "+arr[0]+"�� �¸�");
			System.out.println("����¸� : "+cnt+"�� �� "+arr[1]+"�� �¸�");
			System.out.println("���º� : "+cnt+"�� �� "+arr[2]+"�� ���º�");
	}
		
}
