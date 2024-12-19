package java_study_1219;

interface MusicPlayer{
	/*
	 * 인터페이스에는 '메소드 정의'만 가능
	 */
	public void play();
	public void pause();
	public void stop();
	public void next();
	public void previous();
}

interface XX{
	
}

class SmartphonePlayer implements MusicPlayer, XX
{
	/*
	 * 인터페이스의 주요 특징
	 * 1. 계약 : 인터페이스는 클래스가 특정 메소드를 반드시 구현하도록 강제한다.
	 * 2. 다중 구현 : Java 클래스는 여러 인터페이스를 동시에 구현할 수 있다.
	 * 3. 추상화 : 인터페이스는 메소드의 선언만을 포함하며, 구현은 포함하지 않는다.
	 */

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone : " + "Playing Music");		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone : " + "Pausing Music");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone : " + "Stopping Music");
		
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone : " + "Playing Next Music");
		
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone : " + "Playing Previous Music");
		
	}
	
}

// 자바의 모든 클래스는 기본으로 'Object' 라는 
class DD extends Object{
	
}

public class 수업2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartphonePlayer phone = new SmartphonePlayer();
		phone.play();
		phone.pause();
		phone.previous();
	}

}
