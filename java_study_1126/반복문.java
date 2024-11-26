package java_study_1126;

public class 반복문 {
	public static void main(String[] args) {
		/*
		for (int i=0 ; i < 3 ; i++)
		{
			System.out.println("아우터 for문");
			for (int j=0 ; j < 3 ; j++)
			{
				System.out.println("이너 for문");				
			}			
		}
		*/
		
		//구구단
		for(int i=2; i <= 9; i++)
		{
			for (int j=1; j <= 9 ; j++)
			{
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		
		//직사각형 출력
		int a = 5; // 가로
		int b = 3; // 세로
		for (int i=0 ; i < b ; i++)
		{
			for (int j=0 ; j < a ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 문제 9
		 */
		System.out.println();
		for (int i=0 ; i < 5 ; i++)
		{
			for (int j=0 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * 문제 10
		 */
		System.out.println();
		for (int i=0 ; i < 5 ; i++)
		{
			for (int j=5 ; j > i ; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
