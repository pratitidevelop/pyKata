import java.io.*;
import java.util.*;

public class SuperReducedString{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] arrinp = input.toCharArray();
		int len =0;
		int k =0;

		
		while( k < arrinp.length-1) {
			if( arrinp[k] == arrinp[k+1] ){
				// arrinp[len++] = arrinp[i];
				k += 2;
				
			} else {
				arrinp[len++] = arrinp[k];
				k++;
			}
		}

		for(int i=0;i<len; i++){
			System.out.print(arrinp[i]);
		}
	}
}