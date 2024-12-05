package java_study_1205;

import java.util.Random;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제1의 답 : 3. 상수");
		
		String x = "10";
		int y = Integer.parseInt(x);
		System.out.println("문제2의 답 : " + y);
		
		System.out.println("문제3의 답 : 3. 3apple");

		System.out.println("문제4의 답 :");
		for (int i = 1 ; i <= 100 ; i++)
		{
			if (i % 2 == 0)
				System.out.println(i + "는 짝수");
			else
				System.out.println(i + "는 홀수");
		}
		
		System.out.println("문제5의 답 : false");
		
		int n_6 = 0;
		for (int i = 1 ; i <= 100 ; i++)
		{
			if (i%3 == 0)
				n_6 += i;			
		}
		System.out.println("문제6의 답 : " + n_6);

		int n_num_human = 15;
		int n_num_pizza = 0;
		n_num_pizza = n_num_human / 7;
		if (n_num_human % 7 != 0)
			n_num_pizza++;		
		System.out.println("문제7의 답 : " + n_num_pizza);

		Scanner scan = new Scanner(System.in);

		System.out.print("문제8 팩토리얼 입력 : ");
		int n_8_1 = scan.nextInt();
		int n_8_2 = 1;
		for (int i = n_8_1 ; i > 0 ; i--)
		{
			n_8_2 *= i;
		}
		System.out.println("문제8의 답 : " + n_8_2);

		System.out.println("문제9의 답 :");
		for (int i = 2 ; i <= 5 ; i++)
		{
			for (int j = 1 ; j <= 9 ; j++ )
			{
				System.out.println(i + " x " + j + " = " + i*j);				
			}
			System.out.println();
		}

		System.out.println("문제10의 답 :");
		for (int i = 4 ; i > 0 ; i--)
		{
			for (int j = 0 ; j < i ; j++)
				System.out.print("*");
			System.out.println();
		}

		System.out.print("문제11 입력 :");
		String s_Q11_input = scan.next();
		System.out.println("문제11의 답 :");
		if (s_Q11_input.length() > 10)
			System.out.println("아이디는 10 글자 미만");
		else
			System.out.println("아이디 길이 : " + s_Q11_input.length());

		System.out.println("문제12의 답 : 4번");

		int[] na_Q13 = new int[10];
		int n_Q13 = -101;
		Random rand = new Random();
		for (int i = 0 ; i < na_Q13.length ; i++)
		{
			na_Q13[i] = rand.nextInt(100);
			if (n_Q13 < na_Q13[i])
				n_Q13 = na_Q13[i];
		}
		System.out.println("문제13의 답 : " + n_Q13);

		int[] na_Q14 = new int[10];
		int n_Q14_sum = 0;
		int n_Q14_mean = 0;
		for (int i = 0 ; i < na_Q13.length ; i++)
		{
			na_Q14[i] = rand.nextInt(100);
			n_Q14_sum =+ na_Q14[i];
		}
		n_Q14_mean = n_Q14_sum / na_Q14.length;
		
		System.out.println("문제14의 답 : \t합\t: " + n_Q14_sum);
		System.out.println("문제14의 답 : \t평균\t: " + n_Q14_mean);

		String s_Q15 = "Java Programming";
		String[] sa_Q15 = s_Q15.split("");
		int n_Q15 = 0;
		for (String s_tp : sa_Q15)
		{
			if (s_tp.equals("a"))
				n_Q15++;
		}
		System.out.println("문제15의 답 : " + n_Q15);

		int n_Q16_price = 5500;
		int n_Q16_money = 15000;
		int n_Q16_num = 0;
		int n_Q16_return = 0;
		n_Q16_num = n_Q16_money / n_Q16_price;
		n_Q16_return = n_Q16_money % n_Q16_price;
		
		System.out.println("문제16의 답 : 커피" + n_Q16_num + "잔과 잔돈" + n_Q16_return + "원");

		int[] na_Q17_array = {149, 180, 192, 170};
		int n_Q17_height = 167;
		int n_Q17_cnt = 0;
		
		for (int i = 0 ; i < na_Q17_array.length ; i++)
		{
			if (na_Q17_array[i] < n_Q17_height)
				n_Q17_cnt++;
		}
		
		System.out.println("문제17의 답 : " + n_Q17_cnt);

		System.out.print("문제18의 답 :");
		String s_Q18_cipher = "dfjardstddetckdaccccdegk";
		int n_Q18_code = 4;		
		String s_Q18_text = "";
		String[] sa_Q18 = s_Q18_cipher.split("");
		for (int i = 0 ; i < sa_Q18.length ; i++ )
		{
			if ((i + 1)%4 ==0)
				System.out.print(sa_Q18[i]);
		}
		System.out.println();		

		//String s_Q19_phone_number = "0171238888";
		String s_Q19_phone_number = "01033334444";
		
		String[] sa_Q19 = s_Q19_phone_number.split("");
		String s_Q19_hiden = "";
		
		for (int i=0 ; i < sa_Q19.length ; i++)
		{
			if (i < sa_Q19.length - 4)
				s_Q19_hiden += "*";
			else
				s_Q19_hiden += sa_Q19[i];
		}		
		System.out.println("문제19의 답 : " + s_Q19_hiden);

		int n_Q20_chicken = 1081;
		int n_Q20_qp = n_Q20_chicken;
		int n_Q20_sv = 0;
		int n_Q20_rcvd = 0;
		
		while (true)
		{			
			n_Q20_sv = n_Q20_qp / 10;
			n_Q20_qp = n_Q20_qp % 10;
			n_Q20_qp += n_Q20_sv;
			
			n_Q20_rcvd += n_Q20_sv;

			System.out.println(n_Q20_qp + " / " + n_Q20_sv);
			if (n_Q20_qp < 10)
				break;
		}		
				
		System.out.println("문제20의 답 : " + n_Q20_rcvd);

		String my_string = "people";

		String stp = my_string;		
		String stp1 = "";
		String stp2 = "";
		String passed = "";		
		
		int cnt = 0;
		while (true)
		{						
			stp1 = stp.substring(cnt, cnt+1);
			stp2 = stp.substring(cnt+1, stp.length());
			
			passed += stp1;	
			if (stp2.contains(stp1))
				stp = passed + stp2.replaceAll(stp1, "");
			
			cnt++;
			if (stp2.length() < 1)
				break;
		}
		System.out.println("문제21의 답 :" + passed.trim());

		int hp = 999;
		
		int n_P_A = 5;
		int n_P_B = 3;
		int n_P_C = 1;
		int n_N_A = 0;
		int n_N_B = 0;
		int n_N_C = 0;
		
		n_N_A = hp / n_P_A;
		hp = hp % n_P_A;
		
		n_N_B = hp / n_P_B;
		hp = hp % n_P_B;
		
		n_N_C = hp;
		
		System.out.println("문제22의 답 : " + (n_N_A + n_N_B + n_N_C));
		
	}
	

}
