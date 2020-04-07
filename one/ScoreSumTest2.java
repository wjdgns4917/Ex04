package com.java.one;

import java.util.Scanner;

public class ScoreSumTest2 {

	public static void main(String[] args) {
		//배열 arr 5개짜리 만들어
		//성적 입력
		//합계 평균 출력
		//계속 입력
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int tot=0;
		float avg=0.0f;
		
			while (true) {
				arr[0]=sc.nextInt();
				if (arr[0]==-1) {
					System.out.println("종료");
					break;
				}
				System.out.println("성적 5개 입력하시오");
				
				for (int i = 0; i < arr.length; i++) {
					arr[i]=sc.nextInt();
					tot +=arr[i];
					avg = tot/arr.length;}
				
				System.out.println("인원 : "+arr.length);
				System.out.println("성적합계 : "+tot);
				System.out.println("성적평균 : "+avg);
				}
		}
			
}


