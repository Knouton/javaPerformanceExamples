package org.demo.core;

//делаем класс финальным
public final class ImmutableExample {
	//делаем поле приватным и финальным (на самом деле достаточно и просто приватным)
	//и не даем сеттер для этого поля
	private final String name;

	ImmutableExample (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}



	public static void main(String[] args) {

		ImmutableExample obj = new ImmutableExample("immutableExample");
		System.out.println(obj.getName());

		// нет способа обновить имя после создания объекта
		// obj.setName ("new mkyong");
	}
}
