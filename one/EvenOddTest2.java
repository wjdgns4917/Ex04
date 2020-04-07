package com.java.one;

import java.util.Scanner;

public class EvenOddTest2 {

	public static void main(String[] args) {
		//입력 숫자 2개 받아서 3개짜리 배열(arr)에 앞쪽부터 저장
		//입력된 두개의 숫자를 더한후 짝홀을 구분하고
		//더해진 결과값을 배열에 3번째 입력하고
		//전체 출력
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		
		
		System.out.println("숫자를 2개 입력하시오");
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int num3=num1+num2;
//		if ((num3)%2==0) {
//			System.out.println("짝수");}
//		else {
//			System.out.println("홀수");}
//		System.out.print(num1);
//		System.out.print(num2);
//		System.out.print(num3);
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		
		int pNum=arr[0]+arr[1];
		
		if (pNum%2==0) {
			System.out.println("짝수");}
		else {
			System.out.println("홀수");}
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
