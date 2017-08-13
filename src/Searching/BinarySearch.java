package Searching;
import java.util.Scanner;

/**
 * @Author Moshiur Rahman
 * @Topic Binary Search Algorithm
 * @Date 08-05-2017
 */
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 10,15,20,35,38, 40};
		int counter = 9;
		System.out.println("******************Bianry search***************\n\n");
		System.out.println("Which value you want to search?");
		Scanner scanner = new Scanner(System.in);
		int svalue = scanner.nextInt();
		int min = 0;
		int max = 9, mid=0;
		int i;
		
		for(i=0;i<counter;i++){
			mid = (min+max)/2;
			if(arr[mid] > svalue){
				min = min;
				max = mid;
			}else if (arr[mid] < svalue) {
				min = mid;
				max = max;
			}else{
				System.out.println(svalue+" found at position "+(mid+1));
				break;
			}
		}
		if(i == counter){
			System.out.println(svalue+" not found!!");
		}

	}

}
