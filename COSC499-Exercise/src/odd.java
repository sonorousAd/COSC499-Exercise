import java.util.ArrayList;
import java.util.Arrays;

public class odd {
	public ArrayList<Integer> modd(int[] arr) {
		ArrayList<Integer> narr = new ArrayList<>();
		System.out.println("odd");
		for (int j = 0; j < arr.length; j++) {
			if ((arr[j] % 2) != 0) {
				narr.add(arr[j]);
			}
		}
		return narr;
	//System.out.println("The odd numbers entered are" + Arrays.toString(narr.toArray()));
	}
}
