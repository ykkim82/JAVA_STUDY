package java_study_1122;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		/*
		 * 문제 1 : 
		 */
		for(int i=1; i<11 ; i++)
		{
			System.out.println(i);
		}

		/*
		 * 문제 2 : 
		 */
		for(int i=1; i<101 ; i++)
		{
			if (i%2==0)
				System.out.println(i);
		}

		/*
		 * 문제 3 : 
		 */
		int q3_cnt = 0;
		for(int i=1; i<101 ; i++)
		{
			if (i%2==0)
			{
				q3_cnt++;
			}
		}
		System.out.println("1~100 중 짝수 갯수 : " + q3_cnt);

		/*
		 * 문제 4 : 
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int q4_a = scan.nextInt();
		for (int i=1; i < 9 ; i++)
		{
			System.out.println(q4_a + " x " + i + " = " + q4_a * i);
		}
		   
		/*
		 * 문제 5 : 
		 */
		int q5_sum_multiples_of_three = 0;
		for(int i=1; i<101 ; i++)
		{
			if (i%3==0)
			{
				q5_sum_multiples_of_three = q5_sum_multiples_of_three + i;
			}
		}
		System.out.println("1~100 중 3의 배수의 합 : " + q5_sum_multiples_of_three);
		
		/*
		 * 문제 6 : 
		 */
		System.out.print("Factorial 구할 수 입력 :");
		int q6_a = scan.nextInt();
		int q6_factorial = 1;
		for (int i = 0 ; i < q6_a ; i++)
		{
			q6_factorial = (i + 1) * q6_factorial;
		}
		System.out.println(q6_a + "! = " + q6_factorial);

		/*
		 * 문제 7 : 
		 */
		for (int i = 0 ; i < 100 ; i++)
		{
			if (i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if (i%3 == 0)
				System.out.println("Fizz");
			else if (i%3 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);				
		}

		/*
		 * 문제 8 : 
		 */
		int q8 = 0;
		for(int i = 0; i < 10 ; i++)
		{
			q8 = q8 + (i+1);
		}
		System.out.println("1~10 합 : " + q8);
		   

		/*
		 * 문제 9 : 9번 10번 풀지 말 것
		 */

		/*
		 * 문제 10 : 9번 10번 풀지 말 것
		 */

		/*
		 * 문제 11 : 
		 */
		int q11_rate_per_hour = 2;
		int q11_init_no_germ = 2;
		int q11_t = 10;
		int q11_no_germ = 0;
		int q11_ans = 0;

		q11_no_germ = q11_init_no_germ;
		for (int i=0 ; i < 10 ; i++)
		{			
			q11_no_germ = q11_no_germ * q11_rate_per_hour;
		}
		q11_ans = q11_no_germ;
		System.out.println("최종 세균 수 : " + q11_ans);

		/*
		 * 문제 12 : 
		 */

		System.out.print("정수 입력 :");
		int q12_input = scan.nextInt();
		
		int q12_temp = q12_input;
		int q12_cnt = 0;
		while(true)			
		{
			if (q12_temp % 2 == 0)
				q12_temp = q12_temp / 2;
			else
				q12_temp = q12_temp * 3 + 1;
			
			q12_cnt++;
			if (q12_temp == 1)
				break;
		}
		
		System.out.println("반복한 수 : " + q12_cnt);
	}

}
