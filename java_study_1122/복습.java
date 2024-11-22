package java_study_1122;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// 
		/*
		 * 문제11
		 */
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i < 30 ; i++)
		{
		int q11_pcs = 7;
		//System.out.print("피자 나누어 먹을 사람 수 :");		
		int q11_n = i;
		int q11_ans = q11_n / q11_pcs + 1;
		System.out.println("최소 피자의 수 : " + q11_ans);

		int q11_ans2 = q11_n / q11_pcs;
		if (q11_ans2 % q11_pcs != 0)
			++q11_ans2;
		
		System.out.println("다른 방법 / 최소 피자의 수 : " + q11_ans2);
		}
		

		System.out.print("금액을 입력하세요 : ");
		double q12_price = scan.nextInt();
		double q12_rate = 0;
		double q12_ans = 0;

		if (q12_price >= 500000)
			q12_rate = 0.20;
		else if (q12_price >= 300000)
			q12_rate = 0.10;
		else if (q12_price >= 100000)
			q12_rate = 0.05;
		else
			q12_rate = 0;
		
		q12_ans = q12_price * (1 - q12_rate);
		System.out.println("할인율 적용된 금액 : " + q12_ans);
	}

}
