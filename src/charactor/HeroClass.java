package charactor;

public class HeroClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(HeroType c:HeroType.values()){
			switch(c){
			case TANK:
				System.out.println("坦克");
				break;
			case WIZARD:
				System.out.println("法师");
				break;
			case ASSASSIN:
				System.out.println("刺客");
				break;
			case ASSIT:
				System.out.println("辅助");
				break;
			case WARRIOR:
				System.out.println("近战");
				break;
			case RANGED:
				System.out.println("远程");
				break;
			case PUSH:
				System.out.println("推进");
				break;
			case FARMING:
				System.out.println("打野");
				break;
			}
		}
	}

}
