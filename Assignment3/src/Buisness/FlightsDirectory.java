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

public class FlightsDirectory {
    
     private ArrayList<Flights> flightsDirtList;
     
      public FlightsDirectory()
     {
         flightsDirtList = new ArrayList<Flights>();
     }

    public ArrayList<Flights> getFlightsDirtList() {
        return flightsDirtList;
    }
     
    
    
    public Flights addFlight() {
        Flights f = new Flights();
        flightsDirtList.add(f);
        return f;
    }
    
    public void removeFlight(Flights f) {
        flightsDirtList.remove(f);
    }
    
   public Flights searchFlight(String id) {
      
        for(Flights f : flightsDirtList) {
            System.out.println("id"+ id);
            if(f.getFlightNumber() == id) {
                System.out.println("fli"+ f.getFlightNumber());
                return f;
            }
        }
       return null;
    }
    
    
}
