package java_study_1128;

public class 문자열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] email = {"123@naver.com", "456@gmail.com", "789@naver.com"};
		
		for (int i=0; i<email.length;i++)
		{
			String e = email[i];
			//System.out.println("이메일 주소 : " + e);
			if (e.contains("naver.com"))
			{
				System.out.println("네이버 이메일 : " + e);
			}
		}
		
		String food = "돈까스@돈까스@라면@김밥@돈까스";
		String[] foodArray = food.split("@");
		
		for (String tps : foodArray)	// c# foreach와 유사한 듯, 매트랩은 없던가?
		{
			System.out.println(tps);
		}
		
		int count = 0;
	}

}
