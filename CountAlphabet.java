import java.io.*;
import java.util.*;

public class CountAlphabet{
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int count = 0;
		for( int i=0;i<str.length(); i++ ){
			int j = (int)(str.charAt(i));
			if ( ( j>= 65 && j<=91 ) || ( j>=97 && j<=122 ) ){
				count += 1;
			}

		}
		System.out.println(count);
	}
}