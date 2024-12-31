package java_study_1231;

import java.util.Scanner;

class A{
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 플래그값 -> true or false
		boolean isFlag = false;
		
		String inputWord = "사과";
		
		if (inputWord.equals("사과"))
		{
			isFlag = true;
		}
		
		if(isFlag)
		{
			System.out.println("플래그 값 변경");
		}
		
		boolean isFlag2 = false;
		String book[] = {"책1", "책2", "책3"};
		Scanner scan = new Scanner(System.in);
		
		System.out.print("찾을 책을 입력하세요. : ");
		String search = scan.next();
		
		for(String s : book)
		{
			if(s.equals(search))
			{
				isFlag2 = true;
			}
		}
		
		if(!isFlag2)
		{
			System.out.println("입력한 도서는 해당 도서관에 없음");
		}
		
		
		A a = new A();
		a.setX(10);
		System.out.println(a.getX());
		
		
		A []array = new A[3];
		array[0] = a;
		array[0].getX();
		
		A b = new A();
		b.setX(20);		
		array[1] = b;
		
		A c = new A();
		c.setX(30);
		array[2] = c;
		
		int sum = 0;
		for (A A_tp : array)
		{
			sum += A_tp.getX();
		}
		System.out.println("합 : " + sum);
	}

}
