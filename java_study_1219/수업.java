package java_study_1219;

interface CC{
	//인터페이스는 클래스오 다르게 생성자가 없음
	
	/* 인터페이스
	 * 1. 메소드 선언만 가능 (구현 x)
	 * 2. 접근지정자는 'public'만 가능
	 * 
	 * public CC()
	{		
	}
	*/
	
	public void z(); // 메소드 z 선언
}

class AA{
	public void 메시지보여주다()
	{
		System.out.println("안녕하세요.");
	}
}

/*
 *  다중 상속을 가능하게하는 '특별한' 기능이 존재
 */
class BB extends AA implements CC{

	@Override
	public void z() {
		// TODO Auto-generated method stub
		
	}
	// implements : 구현하다.
	
}

public class 수업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 정리,
		 * 자바는 다중상속을 지원하지 않는다.
		 * 인터페이스로 다중상속을 구현한다.
		 * 인터페이스에 정의된 메소드를 강제로 재정의 해야한다.
		 * 클래스로 상속받으면 재정의를 자유롭게 정할 수 있다.
		 * 
		 * 상속 이점
		 * 1. 코드 재사용
		 * 2. 다형성 구현
		 * 3. 계층 구조 형성
		 * 
		 */
	}

}
