/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dukofarms;

/**
 *
 * @author G3NZ
 */
public class Employee extends Non_Adminstrating{
    private Integer Salary;
    private String Designation;

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer Salary) {
        this.Salary = Salary;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
          boolean flag = true;
        if (contact.charAt(0) == '0' && contact.charAt(1) == '3') {

            if ((contact.charAt(2) >= '0' && contact.charAt(2) <= '4') && (contact.charAt(2) >= '0' && contact.charAt(2) <= '4')) {
                for (int i = 5; i < contact.length(); i++) {
                    if (contact.charAt(i) >= '0' && contact.charAt(i) <= '9') {

                    } else {
                        flag = false;
                    }
                }

            } else {
                flag = false;
            }

        } else {
            flag = false;
        }
        if (flag) {
            this.contact = contact;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean flag =true;
    for(int i=0;i<name.length();i++)
    {
      if(name.charAt(i)>='a'  && name.charAt(i)<='z'   || name.charAt(i)>='A'  && name.charAt(i)<='Z'  || name.charAt(i)==' ' )
      {
        
      }
      else
      {
        flag=false;
      }
      
    }
    if(flag)
    {
        this.name = name;
    }
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
      int size = CNIC.length();
        boolean flag = true;
        if (size == 15) {

            if (CNIC.charAt(5) == '-' && CNIC.charAt(13) == '-') {
                for (int i = 0; i < 5; i++) {
                    if (CNIC.charAt(i) >= '0' && CNIC.charAt(i) <= '9') {

                    } else {
                        flag = false;
                    }
                }
                for (int i = 6; i < 13; i++) {
                    if (CNIC.charAt(i) >= '0' && CNIC.charAt(i) <= '9') {

                    } else {
                        flag = false;
                    }
                }

                if (CNIC.charAt(14) >= '0' && CNIC.charAt(14) <= '9') {
                } else {
                    flag = false;
                }

            } else {
                flag = false;
            }

        } else {
            flag = false;
        }
        if(flag)
        {
             this.CNIC = CNIC;
        }
    }
    
                    
}
