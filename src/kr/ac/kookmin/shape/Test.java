package kr.ac.kookmin.shape;

import java.util.LinkedList;

public class Test {

	static void paintShape(Graphics g, LinkedList<Shape> shapes) {
		for (Shape s : shapes) {
			s.draw(g);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(new Point(1, 1), 5, 3);
		Ellipse ellipse = new Ellipse(new Point(2, 2), 3, 2);

		LinkedList<Shape> shapes = new LinkedList<Shape>();
		shapes.add(rectangle);
		shapes.add(ellipse);

		Graphics g = new Graphics();
		paintShape(g, shapes);
	}
}
