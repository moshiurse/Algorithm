package Searching;
import java.util.Scanner;

/**
 * @Author Moshiur Rahman
 * @Topic Linear Search Algorithm
 * @Date 08-05-2017
 */
public class LinearSearch {

	static int value[];

	public static void main(String[] args) {
		System.out.println("**************Linear Search**************\n\n");
		System.out.println("Please enter the number of value :");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int[] value = new int[number];

		for (int i = 0; i < number; i++) {
			value[i] = scanner.nextInt();

		}
		System.out.println("Which value you are seaching for? ");
		int svalue = scanner.nextInt();
		int j;
		for (j = 0; j < number; j++) {
			if (svalue == value[j]) {
				System.out.println(svalue + " found at position " + (j + 1));
				break;
			}

		}

		if (j == number) {
			System.out.println(svalue + " not found!!");
		}

	}

}
