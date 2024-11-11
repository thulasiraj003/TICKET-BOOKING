package TRAVELS;
import java.util.*;

public class MAIN {
	public static void main(String[] args) {
		ArrayList<BUS>Buses = new ArrayList<>();
		ArrayList<BOOKING>Bookings = new ArrayList<>();
		
		Buses.add(new BUS(1,true,69));
		Buses.add(new BUS(2,true,3));
		Buses.add(new BUS(3,true,5));
		
		for(BUS b:Buses) {
			b.display();
		}
		Scanner sc = new Scanner(System.in);
		int cho = 1;
		while(cho==1) {
			
		
		System.out.println("press one to book ticket(or) press 2 to exit =");
		
		cho = sc.nextInt();
		if(cho == 1) {
			BOOKING Book =new BOOKING(sc);
			if(Book.isavaliable(Buses,Bookings)) {
				System.out.println("booked");
				Bookings.add(Book);
				
			}
			else {
				System.out.println("Exit");
			}
			
		  }
		}
		sc.close();
		
	}

}
