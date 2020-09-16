import java.util.ArrayList;
import java.util.Arrays;

public class even {
	public void meven(int[] arr) {
		ArrayList<Integer> narr = new ArrayList<>();
		System.out.println("even");
		for (int j = 0; j < arr.length; j++) {
			if ((arr[j] % 2) == 0) {
				narr.add(arr[j]);
			}
		}
	System.out.println("The even numbers entered are" + Arrays.toString(narr.toArray()));
	}
}
