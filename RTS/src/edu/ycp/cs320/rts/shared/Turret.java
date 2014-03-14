package edu.ycp.cs320.rts.shared;

public class Turret implements canAttack extends Structures{
	private int AttackStrength;
	private int Range;
	void setAttackStrength(int AttackStrength){
		this.AttackStrength = AttackStrength;
		return;
	}
	int getAttackStrength(){
		return this.AttackStrength;
	}
	void setRange(int Range){
		this.Range = Range;
		return;
	}
	int getRange(){
		return this.Range;
	}
	void attack(Interactable target){
		//fill out later
		// if target is in range calculate attack damage
		//if damage - defense is negative dont call
		//call targets damage function
		
	}
}
