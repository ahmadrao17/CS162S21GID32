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
public class Cattle implements Profit
{
    private Integer purchase;

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }
    private Integer sale;

    public void setSale(Integer sale) {
        this.sale = sale;
    }
    public Integer profit() 
    {
        Integer profit = purchase - sale;
        return profit;
    }

    
    
}
