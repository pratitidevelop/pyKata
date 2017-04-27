import java.io.*;
import java.util.*;

public class ReverseDigits{
		static int revnumber = 0;
		static int basePos =1;
	public static int revNum( int num ){
		
		if(num > 0){
			revNum(num/10);
			revnumber += (num%10)*basePos;
			basePos *= 10;
		}
		return revnumber;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("the number after reversing:"+revNum(num));
	}
}