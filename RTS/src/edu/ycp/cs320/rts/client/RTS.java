package edu.ycp.cs320.rts.client;

import java.util.ArrayList;

import edu.ycp.cs320.rts.shared.FieldVerifier;
import edu.ycp.cs320.rts.shared.GameObject;
import edu.ycp.cs320.rts.shared.Point;
import edu.ycp.cs320.rts.shared.Structure;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

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
		GameView view = new GameView();
		ArrayList<GameObject> arr = new ArrayList<GameObject>();
		Structure test = new Structure(1, 1, new Point(320, 240), new Point(
				128, 128), 1, 100);
		test.setImageName("structureSprite.png");
		arr.add(test);

		view.setGameList(arr);

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

		view.activate();
	}
}
