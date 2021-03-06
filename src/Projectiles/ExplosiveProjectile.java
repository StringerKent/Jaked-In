package Projectiles;

import java.util.ArrayList;

import Controller.GameController;
import Enums.Direction;
import Models.Entity;
import Models.Players.PlayableCharacter;
import SpriteSheet.SpriteSheet;

public class ExplosiveProjectile extends Projectile {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExplosiveProjectile(PlayableCharacter e) {
		super(e, SpriteSheet.getExplosiveProjectile(), 3);
	}

	@Override
	public void update(ArrayList<Entity> entities) {
		if(GameController.getTimer() >= lifeTime || !hasHit.isEmpty()){
			for(int i = 0; i < 8; i++){
				Projectile p = new NormalProjectile(getOwnedEntity());
				p.setXPos(this.getXPos());
				p.setYPos(this.getYPos());
				p.setCurrDir(Direction.values()[i < 4 ? i : i + 1]);
				p.setLifeTime((int)(20));
				p.setSpeed(p.getSpeed() + 3);
				entities.add(p);
				entities.remove(this);
			}
//			entities.remove(this);
		}
		move(entities);
	}
	
}
