package edu.ycp.cs320.rts.shared;

public class Structures implements Attackable{
	private int health;
	private int defense;
	
	void damage(int damage){
		this.health = this.health -  damage;
		if(this.health <= 0){
			this.health = 0;
			death();
			return;
		}
	}
	
	int getHealth(){
		return this.health;
	}
	
	int getDefense(){
		return this.defense;
	}
	
	int setDefense(int defense){
		return this.defense = defense;
	}
	
	void death(){
		//plays death animation
	}
}
