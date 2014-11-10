package HW;

public class GameLevel2 extends GameLevel{
	
	private static GameLevel2 instance = new GameLevel2();
	
	private GameLevel2(){}
	
	public static GameLevel getInstance(){
		if(instance == null){
			instance = new GameLevel2();
		}		
		return instance;
	}
	

	@Override
	public void simpleAttack() {
		System.out.println("level1 simple attack : 메롱~ 메롱~");		
	}
	@Override
	public void turnAttack() {
		System.out.println("level1 turn attack : 돌려차기쓍~~~");
	}
	@Override
	public void flyingAttack() {
		System.out.println("level1 flying attack : 이건 못하지롱");
	}
		

}
