import java.io.*;
import java.util.*;

 class Store{
	public static int mine;
	public static int maxe;
}
public class MINMAXM {
	private static int  mine = 0;
	private static int maxe =0;
	public static void findmaxmin( int arr[], int low, int high ) {
		maxe = arr[low];
		mine = arr[low];
		for(int i= low+1; i<high; i++) {
			if ( maxe< arr[i] ) { maxe =  arr[i]; }
			if( mine > arr[i] ) { mine = arr[i]; }
		}
	}
	public static void main(String[] args) {
		Store  element = new Store();
		// element.mine = 4;
		// element.maxe = 5;
		// System.out.println(element.mine+" "+element.maxe);

		

		// for(int i=0;i<2;i++){
		// 	for(int j=0;j<2;j++){
		// 		storage[i][j].mine = 1;
		// 		storage[i][j].maxe = 2;
		// 	}
		// }

		// System.out.println("The new storage stucture elements saved: ");

		// for(int i=0;i<2;i++){
		// 	for(int j=0;j<2;j++){
		// 		System.out.print("maximum element: "+storage[i][j].maxe);
		// 		System.out.print("minimum element: "+storage[i][j].mine);
		// 	}
		// 	System.out.println();
		// }

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
		}	
		// int[][] mat = new int[n][n];
		// for( int i=0; i<n; i++) {
		// 	mat[i][i] = arr[i];
		// }
		Store[][] storage = new Store[n][n];

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				storage[i][j].mine = arr[i];
				storage[i][j].maxe = arr[i];

			}
		}




		for(int i = 1;i<n; i++){
			findmaxmin(arr,0,i);
			storage[0][i].mine = mine;	
			storage[0][i].maxe = maxe;	
		}

		for(int i=0;i<n;i++){
			System.out.print(storage[0][i].mine);
			System.out.print(storage[0][i].maxe);
		}
	}
}