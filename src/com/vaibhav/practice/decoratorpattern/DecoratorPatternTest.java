package com.vaibhav.practice.decoratorpattern;

import com.vaibhav.practice.decoratorpattern.decorator.GardenDecorator;
import com.vaibhav.practice.decoratorpattern.decorator.PoolHouseDecorator;

/**
 * Main class to test Decorator Design Pattern
 * @author vshukla
 *
 */
public class DecoratorPatternTest {

	public static void main(String[] args) {

		House house = new PoolHouseDecorator(new GardenDecorator(new SimpleHouse()));
		System.out.println(house.createHouse());

	}

	/*
	 * Example of Decorator in Java API - java.io.BufferedReader; java.io.FileReader;
	 */
}
