package TRAVELS;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class BOOKING {
	
	String name;
	int bbno;
	Date date;
	BOOKING(Scanner sc){
		System.out.println("name:");
		name =sc.next();
		System.out.println("bus number:");
		bbno = sc.nextInt();
		System.out.println("date in dd-mm-yy :");
		String n = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
		try {
			date =sdf.parse(n);
		}
		catch(ParseException e) 
		{
			e.printStackTrace();
		}
	}
		public boolean isavaliable(ArrayList<BUS> Buses, ArrayList<BOOKING> Bookings)
		{
			int booked=0;
			int capacity=0;
			for(BUS aa: Buses)
			{
				if(aa.getbno()==bbno)
				{
					capacity = aa.getsts();
				}
			}
			for (BOOKING bb : Bookings)
			{
				if(bb.bbno==bbno && bb.date.equals(date))
				{
					booked++;
				}
			}
			return booked<capacity;
	}
	
	

}
