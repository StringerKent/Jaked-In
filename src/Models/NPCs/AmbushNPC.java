package Models.NPCs;

import java.util.ArrayList;

import Interfaces.Interactable;
import Models.Collision;
import Models.Entity;
import Models.Players.PlayableCharacter;
import Models.Weapon.HitBox;
import javafx.scene.image.Image;

public class AmbushNPC extends PlayableCharacter implements Interactable {

	public AmbushNPC(Image i, int x, int y) {
		super(i, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeDamage() {
		// TODO Auto-generated method stub

	}

	@Override
	public HitBox attack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void interact(PlayableCharacter c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hasCollided(Collision c) {
		throw new UnsupportedOperationException("Not yet Implemented");
	}

	@Override
	public void update(ArrayList<Entity> entities) {
		// TODO Auto-generated method stub
		
	}

}