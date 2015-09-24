package kr.ac.kookmin.shape;

public class Point {
	private int xpos, ypos;

	public Point(int x, int y) {
		xpos = x;
		ypos = y;
	}

	public void setX(int x) {
		xpos = x;
	}

	public void setY(int y) {
		ypos = y;
	}

	public int getX() {
		return xpos;
	}

	public int getY() {
		return ypos;
	}
}
