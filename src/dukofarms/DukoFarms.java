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
public class DukoFarms {
    
private static DukoFarms instance;
    
    private List<Customer> listcustomer;
    private List<Employee> listemployee;
    private List<Slaughtering> listCattle;
    private List<MilkProducing> listBuffalos;
    
    
    
    private DukoFarms(){
        listcustomer = new ArrayList<Customer>();
        listemployee = new ArrayList<Employee>();
        listCattle = new ArrayList<Slaughtering>();
        listBuffalos = new ArrayList<MilkProducing>();
    }
    
    public static DukoFarms getIsntance(){
        if(instance==null)
        {
            instance = new DukoFarms();
        }
        
        return instance;
    }
     public void addContact(Customer cus){
        listcustomer.add(cus);
    }
     private int searchCustomer(String contact , String name)
    {
        int index = -1;
         for(int i = 0 ; i  < listcustomer.size(); i++)
         {
             if(listcustomer.get(i).getContact().equals(contact) ||  listcustomer.get(i).getName().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
        private int searchCustomer( String name)
    {
        int index = -1;
         for(int i = 0 ; i  < listcustomer.size(); i++)
         {
             if(listcustomer.get(i).getName().equals(name))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
     public Customer getContact(String cnic)
    {
        int index = searchCustomer(cnic,"");
        return listcustomer.get(index);
    }
          public boolean updateCustomer(String CNIC ,Customer custo){
       int index = searchCustomer(CNIC);
       
       if(index == -1)
           return false;
       else {
           listcustomer.set(index, custo);
           return true;
       }
    }
            public boolean deleteCustomer(String CNIC){
       int index = searchCustomer(CNIC);
       
       if(index == -1)
           return false;
       else {
           listcustomer.remove(index);
           return true;
       }
    }
             public List<Customer> getAllCustomers(){
        return listcustomer;
    }
               public List<Customer> searchBasedOnName(String nameText){
        List<Customer> searched = new ArrayList<Customer>();
        
         for(int i = 0 ; i  < listcustomer.size(); i++)
         {
             if(listcustomer.get(i).getName().contains(nameText))
             {
                 searched.add(listcustomer.get(i));
             }
         }
        return searched;
    }
        public List<Customer> searchBasedOnCNIC(String CNIC){
        List<Customer> searched = new ArrayList<Customer>();
        
         for(int i = 0 ; i  < listcustomer.size(); i++)
         {
             if(listcustomer.get(i).getCNIC().contains(CNIC))
             {
                 searched.add(listcustomer.get(i));
             }
         }
        return searched;
    }
}
