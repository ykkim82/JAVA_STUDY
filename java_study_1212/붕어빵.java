package java_study_1212;

class 붕어빵기계
{
	int 붕어빵가격;
	String 붕어빵종류; //팥, 슈크림
	
	// 기본생성자가 설정되어있어
	붕어빵기계(int 붕어빵가격, String 붕어빵종류)
	{
		this.붕어빵가격 = 붕어빵가격;
		this.붕어빵종류 = 붕어빵종류;
		// 필드변수 값을 초기화 할 수 있도록 이어서 코딩
	}
	
	public String 붕어빵내용물추가(String 재료1, String 재료2)
	{
		String 최종재료 = 재료1 + 재료2;
		return 최종재료;
	}
}
public class 붕어빵 {
	public static void main(String[] args) {
		붕어빵기계 길동이네붕어빵 = new 붕어빵기계(1000, "팥");
		System.out.println("붕어빵 가격 : " + 길동이네붕어빵.붕어빵가격);
		System.out.println("붕어빵 종류 : " + 길동이네붕어빵.붕어빵종류);
		
		String 최종재료 = 길동이네붕어빵.붕어빵내용물추가("치즈", "파인애플");
		길동이네붕어빵.붕어빵종류 = 길동이네붕어빵.붕어빵종류 + 최종재료 + "붕어빵";
		길동이네붕어빵.붕어빵가격 = 3000;
		System.out.println("붕어빵 종류 : " + 길동이네붕어빵.붕어빵종류);
		System.out.println("붕어빵 가격 : " + 길동이네붕어빵.붕어빵가격);
		
		붕어빵기계 철수네붕어빵 = new 붕어빵기계(700, "슈크림");
		String 최종재료2 = 철수네붕어빵.붕어빵내용물추가("스위트콘", "치즈");
		철수네붕어빵.붕어빵종류 = 철수네붕어빵.붕어빵종류 + 최종재료2 + "붕어빵";
		철수네붕어빵.붕어빵가격 = 1400;
		System.out.println("붕어빵 종류 : " + 철수네붕어빵.붕어빵종류);
		System.out.println("붕어빵 가격 : " + 철수네붕어빵.붕어빵가격);
	}
}
