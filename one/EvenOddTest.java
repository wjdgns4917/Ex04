package com.java.one;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		//�Է� ���� �ϳ� �޾Ƽ� ¦Ȧ����
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int num1=sc.nextInt();
		if (num1%2==0) {
			System.out.println("¦��");}
		else {
			System.out.println("Ȧ��");}
	}

}
