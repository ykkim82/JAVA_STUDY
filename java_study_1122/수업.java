package java_study_1122;

public class 수업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   for(int i=0; i<3 ; i++)
	   {
		   System.out.println("Hello World!");
	   }
	   
	   // "안녕하세요" 20번 출력하기
	   for(int i=0; i<20 ; i++)
	   {
		   System.out.println("안녕하세요.");
	   }
	   
	   for(int i=0; i<9 ; i++)
	   {
		   System.out.println("i : " +i);
	   }
	   
	   int j=0;
	   for(int i=1; i<11 ; i++)
	   {
		   j = j + i;
		   System.out.println("j : " +j);
	   }
	   

	   for(int i=1; i<=20 ; i++)
	   {
		   if (i%2==0)
			   System.out.println("i 중 짝수" +i);
	   }
	   
	   // 1~30 중 5의 배수 출력

	   for(int i=1; i<=30 ; i++)
	   {
		   if (i%5==0)
			   System.out.println("i 중 5의 배수" +i);
	   }
	   

	   for(int i=1; i<=5 ; i++)
	   {
		   if (i==2)
		   {
			   System.out.println(i);
			   break;
		   }
		   System.out.println(i);
	   }
	   
	   int 구구단 = 2;
	   for (int i=1; i < 9 ; i++)
	   {
		   System.out.println(구구단+"*"+i+"="+구구단*i);
	   }
	   
	   int i = 1;
	   while (i <= 5)
	   {
		   System.out.println("while문 i : " + i);
		   i++;
	   }
	   
	   int coffee = 10;
	   while (coffee > 0)
	   {
		   System.out.println("커피를 판매합니다. 남은 커피 : " + coffee);
		   coffee--;
		   if (coffee == 0)
		   {
			   System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
		   }
	   }
	}

}
