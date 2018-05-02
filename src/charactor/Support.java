package charactor;

public class Support extends Hero{
	
	public Support(String name, float hp) {
		super(name, hp);
		// TODO Auto-generated constructor stub
	}
	public void heal(){
		
	}
	public void heal(Hero h){
		
	}
	public void heal(Hero h,int hp){
		h.recovery(hp);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero garen=new Hero("盖伦",616.28f);
		
		garen.armor=27.536f;
		garen.moveSpeed=350;
		garen.addSpeed(100);
		
		
		Hero teemo=new Hero("提莫",383f);
		teemo.armor=14f;
		teemo.moveSpeed=330;

	}

}
