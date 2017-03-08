package Models.NPCs;

import java.util.ArrayList;
import java.util.Random;

import Controller.StoryController;
import Interfaces.Interactable;
import Models.Collision;
import Models.Entity;
import Models.Upgrades.BonusDamage;
import Models.Upgrades.DamageReduction;
import Models.Upgrades.ForceFieldReflection;
import Models.Upgrades.SpeedBoost;
import Models.Upgrades.Upgrade;
import javafx.scene.image.Image;

public abstract class NPC extends Entity implements Interactable{
	
	private StoryController controller;

	public NPC(Image i, StoryController st, int x, int y) {
		super(i, x, y, (int)i.getWidth(), (int)i.getHeight());
		controller = st;
		setTag("NPC");
		setDisplayLayer(6);
	}
	
	@Override
	public void update(ArrayList<Entity> entities){
		// do nothing
	}
	
	@Override
	public void hasCollided(Collision c){
//		Entity collider;
//		if(c.collidingEntity == this){
//			collider = c.collidedEntity;
//		} else { 
//			collider = c.collidingEntity;
//		}
//		System.out.println(collider);
//		System.out.println(collider.getTag());
//		String[] tagElements = collider.getTag().split("-");
//		switch(tagElements[0]){
//		case "Human":
//			if(InputHandler.keyInputContains(KeyCode.F)){
//				interact((PlayableCharacter)collider);
//			}
//			break;
//		}
	}

	public StoryController getController(){
		return controller;
	}
	
	public Upgrade getRandomUpgrade() {
		Random rand = new Random();
		int selection = rand.nextInt(4) + 1;

		switch (selection) {
		case 1:
			return new BonusDamage(0, 0);
		case 2:
			return new DamageReduction(0, 0);
		case 3:
			return new ForceFieldReflection(0, 0);
		default:
			return new SpeedBoost(0, 0);

		}
	}
	
}
