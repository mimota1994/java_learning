package property;

public class Item {
	
	
	
	String name;
	int price;
	
	public String toString(){
		return name+price;
	}
	
	public void finalize(){
		System.out.println(this.name+"正在被回收");
	}
	
	public boolean equals(Object o){
		if (o instanceof Item){
			if(((Item) o).price==this.price)
				return true;
		}
		return false;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<2;i++){
//			Item Bloodbottle=new Item();
//			Bloodbottle.name="血瓶";
//			Bloodbottle.price=50;
//			
//			
////			System.out.println(Bloodbottle.toString());
//		}
//		
		Item Bloodbottle=new Item();
		Bloodbottle.name="血瓶";
		Bloodbottle.price=50;
	
		Item Blood=new Item();
		Blood.name="血";
		Blood.price=50;
		
		System.out.println(Bloodbottle.equals(Blood));
		
		

	}

}


