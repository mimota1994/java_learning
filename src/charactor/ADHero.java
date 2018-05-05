package charactor;

public class ADHero extends Hero implements Mortal{
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
	
	public void die(){
		System.out.println("物理攻击英雄死了");
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
