import java.io.*;
import java.util.*;

public class LoopRecursion{
	static int till =1;
	public static void printN(int n ){
		if (n == 0 ){
			return;
		} else {
			System.out.println(till);
			till++;
			printN(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printN(n);

	}
}
/* 
	Scanner scan = new Scanner(System.in);
	int t= scan.nextInt();
	for(int i=1;i<=t;i++){
		
	}
*/