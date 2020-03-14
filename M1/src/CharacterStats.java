public class CharacterStats {

    public static void main(String[] args) {
        CharacterData data = new CharacterData();

        for (int i = 0; i < args.length; i++)
            data.addWord(args[i]);

        for (int i = 0; i < 26; i++)
            if (data.getCount(i) != 0) {
                System.out.println((char) ('a' + i) + ": " + data.getCount(i) + " (" + data.percentages(i) + "%)");
            }
    }

}
