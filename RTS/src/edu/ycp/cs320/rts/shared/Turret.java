package edu.ycp.cs320.rts.shared;

public class Turret extends Structure implements CanAttack {
	private int attackStrength;
	private int range;
	
	public Turret(){
		attackStrength = 0;
		range = 0;	
	}
	
	public Turret(int attackStrength, int range){
		this.attackStrength = attackStrength;
		this.range = range;
	}
	/**
	 * 
	 * @param AttackStrength
	 */
	public void setAttackStrength(int attackStrength){
		this.attackStrength = attackStrength;
	}
	/**
	 * 
	 * @return
	 */
	public int getAttackStrength(){
		return this.attackStrength;
	}
	/**
	 * 
	 * @param Range
	 */
	public void setRange(int range){
		this.range = range;
	}
	/**
	 * 
	 * @return
	 */
	public int getRange(){
		return this.range;
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
