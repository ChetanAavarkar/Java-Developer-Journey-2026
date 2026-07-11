package Day41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
	
	public static void main(String[] args) {
		
		LocalDate curdate = LocalDate.now();
		System.out.println(curdate);
		
		LocalTime curtime = LocalTime.now();
		System.out.println(curtime);
		
		LocalDateTime curdatetime = LocalDateTime.now();
		System.out.println(curdatetime);
	}

}
