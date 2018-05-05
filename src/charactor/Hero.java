package charactor;

public class Hero {

	String name;
	float hp;
	float armor;
	int moveSpeed;
	int deaths;
	int kill_nums;
	int assists;
	int money;
	int last_few;
	int attackcount;
	String killwword;
	String bekilledword;
	
	protected Hero(){
	}
	
	public void kill(Mortal...mortals) {
		for(int i=0;i<mortals.length;i++)
			mortals[i].die();
	}
	
	void keng(){
		System.out.println("坑队友！！！");
	}
	
	float getArmor(){
		return armor;
	}
	
	void addSpeed(int speed){
		moveSpeed=moveSpeed+speed;
	}
	
	void legendary(){
		System.out.println("超神");
	}
	
	float getHp(){
		return hp;
	}
	
	void recovery(float blood){
		hp=hp+blood;
	}
	
	
	
	
	public static void main(String[] args) {
		Hero garen=new Hero();
		ADAPHero h1=new ADAPHero();
		ADHero h2=new ADHero();
		APHero h3=new APHero();
		garen.kill(h1,h2,h3);
		
	}

}
