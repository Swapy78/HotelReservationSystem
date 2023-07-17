//Java program to add Hotel in a Hotel Reservation System with Name and rates

package demo;

import java.util.Scanner;

public class AddHotel {

		//Declaring private variables to store hotel information
		private String Name;
	    private String Rates;
	    
	    //Defining a constructor to initialize the variables
	    public AddHotel(String Name, String Rates) {
	    	 this.Name = Name;
	         this.Rates = Rates;
	}
	  //Defining getters and setters for the variables
	    public String getName() {
	        return Name;
	    }

	    public void setName(String Name) {
	        this.Name = Name;
	    }

	    public String getRates() {
	        return Rates;
	    }

	    public void setRates(String Rates) {
	        this.Rates = Rates;
	    }
	    
	    
	    //Defining the main method to interact with the user and create a new hotel
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        //Telling the user for input and store the values in local variables
	        System.out.print("Enter hotel name: ");
	        String Name = sc.nextLine();
	        System.out.print("Enter rates: ");
	        String Rates = sc.nextLine();
	        
	        //Creating a new contact object with the user-provided values
	        AddHotel hotel = new AddHotel(Name, Rates);
	        
	      //Displaying the new hotel information to the user
	        System.out.println("\nHotel created:");
	        System.out.println();
	        System.out.println("Name: " + hotel.getName());
	        System.out.println("Rates: " + hotel.getRates());
	        
	        sc.close();
	        
	    }
}
