package learn_for_java;

public class test {
	private test(){
		
    }
	
	private static test instance=new test();
	
	public static test getInstance(){
		return instance;
	}
    public static void main(String[] args) {
    	test jjyy=new test();
    	jjyy.getInstance();
    }
       
}