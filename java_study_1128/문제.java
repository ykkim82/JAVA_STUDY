package java_study_1128;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제 1
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Q1) 문자열 입력하세요 : ");
		String s_q1 = scan.next();
		System.out.println("Q1) 문자열 길이 : " + s_q1.length());
		
		/*
		 * 문제 2
		 */
		System.out.println("Q2) 답 : 3");
		
		/*
		 * 문제 3
		 */
		System.out.println("Q3) 답 : 1");
		
		/*
		 * 문제 4
		 */
		String text = "Hello World!";
		System.out.println(text.toUpperCase());
		
		/*
		 * 문제 5
		 */
		System.out.print("Q5) 두 개의 문자열 비교. 첫번째 문자열 입력 : ");
		String s1_q5 = scan.next();
		System.out.print("Q5) 두 개의 문자열 비교. 두번째 문자열 입력 : ");
		String s2_q5 = scan.next();
		
		if (s1_q5.equals(s2_q5))
			System.out.println("같습니다.");
		else
			System.out.println("다릅니다.");
		
		/*
		 * 문제 6
		 */
		System.out.print("Q6) 문자열 입력하세요. : ");
		String s_q6 = scan.next();
		
		System.out.println(s_q6.substring(0, 1));
		System.out.println(s_q6.substring(s_q6.length()-1, s_q6.length()));
		
		/*
		 * 문제 7
		 */
		
		System.out.print("Q7) 문자열 입력하세요. : ");
		String s_q7 = scan.next();
		System.out.print("Q7) 정수를 입력하세요. : ");
		int n_q7 = scan.nextInt();
		if (n_q7 > s_q7.length())
			n_q7 = s_q7.length();
		System.out.println(s_q7.subSequence(0, n_q7));
		
		/*
		 * 문제 8
		 */
		String word = "aabbacccaaaaa";
		
		int n_cnt_q8 = 0;
		for (int i=0 ; i < word.length(); i++)
		{
			if (word.substring(i, i+1).equals("a"))
				n_cnt_q8++;
			
		}
		System.out.println("Q8) a의 수 : " + n_cnt_q8);
				
		
		/*
		 * 문제 9
		 */
		String email = "user@gmail.com";
		String[] sa_q9 = email.split("@");
		System.out.println("Q9) 답 : " + sa_q9[1]);
		
		/*
		 * 문제 10
		 */
		//String[] strArr = {"there","are","no","a","ds"};
		String[] strArr = {"and","notad","abcd"};
		for (String s : strArr)
		{
			if (s.contains("ad"))
				System.out.println(s);
		}
		
		/*
		 * 문제 11
		 */
		String my_string = "nice to meet you";
		String s_q11 = my_string;
		
		s_q11 = s_q11.replaceAll("a", "");
		s_q11 = s_q11.replaceAll("e", "");
		s_q11 = s_q11.replaceAll("i", "");
		s_q11 = s_q11.replaceAll("o", "");
		s_q11 = s_q11.replaceAll("u", "");
		System.out.println(s_q11);		
		
		/*
		 * 문제 12
		 */
		
		String numbers = "onefourzerosixseven";
		String s_q12 = numbers;
		s_q12 = s_q12.replaceAll("zero", "0");
		s_q12 = s_q12.replaceAll("one", "1");
		s_q12 = s_q12.replaceAll("two", "2");
		s_q12 = s_q12.replaceAll("three", "3");
		s_q12 = s_q12.replaceAll("four", "4");
		s_q12 = s_q12.replaceAll("five", "5");
		s_q12 = s_q12.replaceAll("six", "6");
		s_q12 = s_q12.replaceAll("seven", "7");
		s_q12 = s_q12.replaceAll("eight", "8");
		s_q12 = s_q12.replaceAll("nine", "9");
		
		int n_q12 = Integer.parseInt(s_q12);
		System.out.println(n_q12);
	}

}
