/**
 * 
 */
package edu.ycp.cs320.rts.shared;

/**
 * @author Dan Mashuda
 *
 * Feb 3, 2014
 */
public interface CanAttack{
	
	/**
	 * 
	 * @param power the amount of damage the unit can do while attacking
	 */
	public void setPower(int power);
	
	/**
	 * @return attack the amount of damage done by unit on one move
	 */
	public int attack();
	

}
