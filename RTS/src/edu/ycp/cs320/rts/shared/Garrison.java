package edu.ycp.cs320.rts.shared;

import java.util.ArrayList;

public class Garrison extends Structure implements CanTransport{
	int carryingCapacity;
	ArrayList<Unit> troops;
	/**
	 * 
	 */
	public Garrison(){
		super();
		this.carryingCapacity = 0;
		this.troops = new ArrayList<Unit>();
	}
	
	public Garrison(int carryingCapacity){
		this.carryingCapacity = carryingCapacity;
		this.troops = new ArrayList<Unit>();
	}
	/**
	 * 
	 */

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
		return;
	}
	/**
	 * 
	 */

	public int getCarryingCapacity() {
		return carryingCapacity;
	}
	
	/**
	 * 
	 */
	@Override
	public ArrayList<Unit> getPassenger() {
		// TODO Auto-generated method stub
		//Not sure what needs to go here.
		return null;
	}
	/**
	 * 
	 */
	@Override
	public void load(Unit unit) {
		troops.add(unit);
		return;		
	}
	/**
	 * 
	 */
	@Override
	public void unload(ArrayList<Unit> unit) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 */
	@Override
	public void unloadAll() {
		// TODO Auto-generated method stub
		
	}
	
}
