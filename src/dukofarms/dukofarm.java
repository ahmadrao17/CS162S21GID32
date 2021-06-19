/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dukofarms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G3NZ
 */
public class dukofarm {
    private static dukofarm instance;
    
    private List<Customer> listcustomer;
    private List<Employee> listemployee;
    private List<Slaughtering> listCattle;
    private List<MilkProducing> listBuffalos;
    
    
    
    private dukofarm(){
        listcustomer = new ArrayList<Customer>();
        listemployee = new ArrayList<Employee>();
        listCattle = new ArrayList<Slaughtering>();
        listBuffalos = new ArrayList<MilkProducing>();
    }
    
    public static dukofarm getIsntance(){
        if(instance==null)
        {
            instance = new dukofarm();
        }
        
        return instance;
    }
    
}
