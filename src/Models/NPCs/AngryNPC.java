package Models.NPCs;

import java.util.ArrayList;

import Interfaces.Interactable;
import Models.Entity;
import Models.Players.PlayableCharacter;
import javafx.scene.image.Image;

public class AngryNPC extends PlayableCharacter implements Interactable {

	public AngryNPC(Image i, int x, int y) {
		super(i, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(ArrayList<Entity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interact(PlayableCharacter c) {
		// TODO Auto-generated method stub
		
	}


}