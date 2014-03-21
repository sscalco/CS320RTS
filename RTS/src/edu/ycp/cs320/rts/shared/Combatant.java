/**
 * 
 */
package edu.ycp.cs320.rts.shared;

/**
 * @author Dan
 *
 * Mar 19, 2014
 */
public class Combatant extends Unit implements CanAttack {
	
	private int attackStrength;
	private int attackRange;
	private int cooldown;
	private long lastfiredtime;
	
	 public Combatant() {
		super();
	}


	@Override
	public void setRange(int range) {
		this.attackRange = range;
		
	}

	@Override
	public void setCoolDown(int coolDown) {
		this.cooldown = coolDown;
	}

	@Override
	public int getAttackStrength() {
		return attackStrength;
	}

	@Override
	public int getRange() {
		return attackRange;
	}

	@Override
	public int getCoolDown() {
		return cooldown;
	}

	@Override
	public boolean attack(Interactable target) {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public void setAttackStrength(int attackStrength) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getLastFired() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean canAttack() {
		// TODO Auto-generated method stub
		return false;
	}
		
	

}
