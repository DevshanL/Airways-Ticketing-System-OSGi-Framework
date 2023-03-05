package transportservicepublisher;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;


public class TransportServicePublishImpl implements TransportServicePublish{
	
	Scanner transport = new Scanner(System.in);
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	String name;
	String number;
	String transportType, transportTypeName;
	Integer time;
	Integer noOfkelometers = 0;
	Integer capacity;
	String rideDate;
	Double cost, totalCost;
	Integer rideID;
	Double fare,totalfare;


    
	@Override
	public String publishService() {
		basicData();
		
		System.out.println("Confirm the Ride? Y/N");
		String accept  = transport.next();
		
		if(accept.equals("N") || accept.equals("n")) {
			System.out.println(" ");
			System.out.println("Thank you & Goodbye!...");
			System.out.println(" ");
			basicData();
		}
		else if(accept.equals("Y") || accept.equals("y")) {
			System.out.println(" ");
			Random rand = new Random();
			rideID = rand.nextInt(99999);
			System.out.println("Your ride has been confirmed. Your ride ID is " + String.format("%05d", rideID) +  " Thank you!...");
			System.out.println(" ");
			billPrinter();
		}
		return "+++++++++++++++++++++++++++++++++++++";
       
	}
	
	public void basicData() {
		
		try
	    {	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(" ");
		System.out.println("=============================================================");
		System.out.println(" ");
		System.out.println("         Welcome! YOURS NO.01 TRANSPORT PARTNER");
		System.out.println(" ");
		System.out.println("      ==========RIDE JUST GOT EASIER!!!==========");
		System.out.println(" ");
		System.out.println("=============================================================");
		
		System.out.println("Please enter your Name :");
		name = input.readLine();
		System.out.println("Please enter your Contact Number : ");
		number = input.readLine();
		System.out.println(" ");
		System.out.println("------------------HI " + name + "! Check out our Transportaion options ---------------------------");
		System.out.println();
		System.out.println("A)  Mini Car	Start with 200.00 LKR for first 200km");
		System.out.println(" 	Capacity: 		3 Person\n ");
		System.out.println("B)  Car		    Start with 200.00 LKR for first 300km");
		System.out.println("	Capacity: 		4 Person\n ");
		System.out.println("C)  Minivan		Start with 300.00 LKR for first 250km");
		System.out.println("	Capacity:  		5 Person\n ");
		System.out.println("D)  Van		    Start with 400.00 LKR for first 350km");
		System.out.println("	Capacity:  		10 Person\n ");
		System.out.println(" ");
		System.out.println("Please select the transportation option you desire [ A | B | C | D ]");
		System.out.println("A) Mini Car \t B) Car \t C) Minivan \t D) Van  ");
		System.out.println(" ");

		
		transportType = input.readLine();
		
		if(transportType.equalsIgnoreCase("A")) {
			
			fare = 200.00;
			transportTypeName = "Mini Car";
			System.out.println("=========================================================");
			System.out.println(" ");
			System.out.println("=========================================================");
			System.out.println("        " +transportTypeName + " Transport Details   ");
			System.out.println("=========================================================");
			System.out.println(" ");
			System.out.println("* Driver Name: 		Anne Perera");
			System.out.println("* Capacity: 	    3 person ");
			System.out.println("* Taxi Color :	    Yellow");
			System.out.println(" ");
			System.out.println("=========================================================");
		
			
			System.out.println("Please Enter your ride date (DD/MM/YY) : ");
			rideDate = input.readLine();
			
			
			System.out.println("Please enter the time no of Kelometers for your destination : ");
			noOfkelometers = transport.nextInt();
			
			totalfare = fare*noOfkelometers;
			
			
			
			System.out.println("");
			
			System.out.println("=========================================================");
			System.out.println(" ");
			System.out.println("=========================================================");
			System.out.println("        Ride Summary   ");
			System.out.println("=========================================================");
			System.out.println(" ");
			System.out.println("Name :" + name );
			System.out.println("Contact No :" + number );
			System.out.println("Taxi Type :" + transportTypeName);
			System.out.println("Date :" + rideDate );
			System.out.println("Kelometers :" + noOfkelometers );
			System.out.println("fare:200,000 LKR");
			System.out.println("Total fare:" + totalfare+"0 LKR");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("=========================================================");
			System.out.println("");
			
		} else if(transportType.equalsIgnoreCase("B") ) {
			
			fare = 250.00;
			
			transportTypeName = "Car";
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        " +transportTypeName + " Transport Details   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("* Driver Name: 		Paul Peries");
			System.out.println("* Capacity: 	    4 person ");
			System.out.println("* Taxi Color :	    White");
			System.out.println(" ");
			System.out.println("=====================================");
		
			
			System.out.println("Please enter your ride date (DD/MM/YY) : ");
			rideDate = input.readLine();
			
			
			System.out.println("Please enter the time no of Kelometers for your destination : ");
			noOfkelometers = transport.nextInt();
			
			totalfare = fare*noOfkelometers;
			
			
			
			System.out.println("");
			
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        Ride Summary   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("Contact No :" + number );
			System.out.println("Taxi Type :" + transportTypeName);
			System.out.println("Date :" + rideDate );
			System.out.println("Kelometers :" + noOfkelometers );
			System.out.println("fare: 250,000 LKR");
			System.out.println("Total fare:" + totalfare+"0 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("");
			
			System.out.println("");
			
		} else if(transportType.equalsIgnoreCase("C") ) {
			
			fare = 300.00;
			
			transportTypeName = "Mini Van";
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        " +transportTypeName + " Transport Details   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("* Driver Name: 		K Kumar");
			System.out.println("* Capacity: 	    5 person ");
			System.out.println("* Taxi Color :	    Black");
			System.out.println(" ");
			System.out.println("=====================================");
		
			
			System.out.println("Please enter your ride date (DD/MM/YY) : ");
			rideDate = input.readLine();
			
			
			System.out.println("Please enter the time no of Kelometers for your destination : ");
			noOfkelometers = transport.nextInt();
			
			totalfare = fare*noOfkelometers;
			
			
			
			System.out.println("");
			
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        Ride Summary   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("Contact No :  " + number );
			System.out.println("Taxi Type :   " + transportTypeName);
			System.out.println(" Date : 	  " + rideDate );
			System.out.println("Kelometers :  " + noOfkelometers );
			System.out.println("fare: 		      300,000 LKR");
			System.out.println("Total fare:   " + totalfare+"0 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("");
			
         } else if(transportType.equalsIgnoreCase("D") ) {
			
        	fare = 350.00;
			
			transportTypeName = "Van";
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        " +transportTypeName + " Transport Details   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("* Driver Name: J Jagath");
			System.out.println("* Capacity: 10 person ");
			System.out.println("* Taxi Color : Gray");
			System.out.println(" ");
			System.out.println("=====================================");
		
			
			System.out.println("Please enter your ride date (DD/MM/YY) : ");
			rideDate = input.readLine();
			
			System.out.println("Please enter the time no of Kelometers for your destination : ");
			noOfkelometers = transport.nextInt();
			
			totalfare = fare*noOfkelometers;
			
			
			System.out.println("");
			
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        Ride Summary   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("Contact No :" + number );
			System.out.println("Taxi Type :" + transportTypeName);
			System.out.println("Date :" + rideDate );
			System.out.println("Kelometers :" + noOfkelometers );
			System.out.println("fare:350,000 LKR");
			System.out.println("Total fare:" + totalfare+"0 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("");
			
			System.out.println("");
			
			
			
		} 
		return;
      } catch (Exception ex) { }
	}
	
	public void billPrinter() {
		try {
			PrintStream printbill = new PrintStream(new File("C:/Users/pav/Desktop/transportReceipt.txt"));
			if(transportType.equalsIgnoreCase("A")) {				
				printbill.println();
				printbill.println("=======================================================");
				printbill.println("                 Ride Receipt                          ");
				printbill.println("=======================================================");
				printbill.println(" ");
				printbill.println("Name :" + name );
				printbill.println("Contact No :" + number );
				printbill.println("Transport Type :" + transportTypeName);
				printbill.println("Ride Date :" + rideDate );
				printbill.println("Kelometers :" + noOfkelometers );
				printbill.println("fare:200,000 LKR");
				printbill.println("Total fare:" + totalfare+"0 LKR");
				printbill.println(" ");
				printbill.println("=======================================================");
				System.out.println("The Receipt has been printed");
				
			} 
			else if(transportType.equalsIgnoreCase("B")) {
				printbill.println(" ");
				printbill.println("=======================================================");
				printbill.println("                  Ride Receipt                         ");
				printbill.println("=======================================================");
				printbill.println(" ");
				printbill.println("Name : 			" + name );
				printbill.println("Contact No : 	" + number );
				printbill.println("Transport Type :" + transportTypeName);
				printbill.println("Ride Date : 	" + rideDate );
				printbill.println("Kelometers : 	" + noOfkelometers );
				printbill.println("fare: 		        250,000 LKR");
				printbill.println("Total fare: 	" + totalfare+"0 LKR");
				printbill.println(" ");
				printbill.println("=======================================================");
				printbill.println("");
				System.out.println("The Receipt has been printed");
			} 
			else if(transportType.equalsIgnoreCase("C")) {
				printbill.println(" ");
				printbill.println("=======================================================");
				printbill.println("                  Ride Receipt                         ");
				printbill.println("=======================================================");
				printbill.println(" ");
				printbill.println("Name : 			" + name );
				printbill.println("Contact No : 	" + number );
				printbill.println("Transport Type :" + transportTypeName);
				printbill.println("Ride Date : 	" + rideDate );
				printbill.println("Kelometers : 	" + noOfkelometers );
				printbill.println("fare: 		        300,000 LKR");
				printbill.println("Total fare: 	" + totalfare+"0 LKR");
				printbill.println(" ");
				printbill.println("=====================================");
				printbill.println("");
				System.out.println("The Receipt has been printed");
			} 
			else if(transportType.equalsIgnoreCase("D")) {
				printbill.println(" ");
				printbill.println("=======================================================");
				printbill.println("                   Ride Receipt                        ");
				printbill.println("=======================================================");
				printbill.println(" ");
				printbill.println("Name : 		    " + name );
				printbill.println("Contact No :    " + number );
				printbill.println("Transport Type :" + transportTypeName);
				printbill.println("Ride Date : 	" + rideDate );
				printbill.println("Kelometers :    " + noOfkelometers  );
				printbill.println("fare: 		        350,000 LKR");
				printbill.println("Total fare:     " + totalfare+"0 LKR");
				printbill.println(" ");
				printbill.println("=====================================");
				printbill.println("");
				System.out.println("The Receipt has been printed");
			}
		
			
			else {
				printbill.println("");
			}	
			printbill.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
