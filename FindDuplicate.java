import java.io.*;
import java.util.*;

public class FindDuplicate {
	public static void main(String[] args) {
		// creating a hashTable that keeps track of the integer in the list and their respective  count

		Hashtable<Integer, Integer> hashtable =  new Hashtable<Integer, Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the list: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<n;i++){
			boolean isPresent = hashtable.containsKey(arr[i]);
			if ( isPresent == true ){
				int tillcount = hashtable.get(arr[i]);
				tillcount++;
				hashtable.put(arr[i],tillcount);
			} else {
				hashtable.put(arr[i],1);
			}
		}

		 Set<Integer> keys = hashtable.keySet();
		 

		   for(Integer key: keys){
		   		int element = key;
		   		int count = hashtable.get(key);
		   		if( count > 1 ) {
		   			System.out.println("The first repetated element is: "+key+" with the count of occurence "+count);
		   			break;
		   		} 
            	//System.out.println("Value of "+key+" is: "+hashtable.get(key));
        	}

        	// the solution given to answer in parker interview cake is O(1) but mine solution is O(n)
	}
}