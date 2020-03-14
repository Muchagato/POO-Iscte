public class CharacterData {

    //Atributos
    private int total;
    private int[] count;

    //Construtores
    CharacterData() {
        count = new int[26];
    }

    //Métodos
    public void addWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }
        total += word.length();
    }

    public int getCount(int index) {
        return count[index];
    }

    public double percentages(int index) {
        return getCount(index)/(double)total*100;
    }

}