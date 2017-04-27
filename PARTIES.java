import java.util.*;
import java.lang.*;
import java.io.*;

public class PARTIES {
     public static String professorParties(int[] arr,int size){
        Arrays.sort(arr);
        for(int i = 0;i < size-1;i++){
            if(arr[i] == arr[i+1]){
                return "BOYS";
            }
        }
        return "GIRLS";
    }
	public static void main (String[] args) {
		
	        
	        
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    for(int i=0;i<t;i++){
		      int n = sc.nextInt();
		      int[] arr = new int[n];
		      for(int k=0;k<n;k++){
		          arr[i] = sc.nextInt();
		       }
		       String res =  professorParties(arr,n);
		       System.out.println(res);
		    }
	}
}