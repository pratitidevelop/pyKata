import java.io.*;
import java.util.*;

public class TIME {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		System.out.print(time.length());
		int len = time.length();
		String amOrPm = time.substring(len-2);
		String output ="";
		System.out.println(amOrPm);
		if ( amOrPm.equals("AM") ) {
            String hrAm = time.substring(0,2);
            if ( hrAm.equals("12") ) {
                hrAm = "00";
            }
			 output = hrAm+time.substring(2,len-2);
		} else if( amOrPm.equals("PM") ) {
			int hr = Integer.parseInt( time.substring(0,2));
			System.out.println(hr);
			hr += 12;
            if( hr >= 24 ){
                hr = hr -12;
            }
			 output = Integer.toString(hr)+time.substring(2,len-2);

		}
		System.out.println(output);
	}
}