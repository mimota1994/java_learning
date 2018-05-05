package property;

public class Weapon extends Item{
	
	int damage;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon infinityEdge=new Weapon();
		infinityEdge.damage=65;
		infinityEdge.name="无尽之刃";
		infinityEdge.price=3600;

	}

	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return false;
	}

}
