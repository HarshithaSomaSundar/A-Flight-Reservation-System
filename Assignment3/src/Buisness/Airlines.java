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
public class Airlines {
    private String AirlineName;
    private FlightsDirectory flightDir;
    
    private  ArrayList<Flights> masterFlightSchedulesList;

    public ArrayList<Flights> getMasterFlightSchedulesList() {
        return masterFlightSchedulesList;
    }

    public void setMasterFlightSchedulesList(ArrayList<Flights> masterFlightSchedulesList) {
        this.masterFlightSchedulesList = masterFlightSchedulesList;
    }
   

    
    
    public Airlines()
    {
        flightDir= new FlightsDirectory();
        masterFlightSchedulesList = new ArrayList<Flights>();   
    }

   public FlightsDirectory getFlightDir() {
        return flightDir;
    }

    public String getAirlineName() {
        return AirlineName;
    }

    public void setAirlineName(String AirlineName) {
        this.AirlineName = AirlineName;
    }

   
     @Override
    public String toString() {
        return AirlineName;
    }
    
}
