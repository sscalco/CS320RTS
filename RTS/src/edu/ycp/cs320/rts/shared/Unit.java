package edu.ycp.cs320.rts.shared;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Unit extends Interactable implements Movable, Attackable {
	
	private int health;
	private int speed;
	private int defense;
	private Queue<Point> waypoints;
	
	// Constructor
	public Unit() {
		waypoints = new PriorityQueue<Point>();
	}
	
	@Override
	public void addWaypoint(Point waypoint) {
		waypoints.add(waypoint);
	}

	@Override
	public void removeWaypoint() {
		waypoints.remove();
	}

	@Override
	public Point getWaypoint() {
		return waypoints.peek();
	}

	@Override
	public void clearWaypoints() {
		waypoints.clear();
	}


	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void damage(int damage) {
		health -= damage;
		if (health <= 0) death(); 
	}

	@Override
	public void setDefense(int defense) {
		this.defense = defense;
	}

	@Override
	public int getDefense() {
		return defense;
	}

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public void death() {
		// TODO Auto-generated method stub
		
	}
	
	
}
