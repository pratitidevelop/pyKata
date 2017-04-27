import java.io.*;
import java.util.*;

public class GRADE{
	public static void main(String[] args){
		int[] grade5 = new int[20];
       
        for(int i=0;i<20;i++){
            grade5[i] = (i+1)*5;
        }
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            if ( grade < 38 ) {
                System.out.println(grade);
            } else if ( grade>=38 && grade <40 ){
                int diff = 40 - grade;
                if( diff < 3 ){
                    grade = 40;
                }
                System.out.println(grade);
            } else {
                int nextmul = 0;
                for(int i=0;i<20;i++){
                    if( grade <= grade5[i]) {
                        nextmul = grade5[i];
                        break;
                    }
                }
               
                int diff = nextmul -  grade;

                if( diff == 0 ) {
                	System.out.println(grade);
                } else if( diff == 2 ){
                	grade = nextmul ;
                	System.out.println(grade);
                } else {
                	System.out.println(grade);

                }
          
            }
        }
	}
}