import java.util.Scanner;

public class FilterWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Frase: ");
        String line = scan.nextLine();
        while (!line.isEmpty()) {
            for (int i = 0; i < args.length; i++) {
                if (line.contains(args[i]))
                    line = line.replace(args[i], "").replace("  ", " ").trim();
            }
            System.out.println("Frase filtrada: " + line);
            System.out.print("Frase: ");
            line = scan.nextLine();
        }
        scan.close();
    }

}
