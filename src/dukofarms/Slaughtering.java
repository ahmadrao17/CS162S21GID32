/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dukofarms;

import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author G3NZ
 */
public class Slaughtering extends Animal{
    private Double InitialWeight;
    private Double CurrentWeight;
    private Integer Price;
    private Icon picture;
    private Integer meatRate;

    public Double getInitialWeight() {
        return InitialWeight;
    }

    public void setInitialWeight(Double InitialWeight) {
        this.InitialWeight = InitialWeight;
    }

    public Double getCurrentWeight() {
        return CurrentWeight;
    }

    public void setCurrentWeight(Double CurrentWeight) {
        this.CurrentWeight = CurrentWeight;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer Price) {
        this.Price = Price;
    }

    public Icon getPicture() {
        return picture;
    }

    public void setPicture(Icon picture) {
        this.picture = picture;
    }

    public Integer getMeatRate() {
        return meatRate;
    }

    public void setMeatRate(Integer meatRate) {
        this.meatRate = meatRate;
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
