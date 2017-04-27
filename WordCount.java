import java.io.*;
import java.util.*;

public class WordCount{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String input = br.readLine();
		HashMap<String,Integer> hash = new HashMap<String,Integer>();
		input = input.replace('.',' ');
		input = input.replace(',',' ');
		String[] arr = input.split("\\s");

		for(int i=0;i<arr.length; i++){
			if( hash.containsKey(arr[i]) ) {

				int value = hash.get(arr[i]);
				value += 1;
				hash.put(arr[i], value);
			} else {
				hash.put(arr[i], 1);
			}
		}

		// for(int i=0;i< arr.length; i++){
		// 	System.out.println(arr[i]);
		// }
		Set set = hash.entrySet();
		Iterator itr = set.iterator();

		while( itr.hasNext() ){
			Map.Entry mentry = (Map.Entry)(itr.next());
			System.out.println( mentry.getKey() + "#" + mentry.getValue() );

		}	
	}
}