package java_study_1126;

import java.util.Random;

public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {2,3};
		int[] array2 = new int[2];
		
		array2[0] = 10;
		array2[1] = 20;
		//array2[2] = 20; // 배열길이는 2인데 3번째에 20을 넣으려고 하니 에러 발생
		System.out.println(array2[1]);
		
		int []numbers = new int[10];
		Random random = new Random();
		numbers[0] = random.nextInt(100) + 1;
		System.out.println("0번째 인덱스 값은 : " + numbers[0]);
		
		for (int i = 0 ; i < numbers.length ; i++)
		{
			//numbers[i] = random.nextInt();
			numbers[i] = random.nextInt(100) + 1;
		}
		for (int i = 0 ; i < numbers.length ; i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
