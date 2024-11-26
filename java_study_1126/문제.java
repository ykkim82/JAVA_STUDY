package java_study_1126;

import java.util.Random;

public class 문제 {
	public static void main(String[] args) {
		/*
		 1번)
		 10개의 정수를 저장하는 배열을 선언하고 1부터 10까지의 값으로 초기화한 후,
		 2번째 인덱스와 5번째 인덱스를 곱한 값을 출력하시오.
		 
		 2번)
		 1번 문항 이어서
		 배열에 저장된 값을 모두 더하는 프로그램을 작성하세요.
		 
		 3번)
		 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후, 배열의 요소들 중 짝수만 출력하는 프로그램을 작성하세요.
		 
		 4번)
		 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후, 최댓값을 구하는 프로그램을 작성하세요.
		 
		 */
		
		int []array1 = new int[10];
		for (int i=0 ; i < array1.length; i++)
		{
			array1[i] = i + 1;
		}
		System.out.println("1번 답 : " + array1[1] * array1[4]);
		
		int sum2 = 0;
		for (int i=0 ; i < array1.length; i++)
		{
			sum2 += array1[i];
		}
		System.out.println("2번 답 : " + sum2);

		System.out.println("3번 답 : ");
		int []array3 = new int[10];
		Random rand = new Random();
		for (int i = 0 ; i < 10 ; i++)
		{
			array3[i] = rand.nextInt(100) + 1;
			
			if (array3[i] % 2 == 0)
				System.out.println(array3[i]);
		}
		System.out.println("------------------------");

		int []array4 = new int[10];
		int n_max = -101;
		for (int i = 0 ; i < array4.length ; i++)
		{
			array4[i] = rand.nextInt(100) + 1;
			System.out.println("4번 요소" + i + " : " + array4[i]);	
		}
		
		for (int i = 0 ; i < 10 ; i++)
		{
			if (array4[i] > n_max)
			{
				n_max = array4[i];
			}
		}	
		System.out.println("4번 답 : " + n_max);	
	}

}
