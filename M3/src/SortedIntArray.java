import java.util.ArrayList;

public class SortedIntArray {
	private ArrayList<Integer> array;
	private SortingPolicy policy;
	
	public SortedIntArray(SortingPolicy policy) {
		array = new ArrayList<Integer>();
		this.policy = policy;
	}
	
	public int size( ) {
		return array.size();
	}
	
	public void add(int element) {
		// element is added in a way that keeps the array sorted
		for (int i = 0; i < size(); i++)
			if (policy.isBefore(element, get(i))) {
				array.add(i, element);
				return;
			}
		array.add(element);
		return;
	}
	
	public int get(int index) {
		return array.get(index);
	}
	
	// test function
	public static void main(String[] args) {
		SortedIntArray sortedArray = new SortedIntArray(new Ascending());
		sortedArray.add(1);
		sortedArray.add(4);
		sortedArray.add(2);
		sortedArray.add(8);
		for(int i = 0; i < sortedArray.size(); i++)
			System.out.println(sortedArray.get(i));
	}
}
