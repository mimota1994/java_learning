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

	}

}
