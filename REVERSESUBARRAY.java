import java.io.*;
import java.util.*;

public class REVERSESUBARRAY{
	public static void reverse(int[] arr, int n, int k){

		    for (int l = 0; l < n; l += k){
		        int left = l;
		 
		        // to handle case when k is not multiple of n
		        int right = Math.min(l + k - 1, n - 1);
		 
		        // reverse the sub-array [left, right]
		        while (left < right){
		        	int temp = arr[left];
		        	arr[left] = arr[right];
		        	arr[right] = temp;
		        	left++;
		        	right--;
		        }
		 
		    }
		     System.out.println("The array after group reversing: ");
			    for(int j=0;j<n;j++){
			    	System.out.print(arr[j]);
			    }

	}
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number of testcases: ");
			int t = sc.nextInt();
			for(int i=1;i<=t;i++){
				System.out.println("enter the size of the array: ");

			    int n = sc.nextInt();
			    int[] arr = new int[n];
			   	System.out.println("enter the elements of the array: ");

			    for(int k =0;k<n; k++){
			        arr[k]= sc.nextInt();
			    }
			   	System.out.println("enter the subarrSize: ");

			    int subarrSize = sc.nextInt();
			    reverse(arr,n,subarrSize);
			   
			    System.out.println();
			}
	}
}