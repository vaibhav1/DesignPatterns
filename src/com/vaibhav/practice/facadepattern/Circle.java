/**
 * 
 */
package com.vaibhav.practice.facadepattern;

/**
 * @author vshukla
 *
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see com.vaibhav.practice.factorypattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Circle is drawn..");
	}

}
