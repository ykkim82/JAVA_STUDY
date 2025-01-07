package game;

import java.awt.*;
import java.io.IOException;

import javax.imageio.*;

public class Player {
	private int x, y;
	private final int WIDTH = 60;
	private final int HEIGHT = 60;
	private Image playerImage;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		loadImage();
	}
	
	private void loadImage() {
		try {
			//playerImage = ImageIO.read(getClass().getResource(null));
			playerImage = ImageIO.read(getClass().getResource("C:\\Users\\user\\Desktop\\개인교육 - IT Korea Java\\202412 자바 2\\LastDay\\user.gif"));
			
		}catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void moveLeft() {
		if ( x > 0 ) x-= 10;
	}
	
	public void moveRight() {
		if ( x < 460) x+= 10;
	}
	
	public void draw(Graphics g) {
		if (playerImage != null) {
			g.drawImage(playerImage, x, y, WIDTH, HEIGHT, null);
		}else {
			g.setColor(Color.ORANGE);
			g.fillOval(x, y, WIDTH, HEIGHT);
		}
	}
	
	public boolean intersects(Circle mushroom) {
		Rectangle playerBounds = new Rectangle(x, y, WIDTH, HEIGHT);
		Rectangle mushroomBounds = new Rectangle(mushroom.getX(), mushroom.getY(), mushroom.getWidth(), mushroom.getHeight());
		return playerBounds.intersects(mushroomBounds);
	}
}
