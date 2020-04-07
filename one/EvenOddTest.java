package com.java.one;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		//입력 숫자 하나 받아서 짝홀구분
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num1=sc.nextInt();
		if (num1%2==0) {
			System.out.println("짝수");}
		else {
			System.out.println("홀수");}
	}

}
