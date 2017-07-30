package com.vaibhav.practice.facadepattern;

/**
 * Main class to test Facade Design Pattern
 * @author vshukla
 *
 */
public class FacadePatternTest {
	
	public static void main(String[] args) {
		ShapeMakerFacade shapeMaker = new ShapeMakerFacade();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawTriangle();
	}
	
}
