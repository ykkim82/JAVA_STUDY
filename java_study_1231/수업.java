package java_study_1231;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 수업 {
	public static void main(String[] args) {
		// 제네릭과 컬렉션즈
		
		//ArrayList 컬렉션
		// < > 를 제네릭 이라고 한다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		/*
		 * 제네릭 특징
		 * 1. 클래스 타입만 넣을 수 있음. int 형을 담고 싶으면 int에 클래스 타입인 Integer를 작성
		 * 
		 */
		
		list.add(10);
		list.add(5);
		list.add(34);
		
		int num1 = list.get(0);
		System.out.println("조회 : " + num1);

		int num2 = list.get(1);
		System.out.println("조회 : " + num2);
		
		int num3 = list.get(2);
		System.out.println("조회 : " + num3);
		
		
		System.out.println("사이즈 : " + list.size());
		list.add(5);
		System.out.println("사이즈 : " + list.size());
		
		list.remove(0);
		System.out.println("0번째 요소 조회 : " + list.get(0));
		System.out.println("사이즈 : " + list.size());
		
		list.set(0, 100);
		System.out.println("0번째 요소 조회 : " + list.get(0));
		
		for (int i : list)
		{
			System.out.println("저장된 값 : " + i);
		}
		
		list.add(40);
		int sum = 0;
		int avg = 0;
		for (int i : list)
		{
			sum += i;
		}
		System.out.println("list 합 " + sum);
		System.out.println("list 평균 " + sum/list.size());
		
		// HashSet 컬렉션즈
		/*
		 * HashSet : 중복 제거가 필요하거나 집합 연산을 수행해야 할 때 유용하게 사용됨
		 * 1. 중복을 허용하지 않는 고유한 요소만 저장
		 */
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);	// 0 번째 10 추가
		set.add(20);	// 1 번째 20 추가
		set.add(10);	// 2 번째 10 추가 -> 중복된 값은 무시
		
		System.out.println("HashSet 크기 : " + set.size());
		
		// HashSet은 특정요소 조회 불가능, get 없음
		// HashSet 요소 값 검색		
		set.contains(10);	// 10이 저장되어 있으면 true, 아니면 false
				
		// HashSet 요소 삭제
		set.remove(0); // 0 번째 요소 삭제
		// HashSet은 추가와 삭제만 가능
		
		
		// HashMap 컬렉션즈
		/*
		 * HashMap은 마치 사전과 같습니다.
		 * 사전에서 단어(키)를 찾으면 그에 해당하는 뜻(값)이 나오는 것 처럼,
		 * 키를 사용해 값을 저장하고 검색하는 자료구조입니다.
		 * 
		 */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// String : Key, Integer : Value
		/*
		 * 데이터는 항상 키와 값의 쌍으로 저장
		 * 각 키는 중복될 수 없지만, 값은 중복될 수 있음
		 * 키를 사용해 값을 조회한다.
		 * HashMap은 데이터의 순서를 보장하지 않는다.
		 * 
		 */
		
		map.put("사과", 500);
		map.put("포도", 800);
		int price = map.get("포도");
		System.out.println("포도 값 : " + price);
		
		// 수정
		map.put("포도", 2000);
		price = map.get("포도");
		System.out.println("포도 값 : " + price);
		
		// 삭제
		map.remove("사과");
		
		boolean hasBanana = map.containsKey("바나나");
		System.out.println("바나나 있어요? " + hasBanana);
		
		// 전체 출력
		for (String key : map.keySet())
		{
			System.out.println("키 : " + key);
			System.out.println("값 : " + map.get(key));
		}
	}
}
