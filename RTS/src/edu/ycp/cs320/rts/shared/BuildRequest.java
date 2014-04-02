/**
 * 
 */
package edu.ycp.cs320.rts.shared;

/**
 * @author dan
 *
 * Apr 2, 2014
 */
public class BuildRequest extends Request{
	
	private Point buildpoint;
	
	public BuildRequest(String userId, Point point) {
		super(userId);
		setBuildpoint(point);
	}

	/**
	 * @return the buildpoint
	 */
	public Point getBuildpoint() {
		return buildpoint;
	}

	/**
	 * @param buildpoint the buildpoint to set
	 */
	public void setBuildpoint(Point buildpoint) {
		this.buildpoint = buildpoint;
	}

	


}
