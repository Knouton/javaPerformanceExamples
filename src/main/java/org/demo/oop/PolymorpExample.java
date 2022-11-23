package org.demo.oop;

public class PolymorpExample {
	public interface Shape {
		void draw();
	}
	private static class Circle implements Shape {
		public void draw() {
			System.out.println("Circle.draw()");
		}
	}
	private static class Triangle implements Shape {
		public void draw() {
			System.out.println("Triangle.draw()");
		}
	}

	public static void main(String[] args) {
		Shape shape1 = new Circle();
		Shape shape2 = new Triangle();
		testPoly(shape1);
		testPoly(shape2);
	}

	private static void testPoly(Shape shape) {
		shape.draw();
	}
}
