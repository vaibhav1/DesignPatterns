/**
 * 
 */
package com.vaibhav.practice.decoratorpattern;

/**
 * @author vshukla
 * Class to create a SimpleHouse
 */
public class SimpleHouse implements House {

	
	@Override
	public String createHouse() {
		
		return "Simple House";
	}

}
