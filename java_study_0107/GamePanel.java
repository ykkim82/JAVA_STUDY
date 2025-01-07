package java_study_0107;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener { // 핵심 로직 구현 클래스 만들 것
	private Player player;
	private ArrayList<Circle> circles;
	private Timer timer;
	private int score;
	private boolean isGameOver;
	
	public GamePanel() throws Exception {
		setBackground(new Color(0, 150, 200));
		setFocusable(true);
		
		player = new Player(220, 400);
		circles = new ArrayList<>();
		score = 0;
		isGameOver = false;		
	}
	
	@Override
	protected void paintComponents(Graphics g) {
		super.paintComponents(g);		
		player.draw(g);
		
		// 점수표시
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Score : " + score, 10, 25);
		
		// 공 그리기
		if(isGameOver) {
			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (!isGameOver) {
			if(Math.random() < 0.02) { // 0.02초 간격으로 게임 추가
				int x = (int) Math.random() * 460; // 공 x 좌표 랜덤값
				circles.add(new Circle(x, 0));
			}
			
			// 공 이동시키기
			
			for(int i = circles.size() - 1; i >= 0 ; i--)
			{
				Circle c = circles.get(i);
				c.move();
				
				if(c.getY() > 500) { //공 y좌표가 500을 넘으면 스코어 점수가 올라감
					circles.remove(i);
					++score;
				}
			}
		}
		repaint();
	}		
}
