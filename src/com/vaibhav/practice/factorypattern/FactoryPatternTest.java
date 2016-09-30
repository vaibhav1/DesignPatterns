/**
 * 
 */
package com.vaibhav.practice.factorypattern;

/**
 * @author vshukla
 *	tester class for Factory pattern
 */
public class FactoryPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.getShape("circle");
		shape.draw();
		
		
		shape = factory.getShape("rectangle");
		shape.draw();
		
	}

}
