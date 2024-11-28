package java_study_1128;

public class 수업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "문자열길이테스트123_add";
		String s2 = new String("문자열길이테스트123_add");
		
		System.out.println("길이 : " + s.length());
		System.out.println("길이 : " + s2.length());
		
		
		String text = "ediya";
		//String text = "홍길동";
		System.out.println("문자열 길이 " + text.length());
		
		String userId = "홍길동";
		if(userId.length() >= 10)
		{
			System.out.println("아이디는 10자 미만");
		}
		else
		{
			System.out.println("사용 가능함");			
		}
		
		String a = "apple";
		String b = "wat\nch";
		System.out.println(a.concat(b));
		
		String text1 = "Hello, World";
		System.out.println(text1.substring(0,4));
		System.out.println(text1.substring(7,10));
		
		System.out.println(text1.indexOf("l"));
		System.out.println(text1.indexOf("W"));
				
		String word = "순대국밥";
		System.out.println(word.replaceAll("순대","돼지"));
		
		String code = "abcd00";
		System.out.println(code.toUpperCase());
		
		String code2 = "ABCD00";
		System.out.println(code2.toLowerCase());
		
		System.out.println(text1.trim()); // 문자열 앞과 뒤의 공백만 제거하는 듯
		
		String word3 = "한화이글스,두산베어스,롯데자이언츠";
		String[] result = word3.split(",");
		System.out.println(result[0]);
		System.out.println(result[2]);
		
		String word4 = "hyunsangXXXXX@gmail.com";
		System.out.println(word4.contains("@"));
		System.out.println(word4.indexOf("@"));
		System.out.println(word4.replaceAll("@", "#"));
		
		String food = "등심돈까스";
		String food2 = "등심돈까스";
		String food3 = "치즈돈까스";
		
		System.out.println(food.equals(food2));
		System.out.println(food.equals(food3));
		
		
	}

}
