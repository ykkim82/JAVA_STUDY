package java_study_1219;

class X
{
	int money;
	
	public X()
	{
		
	}
	
	public X(int money)
	{
		this.money = money;
	}
	
	public void showMeTheMoney()
	{
		System.out.println("my money : " + this.money + "$");;
	}
}

class B
{
	public void showMeTheMoney()
	{
		System.out.println("my money : " + 100000000 + "$");;
	}
}

// 아쉽게도 Java는 다중 상속이 불가능하다. (C++, Python 다중상속 가능)

class Y extends X
{
	int myMoney = 1000;
	//int money = 100;
	
	public Y() {
		super(40000);
	}
	
	public int getMyMoney()
	{
		return this.myMoney;
	}
	
	@Override
	public void showMeTheMoney()
	{
		System.out.println("my(Y) money : " + this.money + "$");;
	}
	
	public void showMessage()
	{
		System.out.println("안녕하세요, Y입니다.");
	}
}


public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		x.showMeTheMoney();
		
		Y y = new Y();
		y.showMeTheMoney();
		y.showMessage();
		
		int result = y.getMyMoney();
		
		System.out.println("result : " + result);
	}

}
