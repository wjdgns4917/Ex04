package com.java.one;

import java.util.Scanner;

public class ScoreSumTest {

	public static void main(String[] args) {
		//�迭 arr 5��¥�� �����
		//���� �Է�
		//�հ� ��� ���
		//��� �Է�
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		float avg=0.0f;
	
				boolean flag=false;
				while (true) {
					int tot=0;
					for (int i = 0; i < arr.length; i++) {
						arr[i]=sc.nextInt();
					if (arr[i]==-1) {
						System.out.println("����");
						flag=true;
						break;
					}
						tot +=arr[i];
					}
						avg = tot/arr.length;
					if (flag==true) {
						break;
					}
					
					System.out.println("�ο� : "+arr.length);
					System.out.println("�����հ� : "+tot);
					System.out.println("������� : "+avg);				
				
		}
}
}			


