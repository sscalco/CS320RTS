package edu.ycp.cs320.rts.client;

import java.util.ArrayList;
import java.util.TreeMap;

import edu.ycp.cs320.rts.shared.GameObject;
import edu.ycp.cs320.rts.shared.GameState;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RTS implements EntryPoint {

	private Image combatantSprite;
	private Image unitSprite;
	private Image structureSprite;
	private Image turretSprite;

	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		// load sprites
		String combatantSpriteUrl = GWT.getModuleBaseForStaticFiles()
				+ "combatantSprite.png";
		String unitSpriteUrl = GWT.getModuleBaseForStaticFiles()
				+ "unitSprite.png";
		String structureSpriteUrl = GWT.getModuleBaseForStaticFiles()
				+ "structureSprite.png";
		String turretSpriteUrl = GWT.getModuleBaseForStaticFiles()
				+ "turretSprite.png";
		GWT.log("Combatant sprite: " + combatantSpriteUrl);
		GWT.log("Unit sprite: " + unitSpriteUrl);
		GWT.log("Structure sprite: " + structureSpriteUrl);
		GWT.log("Turret sprite: " + turretSprite);
		combatantSprite = new Image(combatantSpriteUrl);
		unitSprite = new Image(unitSpriteUrl);
		structureSprite = new Image(structureSpriteUrl);
		turretSprite = new Image(turretSpriteUrl);
		
		// Generate a new game view
		
		final GameView view = new GameView();
		
		GameState state = new GameState(new ArrayList<GameObject>(), new TreeMap<String, Integer>());
		
		view.setGameList(state.getGameobjects());

		// more stuff
		FlowPanel imagePanel = new FlowPanel();
		imagePanel.add(combatantSprite);
		imagePanel.add(unitSprite);
		imagePanel.add(structureSprite);
		imagePanel.add(turretSprite);
		imagePanel.setSize("0px", "0px");
		RootLayoutPanel.get().add(imagePanel);

		// add the view
		RootLayoutPanel.get().add(view);

		view.setUnitSprite(unitSprite);
		view.setCombatantSprite(combatantSprite);
		view.setStructureSprite(structureSprite);
		view.setTurretSprite(turretSprite);
		
		GetBoardServiceAsync boardservice = (GetBoardServiceAsync) GWT.create(GetBoardService.class);
		
		AsyncCallback<GameState> callback = new AsyncCallback<GameState>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				GWT.log("failed "+ caught.getMessage());
				
			}

			@Override
			public void onSuccess(GameState result) {
				GWT.log("Success");
				GameState newstate =(GameState) result;
				view.setGameList(newstate.getGameobjects());
				
			}
		};
		

		boardservice.exchangeGameState(state, callback);
		view.activate();
		
		
	}
}
