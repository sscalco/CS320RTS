/**
 * 
 */
package edu.ycp.cs320.rts.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.rts.shared.GameObject;
import edu.ycp.cs320.rts.shared.Point;

/**
 * @author Dan
 *
 * Mar 26, 2014
 */
public interface GetBoardServiceAsync {
	/**
	 * 
	 * @param username user's name
	 * @param callback returns an Arraylist of all of the GameObjects in the game
	 */
	void getBoard(String username, AsyncCallback<ArrayList<GameObject>> callback);
	
	/**
	 * 
	 * @param username user's name
	 * @param troopId ID of troop to move
	 * @param destination Point that troop should move to
	 * @param callback returns true if the unit will move
	 */
	void sendTroopMove(String username, String troopId, Point destination,
			AsyncCallback<Boolean> callback);
	
	/**
	 * 
	 * @param username user's name
	 * @param attackerId ID of object that attacks
	 * @param victimId ID of the object that is being attacked
	 * @param callback if the attack can take place
	 */
	void sendBeginAttack(String username, String attackerId, String victimId,
			AsyncCallback<Boolean> callback);
	/**
	 * 
	 * @param username user's name
	 * @param location location the building should be built
	 * @param callback
	 */
	void sendBuildStructure(String username, Point location,
			AsyncCallback<Boolean> callback);
	/**
	 * 
	 * @param username user's name
	 * @param creatorId the ID of the building that is creating the Unit
	 * @param callback returns true if the Unit will be created
	 */
	void sendBuildUnit(String username, String creatorId,
			AsyncCallback<Boolean> callback);
	/**
	 * 
	 * @param username user's name
	 * @param callback returns true if quit was successful
	 */
	void sendQuit(String username, AsyncCallback<Boolean> callback);
	
	/**
	 * 
	 * @param callback the username assigned by the server
	 */
	void joinGame(AsyncCallback<String> callback);
	
	/**
	 * 
	 * @param username user's ID
	 * @param troopIDs Arraylist of GameObject ID's to move
	 * @param destination Point to move objects to
	 * @param callback returns true if the objects will move
	 */
	void sendMassTroopMove(String username, ArrayList<String> troopIDs,
			Point destination, AsyncCallback<Boolean> callback);
	
	/**
	 * 
	 * @param username user's ID
	 * @param callback the  number of resources the the user has
	 */
	void getUserResouces(String username, AsyncCallback<Integer> callback);

}
