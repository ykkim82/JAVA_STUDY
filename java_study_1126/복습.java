package java_study_1126;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<3;i++)
		{
			//System.out.println("Hello world!");
			
		}
		for (int i=0;i<100;i++)
		{
			if (i%3 == 0 && i%5 == 0)
			{
				System.out.println("FizzBuzz");
				
			}else if (i%3 == 0)
			{
				System.out.println("Fizz");				
			}else if (i%5 == 0)
			{
				System.out.println("Buzz");				
			}
			
		}

		int n = 0;
		for (int i=0 ; i < 10 ; i++)
		{			
			n = n * 2;
			// n *= 2;
		}

		int count = 0;
		int n2 = 6;
		
		while(n2 != 1)			
		{
			if (n2 % 2 == 0)
			{
				n2 = n2 / 2;
				++count;
			}
			else
			{
				n2 = n2 * 3 + 1;
				++count;
			}
		}
		
		System.out.println("반복한 수 : " + count);
	}

}
