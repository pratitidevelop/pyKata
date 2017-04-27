import java.io.*;
import java.util.*;

public class Mountain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String input = br.readLine();
		String[] arr = input.split("_");

		int[] hieght = new int[arr.length];

		for(int i=0;i<arr.length; i++){
			hieght[i] = Integer.parseInt(arr[i]);
		}
		int count =0;
		boolean up = true;
		for(int i=0;i < hieght.length -1 ; i++){
			if( hieght[i] < hieght[i+1] ){
				up = true;
			} else {
				if( up == true ){
					up = false;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}