package edu.ycp.cs320.rts.shared;

public class Turret extends Structures implements CanAttack {
	private int AttackStrength;
	private int Range;
	/**
	 * 
	 * @param AttackStrength
	 */
	public void setAttackStrength(int AttackStrength){
		this.AttackStrength = AttackStrength;
		return;
	}
	/**
	 * 
	 * @return
	 */
	public int getAttackStrength(){
		return this.AttackStrength;
	}
	/**
	 * 
	 * @param Range
	 */
	public void setRange(int Range){
		this.Range = Range;
		return;
	}
	/**
	 * 
	 * @return
	 */
	public int getRange(){
		return this.Range;
	}
	/**
	 * 
	 * @param target
	 */
	public void attack(Interactable target){
		//fill out later
		// if target is in range calculate attack damage
		//if damage - defense is negative dont call
		//call targets damage function
		
	}
	@Override
	public void setCoolDown(int coolDown) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getCoolDown() {
		// TODO Auto-generated method stub
		return 0;
	}
}
