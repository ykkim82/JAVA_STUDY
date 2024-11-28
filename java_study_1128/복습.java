package java_study_1128;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1, 2, 3};
		
		int[][] array2 = {{1,2,3},{1,2,3},{1,2,3}};
		
		for (int i=0; i<array2.length;i++)
		{
			for (int j=0 ; j < array2[i].length;j++)
			{
				System.out.println("2차원배열 출력" + array2[i][j]);
			}				
		}
		
		int[] array3 = new int[3];
		String[] array4 = new String[4];
		
		array3[0] = 3;
		array4[0] = "apple";

		//array4[0] = 3; // array4는 문자열 배열이기 때문에 숫자대입 불가능
		array4[1] = Integer.toString(array3[0]);
		System.out.println(array4[1]);
	}

}
