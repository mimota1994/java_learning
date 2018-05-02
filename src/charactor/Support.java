package charactor;

public class Support extends Hero implements Healer{
	
	public Support() {
		
		// TODO Auto-generated constructor stub
	}
	
	public void heal(Hero h){
		
	}
	public void heal(Hero h,int hp){
		h.recovery(hp);
	}
	
	public void heal(){
		System.out.println("治疗");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero garen=new Hero();
		
		garen.armor=27.536f;
		garen.moveSpeed=350;
		garen.addSpeed(100);
		
		
		Hero teemo=new Hero();
		teemo.armor=14f;
		teemo.moveSpeed=330;

	}

}
