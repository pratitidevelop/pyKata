import java.io.*;
import java.util.*;

public class Super {
	private static final String str = "";
	private static int[][] mem = new int[10][5];
	public static void initArr(){
		for(int i=0;i<10;i++){
			for(int j=0;j<5; j++){
				mem[i][j]= -1;
			}
		}
	}
	public static int compute(int i, int m) {
		if(i == str.length() -1 ) { return 0; }
		if ( mem[i][m] != -1 ) { return mem[i][m]; }
		 int x = str.charAt(i) - '0';
		 int s = 0 ;
		if( (x+m % 3 == 0) && (x%2 == 0)) {
		 	  s = ( compute( i+1, (x+m) % 3 ) + 1);
		 	 
		}	 
		 return  s;
	}	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		initArr();
		int sol = 0;
		System.out.println(str.length());
		try{
			for(int i=0;i<str.length();i++){
				if(i == str.length() ) break;
				sol += compute(i,0);
			}
		} catch(Exception e){
			e.printStackTrace();
		} finally {
					System.out.println(sol);

		}
		


	}
}