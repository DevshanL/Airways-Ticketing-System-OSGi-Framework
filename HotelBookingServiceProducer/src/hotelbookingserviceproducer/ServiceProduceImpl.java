package hotelbookingserviceproducer;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
 
public class ServiceProduceImpl implements HotelServiceProduce{
	
	@Override
	public String publishService() {
		Hotels();
		
		System.out.println("Do you confirm your hotel booking? Y/N");
		String nextStep  = bill.next();
		if(nextStep.equals("N") || nextStep.equals("n")) {
			System.out.println("Thank you for visiting us. Hope you enjoyed your stay at our hotel. Hope to see you again. Have a nice day!");
			Hotels();
		}
		else if(nextStep.equals("Y") || nextStep.equals("y")) {
			Random rNum = new Random();
			billID = rNum.nextInt(7000);
			System.out.println("You Hotel booking has been confirmed. Your booking ID is " + String.format("%05d", billID) +  " Thank you for collaborating with us!");
			System.out.println("---------------------End---------------------");

		}
		return " ";
       
	}
	

	Scanner bill = new Scanner(System.in);
	
	BufferedReader bufferR = new BufferedReader(new InputStreamReader(System.in));
	
	String name;
	String number;
	
	Integer billID;
	Integer noOfNights=0;
	
	String email;
	String hotelName;
	
	String roomType;
	Double roomRate; 
	Double discount;
	
	Double totalBillAmount;
	String hotelChInDate;
	
	
	
	public void Hotels() {
		
		try
	    {	
			
		BufferedReader Bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("--------------------------------------------------------------Welcome To AIRWAYS------------------------------------------------------------");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=Book A Hotel-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("*");
		System.out.println("*");
		
		System.out.println("Please Enter Your User Name:");
		name = Bfr.readLine();
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Please Enter your contact number:");
		number = Bfr.readLine();
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
	
		System.out.println("Please Enter your Email Address:");
		email = Bfr.readLine();
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Enter the hotel check in date:");
		hotelChInDate = Bfr.readLine();
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		System.out.println("*" + name + " These are the hotels accommodation we offer for you. Please find comfortable and enjoy you staycation!");
		System.out.println("*-------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("1) Rosedel Hotel and Suite");
		System.out.println("---Singapore");
		System.out.println("---www.rosedelhotelandsuite.com");
		System.out.println("*----------------------------------------------");
		System.out.println("2) Soluxe Hotel");
		System.out.println("---Singapore");
		System.out.println("---Singapore");
		System.out.println("---www.soluxe.com");
		System.out.println("*----------------------------------------------");
		
		System.out.println("Select a hotel from below");
		System.out.println("");
		
		System.out.println("1) Rosedel Hotel and Suite");
		System.out.println("2) Soluxe Hotel");
		hotelName = Bfr.readLine();
		System.out.println("*");
		System.out.println("*");
		
		if(hotelName.equalsIgnoreCase("1")) {
			roomType = "Deluxe";
			
			System.out.println("");
			System.out.println("Rosedel Hotel and Suite" +roomType + " ");
			System.out.println("---------------------------------------------------");

			roomRate = 100.00;
			discount = 0.8;
			
			System.out.println("**********************************");
			
			System.out.println("Double Room");
			System.out.println("01 King Size Bed");
			System.out.println("Television");
			System.out.println("Air conditioner");
			System.out.println("Balcony with Sea view");
			System.out.println("Breakfast and dinner");
			
			System.out.println("**********************************");
		
			System.out.println(" ");
		
			System.out.println("Number of nights you stay?:");
			noOfNights = bill.nextInt();
			
			totalBillAmount = roomRate * noOfNights * discount;
			System.out.println("");
	
			System.out.println("-------------------------------Airline Ticket Booking Summary-----------------------------------");
		    System.out.println(" ");
	
			System.out.println("Customer Name    : " + name );
			System.out.println("Customer Contact No        : " + number );
			System.out.println("Room Type   : " + roomType);
			System.out.println("Check in Date     : " + hotelChInDate );
			System.out.println("No of Nights you stay     : " + noOfNights );
			System.out.println("Room Cost      :     100 $");
			
			System.out.println("**********************************"); 
			
			System.out.println("Total Bill Amount : " + totalBillAmount+" $");
		
			System.out.println("");

		} else if(hotelName.equalsIgnoreCase("2") ) {
			
			roomType = "Super Deluxe";
			
			System.out.println("");
			System.out.println("Soluxe Hotel" +roomType + " ");
			System.out.println("---------------------------------------------------");

			roomRate = 120.00;
			discount = 0.9;
			
			System.out.println("**********************************");
			
			System.out.println("Double Room");
			System.out.println("01 King Size Bed");
			System.out.println("Television");
			System.out.println("Air conditioner");
			System.out.println("02 balconies with Sea view");
			System.out.println("Breakfast, lunch and dinner ");
			System.out.println("Mini bar");
			System.out.println("Private pool");
			
			System.out.println("**********************************");
		
			System.out.println(" ");
		
			System.out.println("Number of nights you stay?:");
			noOfNights = bill.nextInt();
			
			totalBillAmount = roomRate * noOfNights * discount;
			System.out.println("");
	
			System.out.println("-------------------------------Airline Ticket Booking Summary-----------------------------------");
		    System.out.println(" ");
	
			System.out.println("Customer Name    : " + name );
			System.out.println("Customer Contact No        : " + number );
			System.out.println("Room Type   : " + roomType);
			System.out.println("Check in Date     : " + hotelChInDate );
			System.out.println("No of Nights you stay     : " + noOfNights );
			System.out.println("Room Cost      :     120 $");
			
			System.out.println("**********************************"); 
			
			System.out.println("Total Bill Amount : " + totalBillAmount+" $");
		
			
		} 
		return;
      } catch (Exception ex) { }
	}
	
	

}
	

	
