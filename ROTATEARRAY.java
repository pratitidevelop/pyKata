import java.io.*;
import java.util.*;

public class ROTATEARRAY{
	public static void reverse(int[] arr, int start, int end, int n){
		while(start < end ){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		// for(int j=0;j<n;j++){
		// 		System.out.print(arr[j]+ " ");
		// 	}
		// 	System.out.println();
		// return arr;
	}
	public static void main(String[] args){
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the number of testcases: ");
		int t=  scan.nextInt();
		for(int i=1;i<=t;i++){
			System.out.println("Enter the number of elements of array: ");
			int n = scan.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++){
				arr[j] =scan.nextInt();
			}
			System.out.println("Enter the size of array rotation: ");
			int d = scan.nextInt();
			 reverse(arr,0,d-1,n);
			 reverse(arr,d,n-1,n);
			 reverse(arr,0,n-1,n);
			System.out.println("after array rotation: ");
			for(int j=0;j<n;j++){
				System.out.print(arr[j]+ " ");
			}
			System.out.println();



		}
	}
}