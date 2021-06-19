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
     public void addCustomer(Customer cus){
        listcustomer.add(cus);
    }
     private int searchCustomer(String CNIC )
    {
        int index = -1;
         for(int i = 0 ; i  < listcustomer.size(); i++)
         {
             if(listcustomer.get(i).getContact().equals(CNIC))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
 
     public Customer getCustomer(String cnic)
    {
        int index = searchCustomer(cnic);
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
         public void addEmployee(Employee emp){
        listemployee.add(emp);
    }
     private int searchEmployee(String CNIC)
    {
        int index = -1;
         for(int i = 0 ; i  < listemployee.size(); i++)
         {
             if(listemployee.get(i).getCNIC().equals(CNIC))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
      public Employee getEmployee(String cnic)
    {
        int index = searchEmployee(cnic);
        return listemployee.get(index);
    }
          public boolean updateEmployee(String CNIC ,Employee empl){
       int index = searchEmployee(CNIC);
       
       if(index == -1)
           return false;
       else {
           listemployee.set(index, empl);
           return true;
       }
    }
           public boolean deleteEmployee(String CNIC){
       int index = searchEmployee(CNIC);
       
       if(index == -1)
           return false;
       else {
           listemployee.remove(index);
           return true;
       }
    }
               public List<Employee> getAllEmployee(){
        return listemployee;
    }
               public List<Employee> searchBasedonName(String nameText){
        List<Employee> searched = new ArrayList<Employee>();
        
         for(int i = 0 ; i  < listemployee.size(); i++)
         {
             if(listemployee.get(i).getName().contains(nameText))
             {
                 searched.add(listemployee.get(i));
             }
         }
        return searched;
    }
                public List<Employee> searchBasedonCNIC(String CNIC){
        List<Employee> searched = new ArrayList<Employee>();
        
         for(int i = 0 ; i  < listemployee.size(); i++)
         {
             if(listemployee.get(i).getCNIC().contains(CNIC))
             {
                 searched.add(listemployee.get(i));
             }
         }
        return searched;
    }
}
