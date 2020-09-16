
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {

		// Sort the odd and even number of a given string of numbers s
		even ev = new even();
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

		if (str.equals("e")) {

			System.out.println(ev.meven(arr));
		}

		if (str.equals("o")) {
			System.out.println(od.modd(arr));


			}
		}
	}
