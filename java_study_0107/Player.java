package java_study_0107;

import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;

public class Player {
	
	private int x; // 케릭터 x 좌표
	private int y; // 케릭터 y 좌표
	private int width = 60; // 케릭터 크기
	private int height = 60; // 케릭터 높이
	private Image playerImage;
	
	public Player(int x, int y) throws Exception {
		this.x = x;
		this.y = y;
		//playerImage = ImageIO.read(getClass().getResource("C:\\Users\\user\\Desktop\\개인교육 - IT Korea Java\\202412 자바 2\\LastDay\\user.gif"));
		//playerImage = 
	}
	
	public void draw(Graphics g) {
		g.drawImage(playerImage, x, y, width, height, null);
	}
}
