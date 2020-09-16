
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		// Sort the odd and even number of a given string of numbers
		//even ev = new even();
		odd od = new odd();
		System.out.println("Enter 5 numbers in any order by presing enter");
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the number");
			arr[i] = scan.nextInt();
		}

		System.out.println("to print the odd numbers enter 'o' to print the even numbers enter'e'");
		String str = scan.next();
		
		
		
//		if (str.equals("e")) {
//			ev.meven(arr);
//			System.out.println("even");
//			for (int j = 0; j < arr.length; j++) {
//				if ((arr[j] % 2) == 0) {
//					narr.add(arr[j]);
//				}
//			}
//		System.out.println("The even numbers entered are" + Arrays.toString(narr.toArray()));
		//}
		if (str.equals("o")) {
			System.out.println(od.modd(arr));
			
//			System.out.println("odd");
//			for (int j = 0; j < arr.length; j++) {
//				if ((arr[j] % 2) != 0) {
//					narr.add(arr[j]);
//				}
//			}
//			System.out.println("the odd numbers are" + Arrays.toString(narr.toArray()));
		}
	}
}