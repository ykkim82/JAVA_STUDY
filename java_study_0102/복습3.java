package java_study_0102;

import java.util.HashMap;

public class 복습3 {
	public static void main(String[] args) {
		/*
		 * H
		 * 
		 * 
		 * 
		 */
		
		HashMap<String, String> dictionary = new HashMap<>();
		
		dictionary.put("성심당", "성딤당으 대전광역시의 베이커리 전문점으로...");
		dictionary.put("엑스포", "1993년 세계 박람회...");
		dictionary.put("오월드", "오월드는 중구 사정동에 위치한 종합 테마 공원...");
		
		System.out.println(dictionary);
		
		System.out.println("성심당 : " + dictionary.get("성심당"));
		System.out.println(dictionary.size());
		
		if(dictionary.containsKey("엑스포"))
		{
			System.out.println("사전에 있음");
		}else
		{
			System.out.println("사전에 없음");
		
		}
		
		dictionary.remove("오월드");

		System.out.println("최종사전내용 : " + dictionary);
		
		
	}
}
