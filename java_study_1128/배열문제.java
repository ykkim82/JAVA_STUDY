package java_study_1128;

import java.util.Random;

public class 배열문제 {
	public static void main(String[] args) {
		/*
		 * 1번, 4번 맞춰보기
		 * 
		 */

		int []array2 = new int[10];
		for (int i=0 ; i < array2.length; i++)
		{
			array2[i] = i + 1;
		}
		int result = array2[1] * array2[4];
		System.out.println("1번 답 : " + result);

		System.out.println("------------------------");

		Random rand = new Random();
		int []array3 = new int[10];
		for (int i = 0 ; i < array3.length ; i++)
		{
			array3[i] = rand.nextInt(100) + 1;
			System.out.println("4번 요소" + i + " : " + array3[i]);	
		}
		int max = 0;
		for (int i = 0 ; i < 10 ; i++)
		{
			if (max < array3[i])
			{
				max = array3[i];
			}
		}	
		System.out.println("최댓값은 : " + max);	
	}
}
