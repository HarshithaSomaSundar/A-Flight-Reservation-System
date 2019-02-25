/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author Harshitha
 */
public class Flights {
    private String airlineName;

    
    private String flightNumber;
    private String Source;
    private String Destination;

    private Date DepratureTime;
    private Date ArrivalTime;
    private int noOfSeats;
    private String timeofday;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    private ArrayList<String> windowList;
    
     private ArrayList<String> middleList;
      private ArrayList<String> aisleList;

    public ArrayList<String> getWindowList() {
        return windowList;
    }

    public ArrayList<String> getMiddleList() {
        return middleList;
    }

    public ArrayList<String> getAisleList() {
        return aisleList;
    }
    
      
      public void addWindowList()
      {
          windowList= new ArrayList<String>();
          windowList.add("Window");
          for (int i=0; i<2; i++)
          {
              for (int j=1; j<=25;j++)
              {
              if(i==0)
              {
               windowList.add("A"+j);   
              }
              else
              {
                windowList.add("F"+j);     
              }
          }
      }
          
      }
      
       public void addMidleList()
      {
          middleList= new ArrayList<String>();
          middleList.add("Middle");
          for (int i=0; i<2; i++)
          {
              for (int j=1; j<=25;j++)
              {
              if(i==0)
              {
               middleList.add("B"+j);   
              }
              else
              {
                middleList.add("E"+j);     
              }
          }
      }
          
      }
       
       public void addAisleList()
      {
          aisleList= new ArrayList<String>();
          aisleList.add("Aisle");
          for (int i=0; i<2; i++)
          {
              for (int j=1; j<=25;j++)
              {
              if(i==0)
              {
               aisleList.add("C"+j);   
              }
              else
              {
                aisleList.add("D"+j);     
              }
          }
      }
          
      }
       
       public ArrayList<String> removeWindow(String s)
       {
           windowList.remove(s);
           return windowList;
       }
       public ArrayList<String> removeMiddle(String s)
       {
           middleList.remove(s);
           return middleList;
       }
       public ArrayList<String> removeAisle(String s)
       {
           aisleList.remove(s);
           return aisleList;
       }
       
       
      
    

    public String getTimeofday() {
        return timeofday;
    }

    public void setTimeofday(String timeofday) {
        this.timeofday = timeofday;
    }
    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    
    
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public Date getDepratureTime() {
        return DepratureTime;
    }

    public void setDepratureTime(Date DepratureTime) {
        this.DepratureTime = DepratureTime;
    }

    public Date getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(Date ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }
    
    @Override
    public String toString()
    {
        return flightNumber;
    }
    
}
