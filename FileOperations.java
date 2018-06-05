import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.awt.Desktop;

public class FileOperations {
	
	static String filename = "test.txt";
	
	public static void rfile() {
	try {
		//prints current working directory.
		String presentWorkingDirctory = new File(".").getCanonicalPath();
		//System.out.println(presentWorkingDirctory);
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		//Creates FileReader object to read.
		FileReader fread = new FileReader(filename);
		int chr;
		while((chr=fread.read())!=-1)    // read file character by character
			System.out.print((char)chr);
		fread.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	public static void usingDesktop() {
		try {
			Desktop desktop = null;
			if (Desktop.isDesktopSupported()){
				desktop.getDesktop();
			}
			desktop.open(new File("/home/tr-dt-108/sagar/myworkspace/Practice/test.txt"));
			//desktop.print(new File(filename));
		}catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	public static void main (String [] args) {
		rfile(); 
		usingDesktop();
	}
}
