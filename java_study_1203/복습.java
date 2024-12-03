package java_study_1203;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 중 짝수 출력
		for(int i=1 ; i <= 100 ; i++)
			if ( i % 2 == 0)
				System.out.println(i);
		
		// 1~10 합
		int n_sum = 0;
		for(int i=1; i <= 10 ; i++)
			n_sum += i;
		System.out.println(n_sum);
		
		int n_cnt = 0;
		String[] array = {"apple","apple","apple","banana"};
		for (String s_tp : array)
		{
			if (s_tp.equals("apple"))
				n_cnt++;
		}
		System.out.println(n_cnt);
		

		double price = 580000;
		double rate = 0;
		double final_price = 0;

		if (price >= 500000)
			rate = 0.20;
		else if (price >= 300000)
			rate = 0.10;
		else if (price >= 100000)
			rate = 0.05;
		else
			rate = 0;
		
		final_price = price * (1 - rate);
		System.out.println(final_price);
		
		
		String my_string = "hello";
		int n = 3;
		//  결과 : hhheeellllllooo
		
		String[] sa_tp = my_string.split("");
		for (String stp : sa_tp)
		{
			for (int i=0 ; i < n ; i++)
				System.out.print(stp);
		}
		
		System.out.println();
		for (String stp : sa_tp)
		{
			System.out.print(stp.repeat(3));
		}

		System.out.println();
		
		int[] num_list = {1,3,5,7};
		int[] answer_list = new int[2];
		// 결과 [0, 4] : 짝수 갯수, 홀수 갯수
		
		int n_even = 0;
		int n_odd = 0;
		for (int ntp : num_list)
		{
			if (ntp %2 == 0)
				n_even++;
			else
				n_odd++;
		}
		System.out.println("[" + n_even + "," + n_odd + "]");
		
		
		// 양꼬치 가게 10인분에 음료수 1 서비스
		// 양꼬치는 1인분 12000원 음료수는 2000원
		// n, k 변수 양꼬치 n 인분
		
		//음료수 k개 
		
		//얼마 지불?
				
		//
		int lambSkewersPrice = 12000;
		int drinkPrice = 2000;
		
		
		int n1 = 64;
		int k = 6;
		
		int final_price2 = 0;
		
		final_price2 = n1 * lambSkewersPrice;
		final_price2 += k * drinkPrice;
		
		if ((n1 >= 10) && (k >= 1))
			final_price2 -= (n1 / 10) * drinkPrice;
		
		System.out.println("최종 가격 : " + final_price2);
	}

}
