/**
 * 
 */
package edu.ycp.cs320.rts.shared;

/**
 * @author Dan
 *
 * Feb 3, 2014
 */
public class Unit extends Attackable implements CanAttack {

	private int power;
	/* (non-Javadoc)
	 * @see edu.ycp.cs320.rts.shared.CanAttack#setPower(int)
	 */
	@Override
	public void setPower(int power) {
		this.power = power;

	}

	/* (non-Javadoc)
	 * @see edu.ycp.cs320.rts.shared.CanAttack#attack()
	 */
	@Override
	public int attack() {
		return this.power;
	}

}
