package HW;

public class Board {
	
	public static void main(String args[]){
		
		Player player = new Player();
		System.out.println("========level1 start ========");
		player.attack();
		System.out.println("========level1 end ========");
		
		GameLevel level = GameLevel2.getInstance();
		player.upgradeLevel(level);
		System.out.println("========level2 start ========");
		player.attack();
		System.out.println("========level2 end ========");
		
		level = GameLevel3.getInstance();
		System.out.println("========level3 start ========");
		player.upgradeLevel(level);
		player.attack();
		System.out.println("========level3 end ========");
		
	}
}
