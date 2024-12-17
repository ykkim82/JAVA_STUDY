package java_study_1217;

class 자동차
{
	자동차()
	{
		
	}
	
	int getNumber(int a, int b)
	{
		return a + b;
	}
	int getMoney(int a)
	{
		return a;
	}
	double getAvg(double[] array)
	{
		double avg = 0;
		double sum = 0;
		for (double ntp : array )
		{
			sum += ntp;
		}
		return (sum / array.length);
	}
}

class Calculator
{
	
	Calculator()
	{
		
	}
	
	public int getAvg(int[] arr)
	{
		int avg = 0;
		for (int ntp : arr )
		{
			avg += ntp;
		}
		return (avg / arr.length);
	}
	
	public double[] getArr(double[] arr)
	{
		for (int i = 0 ; i < arr.length ; i++ )
		{
			double dtp = arr[i];
			if (dtp % 2 == 0)
				dtp /= 2;
			arr[i] = dtp;
		}
		return arr;		
	}
	
	public int getArrSum(int[] array)
	{
		int sum = 0;
		for (int ntp : array )
		{
			sum += ntp;
		}
		return sum;
	}
}

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr = {1,2,3,4,5};		
		Calculator cal1 = new Calculator();		
		System.out.println(cal1.getAvg(arr));
		System.out.println(cal1.getArrSum(arr));
	}

}
