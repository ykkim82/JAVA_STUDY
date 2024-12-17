package java_study_1217;

class 식당{
	String 식당이름;
	String 음식타입;
	
	public 식당()
	{
		
	}
	
	public 식당(String 식당이름, String 음식타입)
	{
		this.식당이름 = 식당이름;
		this.음식타입 = 음식타입;
	}
	
	public void 식당이름출력하다()
	{
		System.out.println("식당명: " + this.식당이름);
		System.out.println("타입: " + this.음식타입);
	}
}
public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		식당 a = new 식당();
		a.식당이름 = "스바라시봉명점";
		a.음식타입 = "일식";
		
		//System.out.println(a.식당이름);
		//System.out.println(a.음식타입);
		a.식당이름출력하다();

		식당 b = new 식당("맛찬들", "한식");
		//System.out.println(b.식당이름);
		//System.out.println(b.음식타입);
		b.식당이름출력하다();
		
	}

}
