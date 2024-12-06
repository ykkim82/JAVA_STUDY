package java_study_1206;

public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int chicken = 100;
		int chickenCount = 0;
		
		while (chicken >= 10)
		{
			int coupon = chicken % 10;
			System.out.println(coupon);
			chickenCount += chicken / 10;
			chicken = coupon + chicken / 10;
		}
		System.out.println("최대 수 " + chickenCount);
			
		
		
		
		String my_string = "people";
		String[] strArray = my_string.split("");
		String result3 = "";						
		
		for (int i = 0 ; i < strArray.length ; i++)
		{
			// 먼저 주어진 변수가 아닌, 결과물을 저장할 변수를 활용한다!
			if(!result3.contains(strArray[i]))
			{
				result3 += strArray[i];
			}
		}
		System.out.println("정답 : " + result3);
	}

}
