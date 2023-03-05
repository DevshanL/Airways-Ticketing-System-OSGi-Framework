package ticketingserviceproducer;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;





public class ServiceProduceImpl implements ServiceProduce{
	
	Scanner tic = new Scanner(System.in);
	
	BufferedReader Bfr = new BufferedReader(new InputStreamReader(System.in));
	
	String cusName;
	String cusNumber;
	String cusDesti;
	String ticketType;
	String ticketCategory;
	String checkInDate;
	Integer ticketID;
	Integer noOfTickets=0;
	Double primaryCost; 
	Double totalTicketsCost;
	
	public void ticketDetails() {
		
		try
	    {	
			
		BufferedReader Bfr = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-Welcome To AIRWAYS-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=Book A Ticket-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Enter Your User Name:- ");
		System.out.println("------------------------");
		cusName = Bfr.readLine();
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Enter your contact number:- ");
		System.out.println("------------------------------");
		cusNumber = Bfr.readLine();
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Enter your Desired Destination:- ");
		System.out.println("------------------------------");
		cusDesti = Bfr.readLine();
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Please enter your check in date (DD/MM/YY) : ");
		checkInDate = Bfr.readLine();
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("**********Hello " + cusName + "! Search for Emirates flights and book online. See our routes and schedules, and discover more about the experience you can look forward to on board**********");
		
		System.out.println(" ");
		System.out.println("************************************************************************************* ");
		
		System.out.println(" -A) Economy Class   -- 150,000 | Bagage Capacity -- 30kg");
		
		System.out.println(" -B) First Class     -- 210,000 | Bagage Capacity -- 45kg");
		
		System.out.println(" -C) Bussiness Class -- 330,000 | Bagage Capacity -- 55kg");
		
		System.out.println("************************************************************************************* ");
		System.out.println(" ");
		
		System.out.println("--Select a Airline Ticket Type You Desire--");
		
		System.out.println("A) Economy Class");
		System.out.println("B) First ClassM ");
		System.out.println("C) Bussiness Class");
		ticketType = Bfr.readLine();
		
		if(ticketType.equalsIgnoreCase("A")) {
			
			primaryCost = 150000.00;
			ticketCategory = "Economy Class";
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("        " +ticketCategory + "Air Ticket Details");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("--Flight No      : RD-1025");
			System.out.println("--Flying Hours   : 12 Hours ");
			System.out.println("--Meals          : One");
			System.out.println("--Ticket Price   : 150,000");
			System.out.println("--Departure Time : 00:07");
			System.out.println("--Arrival Time   : 12:15");
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
			System.out.println(" ");
			System.out.println(" ");
			
			
			System.out.println("Select the number of tickets you need to book :- ");
			noOfTickets = tic.nextInt();
			
			totalTicketsCost = primaryCost * noOfTickets;
			
			System.out.println("");
			System.out.println("");
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=Airline Ticket Booking Summary-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Passenger Name    : " + cusName );
			System.out.println("Contact No        : " + cusNumber );
			System.out.println("Ticket Category   : " + ticketCategory);
			System.out.println("Check in Date     : " + checkInDate );
			System.out.println("No of Tickets     : " + noOfTickets );
			System.out.println("Ticket Cost       :     150,000 LKR");
			System.out.println("Total Ticket Cost : " + totalTicketsCost+" LKR");
			
			System.out.println(" ");
			System.out.println(" ");
			
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			
			System.out.println("");
			System.out.println("");
			
		} else if(ticketType.equalsIgnoreCase("B") ) {
			
            ticketCategory = "First Class";
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("        " +ticketCategory + "Air Ticket Details");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("--Flight No      : XV-1020");
			System.out.println("--Flying Hours   : 10 Hours ");
			System.out.println("--Meals          : Two");
			System.out.println("--Ticket Price   : 210,000");
			System.out.println("--Departure Time : 18:25");
			System.out.println("--Arrival Time   : 04.20");
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
			System.out.println(" ");
			System.out.println(" ");
		
			
			System.out.println("Select the number of tickets you need to book :- ");
			noOfTickets = tic.nextInt();
			
			totalTicketsCost = primaryCost * noOfTickets;
			
			System.out.println("");
			System.out.println("");
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=Airline Ticket Booking Summary-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Passenger Name    : " + cusName );
			System.out.println("Contact No        : " + cusNumber );
			System.out.println("Ticket Category   : " + ticketCategory);
			System.out.println("Check in Date     : " + checkInDate );
			System.out.println("No of Tickets     : " + noOfTickets );
			System.out.println("Ticket Cost       :     210,000 LKR");
			System.out.println("Total Ticket Cost : " + totalTicketsCost+" LKR");
			
			System.out.println("");
			System.out.println("");
			
		} else if(ticketType.equalsIgnoreCase("C") ) {
			
			primaryCost = 330000.00;
			
			ticketCategory = "Bussiness Class";
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("        " +ticketCategory + "Air Ticket Details");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("--Flight No      : AS-1010");
			System.out.println("--Flying Hours   : 8 Hours ");
			System.out.println("--Meals          : Three");
			System.out.println("--Ticket Price   : 330,000");
			System.out.println("--Departure Time : 19:30");
			System.out.println("--Arrival Time   : 02.20");
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
			System.out.println(" ");
			System.out.println(" ");
		
			
			System.out.println("Select the number of tickets you need to book :- ");
			noOfTickets = tic.nextInt();
			
			totalTicketsCost = primaryCost * noOfTickets;
			
			System.out.println("");
			System.out.println("");
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=Airline Ticket Booking Summary-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Passenger Name    : " + cusName );
			System.out.println("Contact No        : " + cusNumber );
			System.out.println("Ticket Category   : " + ticketCategory);
			System.out.println("Check in Date     : " + checkInDate );
			System.out.println("No of Tickets     : " + noOfTickets );
			System.out.println("Ticket Cost       :     330,000 LKR");
			System.out.println("Total Ticket Cost : " + totalTicketsCost+" LKR");
			
			System.out.println("");
			System.out.println("");
			
			
		} 
		return;
      } catch (Exception ex) { }
	}
	
	
	@Override
	public String publishService() {
		ticketDetails();
		
		System.out.println("Do you confirm your airline ticket booking? Y/N");
		
		String nextStep  = tic.next();
		
		if(nextStep.equals("N") || nextStep.equals("n")) {
			System.out.println("Thank you for joining with us!");
			
			ticketDetails();
		}
		else if(nextStep.equals("Y") || nextStep.equals("y")) {
			Random randomNum = new Random();
			
			ticketID = randomNum.nextInt(10000);
			
			System.out.println("Your Airlinr Ticket booking has been confirmed. Your booking ID is " + String.format("%05d", ticketID) +  " Thank you for collaborating with us!");
			System.out.println("************************************************************************************************************");
			ticketPrinter();
		}
		return "-------------------------------------------------------------------------------------------------------------------------------";
       
	}
	

	
	public void ticketPrinter() {
		try {
			PrintStream print = new PrintStream(new File("C:/Users/Devshan/Desktop/ticket.txt"));
			if(ticketType.equalsIgnoreCase("A")) {				
				print.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				print.println("------------Ticket Booking-----------");
				print.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
				print.println(" ");
				print.println(" ");
				
				print.println("Passenger Name    :" + cusName );
				print.println("Contact No        :" + cusNumber );
				print.println("Ticket Category   :" + ticketCategory);
				print.println("Check in Date     :" + checkInDate );
				print.println("No of Tickets     :" + noOfTickets );
				print.println("Ticket Cost       : 	  150,000 LKR");
				print.println("Total Cost        :" + totalTicketsCost+" LKR");
				
				print.println(" ");
				print.println(" ");
				
				print.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
				System.out.println("Airline ticket has been printed.");
				
			} 
			else if(ticketType.equalsIgnoreCase("B")) {
				print.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				print.println("------------Ticket Booking-----------");
				print.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
				print.println(" ");
				print.println(" ");
				
				print.println("Passenger Name    :" + cusName );
				print.println("Contact No        :" + cusNumber );
				print.println("Ticket Category   :" + ticketCategory);
				print.println("Check in Date     :" + checkInDate );
				print.println("No of Tickets     :" + noOfTickets );
				print.println("Ticket Cost       : 	  210,000 LKR");
				print.println("Total Cost        :" + totalTicketsCost+" LKR");
				
				print.println(" ");
				print.println(" ");
				
				print.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
				System.out.println("Airline ticket has been printed.");
			} 
			else if(ticketType.equalsIgnoreCase("C")) {
				print.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				print.println("------------Ticket Booking-----------");
				print.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
				print.println(" ");
				print.println(" ");
				
				print.println("Passenger Name    :" + cusName );
				print.println("Contact No        :" + cusNumber );
				print.println("Ticket Category   :" + ticketCategory);
				print.println("Check in Date     :" + checkInDate );
				print.println("No of Tickets     :" + noOfTickets );
				print.println("Ticket Cost       : 	  330,000 LKR");
				print.println("Total Cost        :" + totalTicketsCost+" LKR");
				
				print.println(" ");
				print.println(" ");
				
				print.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
				System.out.println("Airline ticket has been printed.");
			} 
		
			
			else {
				
				print.println("");
				print.println("");
				print.println("Thank you!");
			}	
			print.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
