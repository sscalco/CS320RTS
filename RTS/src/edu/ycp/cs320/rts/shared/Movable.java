package edu.ycp.cs320.rts.shared;
import java.util.ArrayList;


public interface Movable {
	
	/**
	 * 
	 * @param waypoint
	 */
	abstract void addWaypoint(Point waypoint);
	
	/**
	 * Removes top waypoint.
	 * 
	 */
	abstract void removeWaypoint();
	
	/**
	 * Returns object's current waypoints.
	 * 
	 * @return
	 */
	abstract ArrayList<Point> getWaypoints();
	
	/**
	 * Clears the object's waypoints.
	 */
	abstract void clearWaypoints();
	
	/**
	 * Moves the unit to the top most waypoint.
	 */
	abstract void move();
	
	/**
	 * 
	 * @param speed
	 */
	abstract void setSpeed(int speed);
	
	/**
	 * Returns object's speed.
	 * 
	 * @return
	 */
	abstract int getSpeed();
}
