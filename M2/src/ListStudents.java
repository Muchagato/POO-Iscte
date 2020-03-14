import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListStudents {

	public static void main(String[] args) {
		try {
			Scanner readingChannel = new Scanner(new File("Estudantes.txt"));
			
			while (readingChannel.hasNext()) {
				String s = readingChannel.nextLine();
				System.out.println(s);
			}
			readingChannel.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Problemas na leitura do ficheiro");
		}
	}

}