package edu.ycp.cs320.rts.shared;

import java.awt.Point;

public class GameObject {
	
	private Point position;
	private int image;
	private int width;
	private int height;
	
	
	public GameObject() {
		// TODO Auto-generated constructor stub
	}
	
	public void set_x(int x) {
		position.setLocation(x, position.getY());
	}
	
	public void set_y(int y) {
		position.setLocation(position.getX(), y);	
	}
	
	public void set_position(Point p) {
		position.setLocation(p);
	}
	
	
	public Point get_location() {
		return position;
	}
	public int get_x(){
		return (int)position.getX();
	}
	
	public int get_y() {
		return (int)position.getY();
	}
	
	public int get_image() {
		return image;
	}

	/**
	 * @return the height
	 */
	public int get_Height() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void set_Height(int height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int get_Width() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void set_Width(int width) {
		this.width = width;
	}
}
