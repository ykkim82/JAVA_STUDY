package java_study_1206;

public class 질문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hp = 999;
		
		int n_P_A = 5;
		int n_P_B = 3;
		int n_P_C = 1;
		int n_N_A = 0;
		int n_N_B = 0;
		int n_N_C = 0;
		
		n_N_A = hp / n_P_A;
		hp = hp % n_P_A;
		
		n_N_B = hp / n_P_B;
		hp = hp % n_P_B;
		
		n_N_C = hp;
		
		System.out.println("문제22의 답 : " + (n_N_A + n_N_B + n_N_C));
	}

}
