
import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		if (args[0].equals("-r")) {
			collectAllFiles(new File(args[1]));
		}
		else
			collectFiles(new File(args[0]));
	}

	private static void collectFiles(File dir) {
		File[] list = dir.listFiles();
		for (File file : list) {
			if (file.isFile())
				System.out.println(file);
		}
	}
	
	private static void collectAllFiles(File dir) {
		File[] fList = dir.listFiles();
		for (File file : fList) {
			if (file.isDirectory())
				collectAllFiles(file);
			else
				System.out.println(file);
		}
	}
	
}	
