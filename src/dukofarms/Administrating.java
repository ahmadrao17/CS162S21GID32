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
public class Administrating extends Person{
    private String email = "ahmadrao17@gmail.com";
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        boolean flag=true;
        for(int i=0;i<password.length();i++)
        {
            if(password.charAt(i)>='a' && password.charAt(i)<='z' || password.charAt(i)>='A' && password.charAt(i)<='Z'  || password.charAt(i)>='0'  && password.charAt(i)<='9')
            {
                
            }
            else{
                flag=false;
            }
        }
        if(flag)
        {
             this.password = password;
        }
       
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
         boolean flag =true;
    for(int i=0;i<username.length();i++)
    {
      if(username.charAt(i)>='a'  && username.charAt(i)<='z'   || username.charAt(i)>='A'  && username.charAt(i)<='Z'  || username.charAt(i)==' ' )
      {
        
      }
      else
      {
        flag=false;
      }
      
    }
    if(flag)
    {
       this.username = username;
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
    private String username;
    
}
