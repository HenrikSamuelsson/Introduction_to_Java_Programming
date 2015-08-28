import java.util.ArrayList;

/**
 * Exercise 13.2 from the book Introduction to Java Programming (10th).
 * <p>
 * Shuffle ArrayList
 * <p>
 * Method that shuffles an ArrayList of numbers and a main method to test the
 * shuffle method.
 */

public class Exercise_13_02 {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Number>();
		
		list.add(14);
		list.add(24);
		list.add(4);
		list.add(42);
		list.add(5);
		
		shuffle(list);

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}

	public static void shuffle(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int index = (int) (Math.random() * list.size());
			Number temp = list.get(i);
			list.set(i, list.get(index));
			list.set(index, temp);
		}
	}
}
