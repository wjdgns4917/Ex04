package com.java.one;

import java.util.Scanner;

public class ScoreSumTest {

	public static void main(String[] args) {
		//배열 arr 5개짜리 만들어
		//성적 입력
		//합계 평균 출력
		//계속 입력
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		float avg=0.0f;
	
				boolean flag=false;
				while (true) {
					int tot=0;
					for (int i = 0; i < arr.length; i++) {
						arr[i]=sc.nextInt();
					if (arr[i]==-1) {
						System.out.println("종료");
						flag=true;
						break;
					}
						tot +=arr[i];
					}
						avg = tot/arr.length;
					if (flag==true) {
						break;
					}
					
					System.out.println("인원 : "+arr.length);
					System.out.println("성적합계 : "+tot);
					System.out.println("성적평균 : "+avg);				
				
		}
}
}			


