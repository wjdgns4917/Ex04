package com.java.one;

import java.util.Scanner;

public class EvenOddTest2 {

	public static void main(String[] args) {
		//�Է� ���� 2�� �޾Ƽ� 3��¥�� �迭(arr)�� ���ʺ��� ����
		//�Էµ� �ΰ��� ���ڸ� ������ ¦Ȧ�� �����ϰ�
		//������ ������� �迭�� 3��° �Է��ϰ�
		//��ü ���
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		
		
		System.out.println("���ڸ� 2�� �Է��Ͻÿ�");
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int num3=num1+num2;
//		if ((num3)%2==0) {
//			System.out.println("¦��");}
//		else {
//			System.out.println("Ȧ��");}
//		System.out.print(num1);
//		System.out.print(num2);
//		System.out.print(num3);
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		
		int pNum=arr[0]+arr[1];
		
		if (pNum%2==0) {
			System.out.println("¦��");}
		else {
			System.out.println("Ȧ��");}
		arr[2]=pNum;
		
		for (int i = 0; i < arr.length; i++) {
			if (i<2) {
			System.out.print(arr[i]+",");
			}
			else {
				System.out.print(arr[i]);	
			}
		}
	}

}
