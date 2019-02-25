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
public class AirlineDirectory {
    private ArrayList<Airlines> airLineDirtList;
    private ArrayList<Customer> custDirList;
    
     public AirlineDirectory()
    {
        airLineDirtList= new ArrayList<Airlines>();
        custDirList= new ArrayList<Customer>();
    }
    
    

    public ArrayList<Customer> getCustDirList() {
        return custDirList;
    }

    public void setCustDirList(ArrayList<Customer> custDirList) {
        this.custDirList = custDirList;
    }
    
    public Customer addCustomer() {
        Customer c = new Customer();
        custDirList.add(c);
        return c;
        
    }

    public ArrayList<Airlines> getAirLineDirtList() {
        return airLineDirtList;
    }

    public void setAirLineDirtList(ArrayList<Airlines> airLineDirtList) {
        this.airLineDirtList = airLineDirtList;
    }
    
   
        

    

    public Airlines addAirline() {
        Airlines s = new Airlines();
        airLineDirtList.add(s);
        return s;
    }
    
    public void removeSupplier(Airlines s) {
        airLineDirtList.remove(s);
    }
    
    public Airlines searchAirline(String keyWord) {
        for(Airlines s : airLineDirtList) {
            if(keyWord.equals(s.getAirlineName())) {
                return s;
            }
        }
        return null;
    }
    
    
}
