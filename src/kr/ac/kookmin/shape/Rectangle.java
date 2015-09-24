package kr.ac.kookmin.shape;

public class Rectangle extends Shape {
	private int width, height;

	public Rectangle(Point pos, int w, int h) {
		this.center = pos;
		width = w;
		height = h;
	}

	public Rectangle getBounds() {
		return this;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}

	@Override
	public Point getCenter() {
		return this.center;
	}

	@Override
	public String toString() {
		return "Rectangle";
	}

}
