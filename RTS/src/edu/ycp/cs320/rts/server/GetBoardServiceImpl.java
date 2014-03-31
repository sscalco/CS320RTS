package edu.ycp.cs320.rts.server;

import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.rts.shared.GameObject;
import edu.ycp.cs320.rts.shared.Point;

@SuppressWarnings("serial")
public class GetBoardServiceImpl extends RemoteServiceServlet {
	
	public ArrayList<GameObject> getBoard(String username) {
		
		
		return new ArrayList<GameObject>();
	}
	Boolean sendTroopMove(String username, String troopId, Point destination){
		return false;
	}
	Boolean sendBeginAttack(String username, String attackerId, String victimId){
		return false;
	}
	Boolean sendBuildStructure(String username, Point location){
		return false;
	}
	Boolean sendBuildUnit(String username, String creatorId){
		return false;
	}
	Boolean sendQuit(String username){
		return false;
	}
	String joinGame() throws IllegalArgumentException{
		return "NOT IMPLEMENTED YET";
	}
	Boolean sendMassTroopMove(String username, ArrayList<String> troopIDs, Point destination){
		return false;
	}
	
	Integer getUserResouces(String username){
		return 999;
	}
}
