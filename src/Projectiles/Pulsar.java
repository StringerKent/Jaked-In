package Projectiles;

import java.util.ArrayList;
import java.util.HashSet;

import Models.Collision;
import Models.Entity;
import Models.Players.PlayableCharacter;
import Models.Upgrades.MedPack;
import SpriteSheet.SpriteSheet;
import javafx.scene.paint.Color;

public class Pulsar extends Projectile {
	
	public Pulsar(PlayableCharacter e) {
		super(e, SpriteSheet.getBouceProjectile(), 8);
		
	}

	@Override
	public void update(ArrayList<Entity> entities){
		entities.remove(this);
	}
	
	@Override
	public void move(ArrayList<Entity> entities){
		for(int i = 0; i < lifeTime; i++){
			if(hasHit.isEmpty()){
				super.move(entities);
			}
		}
	}
	
	public HashSet<Entity> killOff(ArrayList<Entity> entities){
		if(entities.contains(this)) {
			entities.remove(this);
		}
		for(int i = 0; i < lifeTime; i++){
			if(hasHit.isEmpty()){
				move(entities);
			}
		}
		entities.add(new MedPack(getXPos(), getYPos()));
		return hasHit;
	}

	@Override
	public String toString() {
		String tempString = "Pulsar " + (hasHit.isEmpty() ? "has not hit." : "has hit.");
		for(Entity i : hasHit){
			tempString += "  " + i.getTag();
		}
		return tempString;
	}
}
