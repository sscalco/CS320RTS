package edu.ycp.cs320.rts.shared;

public class Structure implements Attackable{
	private int health;
	private int defense;
	
	/**
	 * 
	 */
	public Structure(){
		
	}
	
	/**
	 * 
	 * @param health
	 * @param defense
	 */
	
	public Structure(int health, int defense){
		this.health = health;
		this.defense = defense;
	}
	/**
	 * 
	 * @param damage
	 */
	public void damage(int damage){
		this.health = this.health -  damage;
		if(this.health <= 0){
			this.health = 0;
			death();
			return;
		}
	}
	
	/**
	 * 
	 * @return health
	 */
	public int getHealth(){
		return this.health;
	}
	/**
	 * 
	 * @return defense
	 */
	public int getDefense(){
		return this.defense;
	}
	/**
	 * 
	 * @param defense
	 */
	public void setDefense(int defense){
		this.defense = defense;
	}
	
	public void death(){
		//plays death animation
	}
}
