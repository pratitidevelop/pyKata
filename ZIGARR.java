import java.io.*;
import java.util.*;

public class ZIGARR {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] arr = new int[m][n];


		for(int i=0; i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = scan.nextInt();
			}
		}

		int row =0;
		int col = 0;
		int line = 1;
		while ( row < m  ){
			if ( line == 1 ) {
				for(int j = 0; j< n; j++){
					System.out.print(arr[row][j]+ " ");
				}
				System.out.println();
				line = 0;
			}
			else if ( line == 0 ){
				for(int j=n-1; j>=0 ; j--){
					System.out.print(arr[row][j]+ " ");
				}
				System.out.println();
				line = 1;
			}
			row ++;
		}
	}
}

