package com.java.one;

import java.util.Scanner;

public class ScoreSumTest2 {

	public static void main(String[] args) {
		//�迭 arr 5��¥�� �����
		//���� �Է�
		//�հ� ��� ���
		//��� �Է�
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int tot=0;
		float avg=0.0f;
		
			while (true) {
				arr[0]=sc.nextInt();
				if (arr[0]==-1) {
					System.out.println("����");
					break;
				}
				System.out.println("���� 5�� �Է��Ͻÿ�");
				
				for (int i = 0; i < arr.length; i++) {
					arr[i]=sc.nextInt();
					tot +=arr[i];
					avg = tot/arr.length;}
				
				System.out.println("�ο� : "+arr.length);
				System.out.println("�����հ� : "+tot);
				System.out.println("������� : "+avg);
				}
		}
			
}


