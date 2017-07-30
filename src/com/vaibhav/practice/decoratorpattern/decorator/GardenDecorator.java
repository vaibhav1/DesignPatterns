/**
 * 
 */
package com.vaibhav.practice.decoratorpattern.decorator;

import com.vaibhav.practice.decoratorpattern.House;

/**
 * @author vshukla
 * Class to add Garden feature to a House
 */
public class GardenDecorator extends HouseDecorator{

	public GardenDecorator(House specialHouse) {
		super(specialHouse);
	}
	
	public String createHouse(){
		return specialHouse.createHouse() + addGarden();
	}

	/**
	 * Method to add Gardent
	 * @return - message with Garden added to a House
	 */
	private String addGarden() {
		return " with Garden";
	}

	
}
