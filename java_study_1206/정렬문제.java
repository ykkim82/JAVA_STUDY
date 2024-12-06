package java_study_1206;

public class 정렬문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] na_BB = {7, 4, 5, 1, 3};
		for (int i = 0 ; i < na_BB.length-1 ; i++)
		{
			System.out.println("i의 값 : " + i);
			for (int j=0 ; j < na_BB.length-i-1 ; j++)
			{
				if ( na_BB[j] > na_BB[j+1] )
				{
					// swap
					int temp = na_BB[j];
					na_BB[j] = na_BB[j+1];
					na_BB[j+1] = temp;
				}
			}	
		}
		System.out.println("끝");
	}

}
