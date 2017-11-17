import java.util.ArrayList;
public class SortArrayList {
	public static void main(String[] args) {
		// Create and arrayList
		ArrayList<Number> list = new ArrayList<>();
		list.add(5);
		list.add(11);
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(3);
		list.add(10);
		list.add(1);
		list.add(4);
		list.add(12);
		list.add(2);
		list.add(6);
		//Display original list
		System.out.println(list.toString());
		// Sort the list
		sort(list);
		// Display sorted numbers list
		System.out.println(list.toString());
	}
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			// Find the min in the list
			Number min = list.get(i);
			int minIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}
			// Swap list.get(i) with list.get(minIndex)
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			} 
		}
		
	}
}