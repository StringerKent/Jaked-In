package Models.Upgrades;

import java.util.Random;

import Models.Players.PlayableCharacter;
import SpriteSheet.SpriteSheet;

public class MedPack extends Upgrade {
	
	private final int HPIncrease;

	public MedPack(int x, int y) {
		super(SpriteSheet.getMedPack(), x, y);
		Random randy = new Random();
		HPIncrease = randy.nextInt(21) + 20;
	}
	
	@Override 
	public void collect(PlayableCharacter c){
		c.heal(getHPIncrease());
		isCollected = true;
	}

	public int getHPIncrease() {
		return HPIncrease;
	}

}
