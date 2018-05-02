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
	
	public Hero(String name,float hp){
		this.name=name;
		this.hp=hp;
	}
	
	public Hero(String name,float hp,float armor,int moveSpeed){	
		this(name,hp);
		this.armor=armor;
		this.moveSpeed=moveSpeed;
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
		Hero garen=new Hero("盖伦",616.28f,27.536f,350);

		
		
		Hero teemo=new Hero("提莫",383f,14f,330);

	}

}
