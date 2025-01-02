package java_study_0102;

import java.util.ArrayList;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("우유");
		shoppingList.add("계란");
		shoppingList.add("빵");
		
		System.out.println("장바구니 내용 : " + shoppingList);
		
		for(String s:shoppingList)
		{
			System.out.println("장바구니 내용 : " + s);
		}
		
		shoppingList.add(1, "치즈");
		System.out.println("장바구니 내용 : " + shoppingList);
		
		System.out.println("장바구니에 담긴 수 " + shoppingList.size());
		
		shoppingList.remove("계란");
		System.out.println("최종 : " + shoppingList);
	}

}
