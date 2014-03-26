package edu.ycp.cs320.rts.shared;
import java.util.ArrayList;


public interface CanTransport {
	
	/**
	 * 
	 * @param carryingCapacity
	 */
	abstract void setCarryingCapacity(int carryingCapacity);
	
	/**
	 * Returns object's carrying capacity.
	 * 
	 * @return
	 */
	abstract int getCarryingCapacity();
	
	/**
	 * Returns object's current passenger(s).
	 * 
	 * @return
	 */
	abstract ArrayList<Unit> getPassenger();
	
	/**
	 * Load a unit.
	 * 
	 * @param unit
	 */
	abstract void load(Unit unit);
	
	/**
	 * Unloads a set of units.
	 * 
	 * @param unit
	 */
	abstract void unload(ArrayList<Unit> unit);
	
	/**
	 * Unloads all units.
	 * 
	 */
	abstract void unloadAll();
	
}
