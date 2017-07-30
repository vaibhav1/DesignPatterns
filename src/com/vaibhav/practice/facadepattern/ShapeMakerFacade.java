/**
 * 
 */
package com.vaibhav.practice.facadepattern;

/**
 * @author vshukla
 * The single class which acts as an interface for client to access the Shape system 
 * and delegates calls to different shape methods
 */
public class ShapeMakerFacade {
	
	private Shape circle;
	private Shape rectangle;
	private Shape triangle;
	
	public ShapeMakerFacade(){
		circle = new Circle();
		rectangle = new Rectangle();
		triangle = new Triangle();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawTriangle(){
		triangle.draw();
	}

}
