package busResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
           String passengerName;
           int busNo;
           Date date;
           booking() {
        	   Scanner scanner = new Scanner(System.in);
        	   System.out.println("Enter Name of Passenger: ");
        	   passengerName = scanner.next();
        	   System.out.println("Enter Bus Number: ");
        	   busNo = scanner.nextInt();
        	   System.out.println("Enter Date dd-mm-yyyy ");
               String dateInput = scanner.next();
               SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
               try {
				date = dateFormat.parse(dateInput);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           }
           public boolean isAvailable(ArrayList<booking>bookings,ArrayList<bus>buses) {
        	   int capacity = 0;
        	   for(bus bus:buses) {
        		   if (bus.getBusNo() == busNo)
        			   capacity = bus.getCapacity();
        	   }
        	   int booked = 0;
        	   for(booking b:bookings) {
        		   if(b.busNo == busNo && b.date.equals(date)) {
        			   booked++;
        		   }
        	   }
        	   return booked < capacity?true:false;
           }
}
