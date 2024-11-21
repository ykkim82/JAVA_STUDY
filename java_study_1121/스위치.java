package java_study_1121;

import java.util.Scanner;

public class 스위치 {

	public static void main(String[] args) {
		char grade = 'a';
		switch(grade) {
		case 'a' :
			System.out.println("A학점 입니다.");
			break;
		case 'b' :
			System.out.println("B학점 입니다.");
			break;
		default :
			System.out.println("잘못된 값입니다.");
		}

		// 문제 1: 1~5까지의 숫자를 입력받아 해당하는 과일이름을 출력
		// (1:사과, 2:바나나, 3:오렌지, 4:포도, 5:복숭아

		Scanner scan = new Scanner(System.in);
		System.out.print("1~5 값을 입력하세요 :");
		int n_num = scan.nextInt();
		
		switch(n_num) {
		case 1 :
			System.out.println("사과");
			break;
		case 2 :
			System.out.println("바나나");
			break;
		case 3 :
			System.out.println("오렌지");
			break;
		case 4 :
			System.out.println("포도");
			break;
		case 5 :
			System.out.println("복숭아");
			break;
		default :		
			System.out.println("1~5 값이 아닙니다.");	
		}
	}
}
