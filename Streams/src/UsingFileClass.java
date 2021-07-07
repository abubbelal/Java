import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;

public class UsingFileClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		File f = new File("filePath.txt");
		
		if(f.exists()) {
//			System.out.println("It is there");
//			System.out.println("Length of file is: " + f.length());
			
			if(f.isDirectory()) {
//				String files[] = f.list(); //list the directories in the array
				String files[] = f.list(new fnf());
				for(String name:files) {
//					if(name.endsWith(".java")) {
						System.out.println(name);
//					}
				}
//					System.out.println(name);
			}
		}
		else {
			System.out.println("The file does not exist");
			f.createNewFile();
		}
	}
	
}


class fnf implements FilenameFilter {
	
	@Override
	public boolean accept(File a, String ff) {
		if(ff.endsWith(".java"))
			return true;
		else 
			return false;
	}
}

