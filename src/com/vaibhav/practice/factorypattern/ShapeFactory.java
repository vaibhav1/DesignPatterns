/**
 * 
 */
package com.vaibhav.practice.factorypattern;

/**
 * @author vshukla
 * Factory of Shape.
 */
public class ShapeFactory {
	
	private Shape shape;
	
	/**
	 * Method returns a new Shape object on basis of shape type.
	 * @param shapeType
	 * @return
	 */
	public Shape getShape(String shapeType){
		
		if(shapeType.equalsIgnoreCase("circle")){
			shape = new Circle();
		} else if(shapeType.equalsIgnoreCase("rectangle")){
			shape = new Rectangle();
		} else if(shapeType.equalsIgnoreCase("triangle")){
			shape = new Triangle();
		}
		
		return shape;
	}
	

}
