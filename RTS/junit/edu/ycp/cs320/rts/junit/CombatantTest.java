package edu.ycp.cs320.rts.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.rts.shared.Combatant;
import edu.ycp.cs320.rts.shared.Point;

public class CombatantTest {

	private Combatant c1, c2;
	
	@Before
	public void setup() {
		c1 = new Combatant(1, 1, new Point(1,1), new Point(0,0), 100, 3, 25, 5, 45, 3);
		c2 = new Combatant(2, 2, new Point(1,1), new Point(0,0), 100, 3, 25, 5, 45, 3);
	}
	
	@Test
	public void testInitial() {
		assertEquals(45, c1.getAttackStrength());
		assertEquals(5, c1.getCoolDown());
		assertEquals(3, c1.getRange());
	}
	
	@Test
	public void testAttack() {
		assertEquals(100, c2.getHealth());
		c1.attack(c2, 1);
		assertEquals(80, c2.getHealth());
	}
	
	@Test
	public void testRange() {
		assertEquals(3, c1.getRange());
		c1.setRange(2);
		assertEquals(2, c1.getRange());
	}
	
	@Test
	public void testAttackStrength() {
		assertEquals(45, c1.getAttackStrength());
		c1.setAttackStrength(50);
		assertEquals(50, c1.getAttackStrength());
	}
	
	@Test
	public void testCooldown() {
		assertEquals(5, c1.getCoolDown());	
	}

}
