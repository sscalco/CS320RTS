package edu.ycp.cs320.rts.shared;

public class Turret implements canAttack extends Structures{
	private int AttackStrength;
	private int Range;
	/**
	 * 
	 * @param AttackStrength
	 */
	void setAttackStrength(int AttackStrength){
		this.AttackStrength = AttackStrength;
		return;
	}
	/**
	 * 
	 * @return
	 */
	int getAttackStrength(){
		return this.AttackStrength;
	}
	/**
	 * 
	 * @param Range
	 */
	void setRange(int Range){
		this.Range = Range;
		return;
	}
	/**
	 * 
	 * @return
	 */
	int getRange(){
		return this.Range;
	}
	/**
	 * 
	 * @param target
	 */
	void attack(Interactable target){
		//fill out later
		// if target is in range calculate attack damage
		//if damage - defense is negative dont call
		//call targets damage function
		
	}
}
