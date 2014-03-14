/**
 * 
 */
package edu.ycp.cs320.rts.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.rts.shared.Point;

/**
 * @author Dan
 *
 * Mar 13, 2014
 */
public class PointTest {
	
	private Point p1;
	private Point p2;
	private Point p3;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		p1 = new Point(5, 10);
		p2 = new Point(3,2);
		p3 = new Point(6, 15);
	}

	@Test
	public void testInitial() {
		assertEquals(5, p1.getX());
		assertEquals(3, p2.getX());
		assertEquals(6, p3.getX());
		assertEquals(10, p1.getY());
		assertEquals(2, p2.getY());
	}
	
	public void testSet(){
		p1.setX(44);
		p1.setY(13);
		assertEquals(44, p1.getX());
		assertEquals(13, p1.getY());
	}
	@Test
	public void testAdd(){
		p1.add(p2);
		assertEquals(8, p1.getX());
		assertEquals(12, p1.getY());
		
		p2.add(p3);
		assertEquals(9, p2.getX());
		assertEquals(17, p2.getY());
	}
	@Test
	public void testDistTo(){
		int d = p1.distTo(p2);
		assertEquals(8, d);
	}

}
