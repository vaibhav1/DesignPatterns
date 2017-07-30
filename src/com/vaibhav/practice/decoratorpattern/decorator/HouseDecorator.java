/**
 * 
 */
package com.vaibhav.practice.decoratorpattern.decorator;

import com.vaibhav.practice.decoratorpattern.House;

/**
 * @author vshukla
 * Decorator class containing methods to make House special by adding features to House object at runtime.
 */
public abstract class HouseDecorator implements House{

	protected House specialHouse;
	
	public HouseDecorator(House specialHouse){
		this.specialHouse = specialHouse;
	}
	
	public String createHouse(){
		return specialHouse.createHouse();
	}
}
