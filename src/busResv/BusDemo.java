package busResv;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
      public static void main (String[]args) {
    	  ArrayList<bus> buses = new ArrayList<bus>();
    	  ArrayList<booking> bookings = new ArrayList<booking>();
    	  buses.add(new bus(1,true,65));
    	  buses.add(new bus(2,false,70));
    	  buses.add(new bus(3,true,75));
    	  int userOpt = 1;
    	  Scanner scanner = new Scanner (System.in);
    	  for(bus b:buses) {
    		  b.displayBusInfo();
    	  }
    	  while(userOpt == 1) {
    		  
    	  
    	  System.out.println("Enter 1 to book and 0 to Exit");
    	  userOpt = scanner.nextInt();
    	  if(userOpt == 1) {
    		  booking booking = new booking();
    		  if(booking.isAvailable(bookings,buses)) {
    			  bookings.add(booking);
    			  System.out.println("Your Booking Is Confirmed");
    		  }
    		  else 
    			  System.out.println("Sorry.Bus is full.Try another bus or date");
    	  }
    	  }
      }
}
