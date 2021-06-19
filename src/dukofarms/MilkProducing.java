/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dukofarms;

import java.util.Date;

/**
 *
 * @author G3NZ
 */
public class MilkProducing extends Animal{
    private Double Production;

    public Double getProduction() {
        return Production;
    }

    public void setProduction(Double Production) {
        this.Production = Production;
    }

    public String getSrno() {
        return Srno;
    }

    public void setSrno(String Srno) {
        this.Srno = Srno;
    }

    public Date getPruchaseDate() {
        return PruchaseDate;
    }

    public void setPruchaseDate(Date PruchaseDate) {
        this.PruchaseDate = PruchaseDate;
    }

    public Integer getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(Integer PurchasePrice) {
        this.PurchasePrice = PurchasePrice;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }
    
}
