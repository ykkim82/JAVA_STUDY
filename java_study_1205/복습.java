package java_study_1205;

public class 복습 {

	public static void main(String[] args) {
		
		/*
		 * 1. 사칙연산 - 거스름돈
		 */
		
		int money = 74900;
		// 결과 -> 오만원 1장, 만원 2장, 천원 4장, 5백원 1개, 100원 4개;
		
		/*
		int n_value_오만 = 50000;
		int n_value_일만 = 10000;
		int n_value_오천 = 5000;
		int n_value_일천 = 1000;
		int n_value_오백 = 500;
		int n_value_일백 = 100;
		
		int n_num_오만 = 0;
		int n_num_일만 = 0;
		int n_num_오천 = 0;
		int n_num_일천 = 0;
		int n_num_오백 = 0;
		int n_num_일백 = 0;
		
		n_num_오만 = money / n_value_오만;
		money = money % n_value_오만;
		n_num_일만 = money / n_value_일만;
		money = money % n_value_일만;
		n_num_오천 = money / n_value_오천;
		money = money % n_value_오천;
		n_num_일천 = money / n_value_일천;
		money = money % n_value_일천;
		n_num_오백 = money / n_value_오백;
		money = money % n_value_오백;
		
		System.out.println("오만" + n_num_오만);
		System.out.println("일만" + n_num_일만);
		System.out.println("오천" + n_num_오천);
		System.out.println("일천" + n_num_일천);
		System.out.println("오백" + n_num_오백);
		System.out.println("일백" + n_num_일천);
		*/
		String[] na_legend = {"오만", "일만", "오천", "일천", "오백", "일백"};
		int[] na_value = {50000, 10000, 5000, 1000, 500, 100};
		int[] na_number = {0, 0, 0, 0, 0, 0};
				
		for (int i = 0 ; i < na_value.length ; i++)
		{
			na_number[i] = money / na_value[i];
			money = money % na_value[i];			
		}
		for (int i = 0 ; i < na_value.length ; i++)
		{
			System.out.println(na_legend[i] + " : " + na_number[i]);
		}
		
		// Java 에서, 상수 선언 시 final
		
		// 지름이 주어질때 원의 면적 구하기
		final double PI = 3.14;
		double d_radius = 5.0;
		
		System.out.println(PI*d_radius*d_radius);
		
		// 직각삼각형의 한 변의 길이가 주어지고 빗변의 길이가 주어지면 나머지 변의 길이의 제곱을 출력
		double d_a_length = 3;
		double d_c_length = 5;
		double d_b_length = d_c_length*d_c_length - d_a_length*d_a_length;
		System.out.println("길이 제곱\t: " + d_b_length);		
		System.out.println("길이\t: " + Math.sqrt(d_b_length));
		
		int[] array = {1,3,5};
		System.out.println(array[0]);
		System.out.println(array[array.length-1]);
		
		int n_temp = array[1];
		array[1] = array[2];
		array[2] = n_temp;
		
		for(int i : array)
			System.out.println("i : " + i);
		
		
	}
}
