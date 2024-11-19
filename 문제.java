package java_study_1119;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int 용돈 = 10000;
		용돈 -= 3000; // 간식 구매
		용돈 += 5000; // 심부름 보상
		System.out.println("용돈 = " + 용돈);		
		/*
		 * 문제 1번 정답 : 12000원
		 */

		int 점수 = 80;
		점수 += 5; // 보너스 점수
		점수 *= 2; // 더블 점수
		System.out.println("점수 = " + 점수);		
		/*
		 * 문제 2번 정답 : 170
		 */

		int 나이 = 20;
		boolean 면허증소지 = true;
		boolean 운전가능 = (나이 >= 18) && 면허증소지;
		System.out.println("운전가능 = " + 운전가능);		
		/*
		 * 문제 3번 정답 : true
		 */
		
	    면허증소지 = true;
		운전가능 = !면허증소지;
		System.out.println("운전가능 = " + 운전가능);
		/*
		 * 문제 4번 정답 : false
		 */
		

		/*
		 * 문제 5번 정답 :
		 */
		int a = 10;
		int b = 5;
		System.out.println("a와 b의 곱 : " + a*b);

		/*
		 * 문제 6번 정답 :
		 */
		boolean p = true;
		boolean q = false;
		System.out.println("p && q : " + (p && q));

		/*
		 * 문제 7번 정답 :
		 */
		final double PI = 3.14;
		double radius = 5.0;
		double area = PI * radius * radius;
		System.out.println("면적 : " + area);

		/*
		 * 문제 8번 정답 :
		 */
		double weight = 70.5;
		double height = 1.77;
		double bmi = 0;
		bmi = weight / (height * height);
		System.out.println("BMI = " + bmi);

		int 대기번호 = 1;
		System.out.println("다음 번호: " + 대기번호++);
		System.out.println("다음 번호: " + 대기번호++);
		System.out.println("다음 번호: " + 대기번호);
		/*
		 * 문제 9번 정답 : 3
		 */

		int age = 32;
		int year = 2024;
		int result = 0;
		result = year - 32;
		System.out.println("출생 연도는 : " + result);		
		/*
		 * 문제 10번 정답 : 1992
		 */

		/*
		 * 문제 11번 정답 :
		 */
		int obak = 500;
		int bak = 100;
		int change = 0;
		System.out.print("거스름돈을 입력하세요 : ");
		int myMoney = scan.nextInt();
		
		int n_no_obak = 0;
		int n_no_bak = 0;
		n_no_obak = myMoney / obak;
		n_no_bak = (myMoney % obak) / bak;
		
		System.out.println("오백원 : " + n_no_obak + "개");
		System.out.println("백원 : " + n_no_bak + "개");
	}

}
