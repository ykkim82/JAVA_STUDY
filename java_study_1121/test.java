package java_study_1121;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1~5 값을 입력하세요 :");
		int n_num = scan.nextInt();
		
		switch(n_num) {
		case 1 :
			System.out.println("사과");
		case 2 :
			System.out.println("바나나");
		case 3 :
			System.out.println("오렌지");
		case 4 :
			System.out.println("포도");
		case 5 :
			System.out.println("복숭아");
		default :		
			System.out.println("1~5 값이 아닙니다.");	
		}
		
		//swith case 문에서, break가 없는 경우 case 가 true라고 판단된 이후에는 case 가 if 처럼 참과 거짓을 판단하지 않는듯.
	}

}
