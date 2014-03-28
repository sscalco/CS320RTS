package edu.ycp.cs320.rts.shared;

public interface Attackable {
	
	/**
	 * This method should actually remove the specified amount of health, and if the attack kills the object (where the health becomes negative,) call the death method.
	 * 
	 * @param damage
	 */
	abstract void damage(int damage);
	
	/**
	 * Sets the object's defense.
	 * 
	 * @param defense
	 */
	abstract void setDefense(int defense);
	
	/**
	 * Returns the oject's defense.
	 * 
	 * @return
	 */
	abstract int getDefense(); 
	
	/** 
	 * Returns object's health.
	 * 
	 * @return
	 */
	abstract int getHealth();
	
	/**
	 * This method is called by the damage method to play death animations, and nullify object attributes
	 * 
	 */
	abstract void death();
	
	/**
	 * 
	 * @return object's max health
	 */
	abstract int getMaxHealth();
	
	/**This meathod is a quick way to check if a unit is alive
	 * 
	 * @return true for alive false for dead
	 */
	
	abstract boolean isAlive();
}
