import java.io.*;
import java.util.*;

public class FLOWER {
	private static final char[][] flower = new char[3][5];
	public static void printflowerR1(){
		for(int i=0;i<5;i++){
			System.out.print(flower[0][i]);
		}
	}

	public static void printflowerR2(){
		for(int i=0;i<5;i++){
			System.out.print(flower[1][i]);
		}
	}


	public static void printflowerR3(){
		for(int i=0;i<5;i++){
			System.out.print(flower[2][i]);
		}
	}

	public static void initFlower(){
		flower[0][0] = '.';
		flower[0][1] = '.';
		flower[0][2] = 'O';
		flower[0][3] = '.';
		flower[0][4] = '.';
		flower[1][0] = 'O';
		flower[1][1] = '.';
		flower[1][2] = 'o';
		flower[1][3] = '.';
		flower[1][4] = 'O';
		flower[2][0] = '.';
		flower[2][1] = '.';
		flower[2][2] = 'O';
		flower[2][3] = '.';
		flower[2][4] = '.';

	}
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		initFlower();
		
		for(int i=0;i<r;i++){
			if (i == 0) {

				for(int j=0;j<c;j++){
					printflowerR1();
				}
				System.out.println();
				for(int j=0;j<c;j++){
					printflowerR2();
				}
				System.out.println();
				for(int j=0;j<c;j++){
					printflowerR3();
				}	
			} else {
				System.out.println();
				for(int j=0;j<c;j++){
					printflowerR2();
				}
				System.out.println();
				for(int j=0;j<c;j++){
					printflowerR3();	
				}
				
			}

						
				
			
		}
	}

	
}