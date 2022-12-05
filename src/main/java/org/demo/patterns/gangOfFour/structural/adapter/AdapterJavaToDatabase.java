package org.demo.patterns.gangOfFour.structural.adapter;

public class AdapterJavaToDatabase extends App implements Database {

	@Override
	public void insert() {
		saveObject();
	}

	@Override
	public void update() {
		updateObject();
	}

	@Override
	public void select() {
		loadObject();
	}

	@Override
	public void remove() {
		deleteObject();
	}
}
