/**
 * 
 */
package com.vaibhav.practice.decoratorpattern.decorator;

import com.vaibhav.practice.decoratorpattern.House;

/**
 * @author vshukla
 * Class to add pool feature to a House
 */
public class PoolHouseDecorator extends HouseDecorator{

	public PoolHouseDecorator(House specialHouse) {
		super(specialHouse);
	}
	
	public String createHouse(){
		return specialHouse.createHouse() + addPool();
	}

	/**
	 * adds Pool
	 * @return - message adding pool to a House
	 */
	private String addPool() {
		return " with Pool";
	}

}
