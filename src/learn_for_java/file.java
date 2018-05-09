package learn_for_java;
import java.awt.List;
import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collection;

public class file {
	
	static File getMin(File f){
		File[]fs=f.listFiles();
		if(fs==null)
			return new File("abcd.exe");
		ArrayList list=new ArrayList();
		for (int i=0;i<fs.length;i++){
			if(fs[i].isDirectory()){
				list.add(getMin(fs[i]));
			}
			else{
				list.add(fs[i]);
			}
		}
		
		
		File min=null;
		if(list.isEmpty())
			min=new File("abcd.exe");
		else{
			for(int j=0;j<list.size();j++){
				File temp = (File) list.get(j);
				if(temp.exists())
				{
					min=(File)list.get(j);
					break;
				}
			}
			
			if(min!=null){
				for(int j=0;j<list.size();j++){
					File temp=(File) list.get(j);
					if(temp.length()>min.length()&temp.exists()){
						min=temp;
					}
				}
			}
			else
				min=new File("abcd.exe");
		}
	
	return min;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:/");
		File min=getMin(f);
		System.out.println(min.getAbsolutePath());
		System.out.println(min.length());
	}
}
