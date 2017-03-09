package Models.NPCs;

import java.util.ArrayList;

import Controller.StoryController;
import Cutscene.Cutscene;
import Cutscene.DialogCutscene;
import Interfaces.Interactable;
import Models.Collision;
import Models.Entity;
import Models.Players.PlayableCharacter;
import SpriteSheet.SpriteSheet;

public class AmbushNPC extends PlayableCharacter implements Interactable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StoryController controller;
	private PlayableCharacter enemy;
	private boolean interacted;

	public AmbushNPC(StoryController controller, int x, int y) {
		super(SpriteSheet.getRandomNPC(), x, y);
		this.controller = controller;
		setDisplayLayer(6);
		setTag(getTag() + "-EnemyNPC");
	}

	@Override
	public void interact(PlayableCharacter p) {
		Cutscene c = new DialogCutscene(controller, .5, "GET HIM!");
		controller.startCutscene(c);
		setImage(SpriteSheet.getEnemy());
		setEnemy(p);
		interacted = true;
	}

	@Override
	public void hasCollided(Collision c) {
		
	}

	@Override
	public void update(ArrayList<Entity> entities) {
		if(interacted){
			// make sure we add weapon and health bar
		}
	}
	
	public void setEnemy(PlayableCharacter c){
		enemy = c;
	}

}
