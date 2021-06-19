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
public class MilkProfit implements Profit
{
    private Integer purchase;
    private Integer sale;

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }
    public Integer profit() {
        
        Integer profit = purchase - sale;
        return profit;
    
    }
    
    
}
