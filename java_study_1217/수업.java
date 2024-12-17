package java_study_1217;

import java.util.Random;
import java.util.Scanner;

/*
 * 계산기 클래스는 더 이상 수정 불가능
 */
class 계산기{
	public int sum(int x, int y)
	{
		return x + y;
	}
}

class 계산기2{
	public int sum(int x, int y)
	{
		return x + y;
	}
	public int minus(int x, int y)
	{
		return x - y;
	}
}

// *****extends : 상속
// '계산기3'(자식클래스 == subClass) / '계산기' (부모클래스 == superClass)
/*
 * 
 */

class 계산기3 extends 계산기{
	//@Override : 오버라이딩 (부모클래스 메소드 *******
	/*
	 * 오버로딩 : 메소드 '이름 중복 허용'하기 (파라미터 타입 다르게 지정)
	 * 오버라이딩 : 부모클래스에 정의된 메소드를 자식클래스에서 호출해서 '재정의'
	 */
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return super.sum(x, y);
	}
	public int minus(int x, int y)
	{
		return x - y;
	}
}

public class 수업 {
	public static void main(String[] args) {
		계산기 계산기1 = new 계산기();
		int result = 계산기1.sum(10, 10);
		System.out.println("결과 : " +  result);
		
		// 빼기와 더하기 기능이 있는 클래스가 필요 (상속?!)
		/*
		 * 자바는 무료 오픈소스이기 때문에 내장클래스를 확인할 수 있다.
		 */
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		계산기3 계산기3 = new 계산기3();
		계산기3.sum(10, 20); // 자식클래스가 부모클래스에 있는 메소드 사용 가능
		
		// ctrl + shift + o
		// ctrl + shift
		// 내장함수/내장클래스에 ctrl 마우스 대기
	}
}
