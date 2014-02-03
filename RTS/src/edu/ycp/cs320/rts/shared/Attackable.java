/**
 * 
 */
package edu.ycp.cs320.rts.shared;

/**
 * @author Dan Mashuda
 *
 */
public class Attackable extends GameObject{
	
	private int current_health;
	private int max_health;
	private boolean alive;
	
	public Attackable() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the current_health
	 */
	public int getCurrent_health() {
		return current_health;
	}
	/**
	 * @param current_health the current_health to set
	 */
	public void setCurrent_health(int current_health) {
		this.current_health = current_health;
	}
	/**
	 * @return the max_health
	 */
	public int getMax_health() {
		return max_health;
	}
	/**
	 * @param max_health the max_health to set
	 */
	public void setMax_health(int max_health) {
		this.max_health = max_health;
	}
	/**
	 * @return the if object is alive
	 */
	public boolean isAlive() {
		return alive;
	}
	/**
	 * @param sets if the object is alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	/**
	 * @param damage for object to take
	 */
	public void takeDamage(int damage) {
		current_health -= damage;
		
		if (current_health <= 0) {
			alive = false;
		}
		
	}
}
