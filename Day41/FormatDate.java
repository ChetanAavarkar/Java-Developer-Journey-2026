package Day41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate curdate = LocalDate.now();
		DateTimeFormatter type1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate1 = curdate.format(type1);
		
		DateTimeFormatter type2 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		String formattedDate2 = curdate.format(type2);
		
		System.out.println(formattedDate1);
		System.out.println(formattedDate2);
	}
}
