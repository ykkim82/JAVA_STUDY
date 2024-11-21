package java_study_1121;

import java.util.Scanner;

public class 수업 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int 점수 = scan.nextInt();
		
		if (점수 >= 80)
		{
			System.out.println("합력입니다.");
		}
		else
		{
			System.out.println("불합력입니다.");			
		}
		
		// 중첩 if
		System.out.print("점수2를 입력하세요 : ");
		int 점수2 = scan.nextInt();
		if (점수2 >= 90 && 점수 <= 100)
			System.out.println("A등급");
		else if (점수2 < 90 && 점수2 > 80)
			System.out.println("B등급");
		else if (점수2 < 80 && 점수2 > 70)
			System.out.println("C등급");
		else
			System.out.println("F등급");
		
	}

}
