package java_study_1203;

public class 문제풀이 {
	public static void main(String[] args) {
		
		String text = "Hello World!";
		System.out.println(text.toUpperCase());
		
		String x = "고구마";
		String y = "고구마";
		if (x == y)
		{
			// 이 코드는 문자를 비교하는게 아닌 메모리에 저장된 주소를 비교하는 것
		}
		if (x.equals(y))
		{
			System.out.println("같다.");
		}
		
		String h = "흑백요리사";
		System.out.println(h.substring(0,1));
		System.out.println(h.substring(h.length()-1, h.length()));
		
		int count = 0;
		String word = "aabbacccaaaaa";
		String[] array = word.split("");
		for (int i=0; i < array.length; i++)
		{
			if(array[i].equals("a"))
			{
				++count;
			}
		}
		
		System.out.println("총: " + count);
		
		String a = array[0];
		System.out.println(a);
		
		for(String i : array)
		{
			System.out.println("배열 값 : " + i);
		}

		String[] strArr = {"and","notad","abcd"};
		for (String s : strArr)
		{
			if (!s.contains("ad"))
				System.out.println(s);
		}
		
		String my_string = "nice to meet you";
		String[] vow = {"a","e","i","o","u"};
		
		for(String i : vow)
		{
			my_string = my_string.replaceAll(i, "");
		}
		System.out.println(my_string);
		

		String numbers = "onefourzerosixseven";
		String[] matchNumbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i=0 ; i < matchNumbers.length ; i++)
		{
			numbers = numbers.replaceAll(matchNumbers[i], Integer.toString(i));
		}
		
		System.out.println(numbers);
	}
}
