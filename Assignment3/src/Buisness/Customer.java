/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import java.util.ArrayList;

/**
 *
 * @author Harshitha
 */
public class Customer {
    private String FirstName;
     private String LastName;
    private String PassportNo;
    private ArrayList<String> seatsBooked;
    private String flightNumber;
     private String AirlineName;
    private String emailId;
private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
     
     public Customer()
     {
         seatsBooked=new ArrayList<String>();
     }
     
      public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
   
     

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineName() {
        return AirlineName;
    }

    public void setAirlineName(String AirlineName) {
        this.AirlineName = AirlineName;
    }
   

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPassportNo() {
        return PassportNo;
    }

    public void setPassportNo(String PassportNo) {
        this.PassportNo = PassportNo;
    }

    public ArrayList<String> getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(ArrayList<String> seatsBooked) {
        this.seatsBooked = seatsBooked;
    }
   
    @Override
    public String toString()
    {
        return FirstName;
    }
    
    
    
}
