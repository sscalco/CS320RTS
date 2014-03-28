package edu.ycp.cs320.rts.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.rts.shared.Structure;

/**
 * @author akoehler
 *
 * Mar 21, 2014
 */
public class StructureTest {

	private Structure s1;
	private Structure s2;
	private Structure s3;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		s1 = new Structure(100,1);
		s2 = new Structure(2500,5);
		s3 = new Structure(600,3);
	}
	
	@Test
	public void testInitial() {
		assertEquals(100, s1.getHealth());
		assertEquals(2500, s2.getHealth());
		assertEquals(600, s3.getHealth());
		assertEquals(1, s1.getDefense());
		assertEquals(5, s2.getDefense());
		assertEquals(3, s3.getDefense());
	}

	@Test
	public void testSet(){
		s1.setDefense(5);
		s1.damage(5);
		assertEquals(5,s1.getDefense());
		assertEquals(95, s1.getHealth());
		s1.damage(200);
		assertEquals(0, s1.getHealth());
	}
}
