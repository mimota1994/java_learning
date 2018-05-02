package property;

public class Item {
	
	private Item(){
		
	}
	
	static Item jingkela ;
	
	static Item getItem(){
		if(null==jingkela)
			jingkela=new Item();
		return jingkela;
	}
	
	String name;
	int price;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item Bloodbottle=new Item();
		Bloodbottle.name="血瓶";
		Bloodbottle.price=50;
		
		Item straw_sandals=new Item();
		straw_sandals.name="草鞋";
		straw_sandals.price=300;
		
		Item sword=new Item();
		sword.name="长剑";
		sword.price=350;

	}

}


