package HW;

public class Player {
	
	public GameLevel level = GameLevel1.getInstance();
	
	
	public void upgradeLevel(GameLevel level){
		this.level = level;
	}
	
	public GameLevel getGameLevel(GameLevel level){
		return this.level;
	}
	
	public void attack(){
		level.play();
	}
		
}
