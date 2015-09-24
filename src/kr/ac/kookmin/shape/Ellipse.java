package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
	private int width, height;

	public Ellipse(Point pos, int w, int h) {
		this.center = pos;
		width = w;
		height = h;
	}

	public Rectangle getBounds() {
		return new Rectangle(center, width * 2, height * 2);
	}

	public int getSemiMajorAxis() {
		return width;
	}

	public int getSemiMinorAxis() {
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
		return "Ellipse";
	}

}
