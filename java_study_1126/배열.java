package java_study_1126;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20, 30, 40};
		System.out.println("0번째 배열 값 : " + array[0]);
		System.out.println("1번째 배열 값 : " + array[1]);
		int sum = array[1] + array[3];
		System.out.println(sum);
		
		int[] array2 = {10,20,30,40,10,20,30,40,10,20,30,40,10,20,30,40,10,20,30,40};
		// 배열에 들어 있는 값이 많아질 때는 인덱스 번호를 이용해서 조회하는데 한계
		// 반복문 사용
		
		for(int i=0; i <array2.length; i++)
		{
			System.out.println("배열 값 : " + array2[i]);
		}
		System.out.println("배열의 길이는 ? : " + array2.length);
		
		int[] array3 = {2,3,4,5,6};
		for (int i=0 ; i < array3.length ;i++)
		{
			if (array3[i] %2 == 0)
				System.out.println("짝수 = " + array3[i]);
		}

		// 총합과 평균값
		double n_ttl_sum = 0;
		double n_avg = 0;
		for (int i=0 ; i < array3.length ;i++)
		{
			n_ttl_sum += array3[i];
		}
		n_avg = n_ttl_sum / array3.length;
		System.out.println("총합 : " + n_ttl_sum);
		System.out.println("평균 : " + n_avg);
		
		int[] array4 = {1,2,3,4,5,6,7,8,9,10};
		
		int n_sum4 = 0;
		for (int i = 0 ; i < array4.length;i++)
		{
			if (array4[i] % 3 == 0)
				n_sum4 += array4[i];
		}
		System.out.println("array[4]이 3의 배수 총합 : " + n_sum4);
	}

}
