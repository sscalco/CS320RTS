package edu.ycp.cs320.rts.shared;

public interface CanAttack {
	
	/**
	 * 
	 * @param attackStrength
	 */
	abstract void setAttackStrength(int attackStrength);
	
	/**
	 * 
	 * @param defense
	 */
	abstract void setDefense(int defense);
	
	/**
	 * 
	 * @param range
	 */
	abstract void setRange(int range);
	/**
	 * 
	 * @param coolDown
	 */
	abstract void setCoolDown(int coolDown);
	
	/**
	 * Returns object's attack strength.
	 * 
	 * @return
	 */
	abstract int getAttackStrength();
	
	/**
	 * Returns object's defense.
	 * 
	 * @return
	 */
	abstract int getDefense();
	
	/**
	 *Returns object's range.
	 * 
	 * @return
	 */
	abstract int getRange();
	
	/**
	 * Returns object's cool down.
	 * 
	 * @return
	 */
	abstract int getCoolDown();
	
	/**
	 * This method should determine how much damage should be dealt (damage=attackStrength-defense,) 
	 * then the target's damage method should be used to determine effects on target's health.
     * Also, the attacker's cool down timer should be increased.
     * 
	 * @param target
	 */
	abstract void attack(Interactable target); 	
}
