import java.io.*;
import java.util.*;

public class TEONOPROD{
	public static void main(String[] args){
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the number of testcases: ");
		int t=  scan.nextInt();
		for(int i=1; i<=t; i++ ){
			int n = scan.nextInt();
			int product = scan.nextInt();
			int[] arr = new int[n];
			for(int j=0; j<n; j++){
				arr[j] = scan.nextInt();
			}
			boolean flag = false;
			for(int j=0;j<=n-2; j++){
				System.out.print(arr[j]);
				System.out.print(arr[j+1]);

				if ( arr[j]* arr[j+1] == product ){
					System.out.print("YES");
					flag = true;
					break;
				}
			}
			if( !flag ){
				System.out.print("NO");
			}
			System.out.println();
		}

	}
}
