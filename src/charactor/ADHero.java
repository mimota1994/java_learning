package charactor;

public class ADHero extends Hero implements AD{
	public ADHero(){
		// TODO Auto-generated constructor stub
	}
	public void attack(){
		System.out.println(name+"进行了一次攻击，但" +
				"不确定打中了谁");
		
	}
	public void attack(Hero...he){
		for(int i=0;i<he.length;i++)
			System.out.println(name+"对" +he[i].name+
				"进行了一次攻击");
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ADHero bh=new ADHero("赏金猎人",1111f);
		
		Hero garen=new Hero("盖伦",616.28f);
		
		garen.armor=27.536f;
		garen.moveSpeed=350;
		garen.addSpeed(100);
		
		
		Hero teemo=new Hero("提莫",383f);
		teemo.armor=14f;
		teemo.moveSpeed=330;
		
		bh.attack(garen,teemo);

	}

}
