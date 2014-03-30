/**
 * 
 */
package edu.ycp.cs320.rts.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.rts.shared.*;

/**
 * @author Dan
 *
 * Mar 26, 2014
 */
@RemoteServiceRelativePath("board")
public interface GetBoardService extends RemoteService {
	
	ArrayList<GameObject> getBoard(String username)  throws IllegalArgumentException;
	Boolean sendTroopMove(String username, String troopId, Point destination) throws IllegalArgumentException;
	Boolean sendBeginAttack(String username, String attackerId, String victimId) throws IllegalArgumentException;
	Boolean sendBuildStructure(String username, Point location) throws IllegalArgumentException;
	Boolean sendBuildUnit(String username, String creatorId) throws IllegalArgumentException;
	Boolean sendQuit(String username) throws IllegalArgumentException;
	String joinGame() throws IllegalArgumentException;
	Boolean sendMassTroopMove(String username, ArrayList<String> troopIDs, Point destination) throws IllegalArgumentException;
	
}
