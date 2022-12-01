package org.demo.solid;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrincipleExample {
	//создадим класс
	public static class Bird {
		public void eat() {
			System.out.println("I can eat.");
		}
	}
	//создадим класс летающей птицы
	//т.к. не все птицы могут летать, то метод fly вынесен в отдельный класс
	public static class FlyingBird extends Bird {
		public void fly() {
			System.out.println("I can fly.");
		}
	}
	//от класса летающей птицы мы наследуем ту птицу(лебедь), которая действительно может летать
	public static class Swan extends FlyingBird {
		@Override
		public void eat() {
			System.out.println("Swan can eat pizza!");
		}
		@Override
		public void fly() {
			System.out.println("I believe I can fly!");
		}
	}
	//птицу (пингвин) которая не способна летать мы наследуем от изначального класса, которому не добавляли метода полета
	//если бы мы сделали метод fly у изначального класса Bird, то тем самым нарушили бы согласованность контракта
	//нарушение было бы в том, что наследование, которое моделирует связь IS-A "является"
	//было бы применено к потомку, который не является способным летать
	//т.е была бы ошибка проектирования
	public static class Penguin extends Bird {
		@Override
		public void eat() {
			System.out.println("Penguin Can I eat taco");
		}
	}

	public static void main(String[] args) {

		List<FlyingBird> flyingBirds = new ArrayList<FlyingBird>();
		flyingBirds.add(new Swan());
		letBirdsFly(flyingBirds);

		//можем подставить вместо базового типа любой его подтип
		List<Bird> birds = new ArrayList<Bird>();
		birds.add(new Swan());
		birds.add(new Penguin());
		letBirdsEat(birds);
	}
	public static void letBirdsFly(List<FlyingBird> flyingBirds) {
		for(FlyingBird flyingBird: flyingBirds) {
			flyingBird.fly();
		}
	}
	public static void letBirdsEat(List<Bird> eatingBirds) {
		for(Bird bird: eatingBirds) {
			bird.eat();
		}
	}
}
