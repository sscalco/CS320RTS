/**
 * 
 */
package edu.ycp.cs320.rts.shared;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dan Mashuda
 *
 */

public class Movable extends Attackable {
	private Queue<Point> waypoints;
	private int speed;
	
	public Movable() {
		waypoints = new LinkedList<Point>();
	}
	/**
	 * @param Point p to add as last waypoint
	 */
	public void add_waypoint(Point p){
		waypoints.add(p);
	}
	/**
	 * removes waypoints from object
	 */
	public void clear_waypoints(){
		waypoints.clear();
	}
	
	/**
	 * currently this function moves the unit directly to the last waypoint
	 * 
	 * TODO: this will need to be changed for smooth movement at a later time
	 * 
	 * @param deltat the time passed since last call
	 */
	public void update_pos(double deltat){
		int totaldist = (int)(this.speed*deltat);
		
		int deltax = (int) (this.get_x() - waypoints.peek().getX());
		int deltay = (int) (this.get_y() - waypoints.peek().getY());
		
		this.set_x(deltax);
		this.set_y(deltay);
		
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
