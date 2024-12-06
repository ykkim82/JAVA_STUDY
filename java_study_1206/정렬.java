package java_study_1206;

public class 정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정렬 알고리즘
		 * 버블, 선택, 삽입
		 * 
		 * 버블 정렬은 : 인접한 두 원소를 비교하여 큰 값을 뒤로 보내는 과정을 반복
		 * 만들기가 쉽고 직관적일 뿐이지 알고리즘적 관점에서 보면 대단히 비효율적인 
		 */
		
		int[] na_BB = {7, 4, 5, 1, 3};
		for (int i = 0 ; i < na_BB.length-1 ; i++)
		{
			System.out.println("i의 값 : " + i);
			for (int j=0 ; j < na_BB.length-i-1 ; j++)
			{
				int x = na_BB[j];
				int y = na_BB[j+1];
				if ( x > y )
				{
					// swap
					int temp = x;
					na_BB[j] = na_BB[j+1];
					na_BB[j+1] = temp;
				}
			}	
		}
		System.out.println("끝");
	}

}
