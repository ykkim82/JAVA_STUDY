package java_study_0107;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	private int x;
	private int y;
	private int width = 60;
	private int height = 60;
	
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move() {
		y += 3;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillOval(x, y, width, height);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
