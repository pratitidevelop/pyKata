import java.io.*;
import java.util.*;

public class NoOfPaths{
	public  static int uniquePaths(int m, int n) {
    	if(m==0 || n==0) return 0;
    	if(m==1 || n==1) return 1;
 
    	int[][] dp = new int[m][n];
 
    //left column
	    for(int i=0; i<m; i++){
    	    dp[i][0] = 1;
    	}
 
    //top row
	    for(int j=0; j<n; j++){
    	    dp[0][j] = 1;
    	}
 
    //fill up the dp table
    	for(int i=1; i<m; i++){
        	for(int j=1; j<n; j++){
        		if ( i == m-1 && j == n-1) {
        			dp[i][j] = 1 + dp[i - 1][j] + dp[i][j-1];
        		} else if (i == m-1) {
        			dp[i][j] = 1 + dp[i-1][j] + dp[i][j-1];

        		} else {
        		   	dp[i][j] = dp[i-1][j] + dp[i][j-1] + dp[i][j+1] + dp[i+1][j];
        		}
        	}
    	}
 
    	return dp[m-1][n-1];
	}
	public static void main(String[] args) {
	

		System.out.println("No of unique paths: "+ uniquePaths(4,4));
	}
}