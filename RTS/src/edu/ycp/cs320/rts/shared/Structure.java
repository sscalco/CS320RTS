package edu.ycp.cs320.rts.shared;

public class Structure extends Interactable{
	
	/**
	 * 
	 */
	public Structure(){
		super();
	}
	
	
	/**
	 * 
	 * @param id
	 * @param owner
	 * @param pos
	 * @param size
	 * @param def
	 * @param health
	 */
	public Structure(int id, int owner, Point pos, Point size, int def, int health){
		super(id, owner, size, pos, def, health);
	}
}
