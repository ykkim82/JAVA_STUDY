package game;

import javax.swing.JFrame;

public class Game extends JFrame {
	private GamePanel gamePanel;
	
	public Game() {
		setTitle("공피하기 게임");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		gamePanel = new GamePanel();
		add(gamePanel);
		
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new Game();
	}
	
}
