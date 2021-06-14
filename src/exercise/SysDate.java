package exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SysDate {

	public static void main(String[] args) {
		
		// every time you run the code,you want the system date.
		
		SimpleDateFormat formatter =new SimpleDateFormat(" HH:mm:ss");
		Date date = new Date();
		
		formatter.format(date);
		
		String StartTime =formatter.format(date);
		
		System.out.println();
		
		//how long does it take to print out 1 to 5000000  numbers.
		
		for(int i =1;i<=2000000; i++) {
			System.out.println(i);
		}
		Date date2 = new Date();
		
		String EndTime =formatter.format(date2);
		
		System.out.println("Start: " + StartTime + " vs "  + "End:" + EndTime);
		long difference = date2.getTime()- date.getTime();
		System.out.println(difference/1000 +  " Seconds");
		
		                                                                        //start time,end time .HowLongItTook = Endtime - StartTime;
		
		
		                                                                         //start time,end time .HowLongItTook = Endtime - StartTime;

	}

}
