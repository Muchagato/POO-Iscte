import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class ListToString {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>(); // ["a", "b", "c"]
		List<String> list = new LinkedList<>(); 
		list.add("a");
		list.add("b");
		list.add("c");
		
		String text = separatedBy(list, ", "); // "a, b, c"
		System.out.println(list);
		System.out.println(text);
	}
	
	private static String separatedBy(List<String> list, String spacer) {
		String text = "";
		for (int i = 0; i < list.size() - 1; i++) {
			text += list.get(i) + spacer;
		}
		text += list.get(list.size()-1);
		return text;
	}
}
