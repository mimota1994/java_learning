package charactor;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero mimota=Hero.getHero();
		mimota.armor=(float) 1.0;
		Hero mimota1=Hero.getHero();
		System.out.println(mimota1.armor);
		
	}

}
