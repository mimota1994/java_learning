package charactor;

public class GiantDragon {
	private GiantDragon() {
	}
	
//	创建一个实例化对象，因为外部不能new创造，只能在内部创造,同样，没有实例化这个对象就要引用这个类类型的变量，所以要把这个变量设置为类变量
	static GiantDragon dragon =new GiantDragon();
	
//	返回这个对象,因为没有实例化对象就要引用这个方法，只能把这个方法设置为类方法，
	static GiantDragon getDragon(){
		return dragon;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
