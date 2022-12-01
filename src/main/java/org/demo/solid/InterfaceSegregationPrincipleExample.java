package org.demo.solid;

public class InterfaceSegregationPrincipleExample {
	//вместо того чтобы сделать все виды отображения фигур в одном интерфейсе Shape
	//разделим их на отдельные
	//если бы мы реализовали их в одном интерфейсе, то каждый кто реализует интерфейс
	// должен был бы переопределить его методы, даже если они ему не нунжны
	//например, квадрату не нужен
	interface Shape {
		void draw();
	}
	interface ICircle {
		void drawCircle();
	}
	interface ISquare {
		void drawSquare();
	}
	interface IRectangle {
		void drawRectangle();
	}
	interface ITriangle {
		void drawTriangle();
	}
	class Circle implements ICircle {

		@Override
		public void drawCircle() {

		}
	}
	class Square implements ISquare {
		@Override
		public void drawSquare() {
			//...
		}
	}
	class Rectangle implements IRectangle {
		@Override
		public void drawRectangle() {
			//...
		}
	}
	class Triangle implements ITriangle {
		@Override
		public void drawTriangle() {
			//...
		}
	}
	class CustomShape implements Shape {
		@Override
		public void draw(){
			//...
		}
	}
}
