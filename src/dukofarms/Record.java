/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dukofarms;

import java.util.List;

/**
 *
 * @author G3NZ
 */
public class Record {
    private Integer Salary;
    private Integer FoodCost;
    private Integer VaccinationCost;
    private Integer TravellingCost;

    public Integer getFoodCost() {
        return FoodCost;
    }

    public void setFoodCost(Integer FoodCost) {
        this.FoodCost = FoodCost;
    }

    public Integer getVaccinationCost() {
        return VaccinationCost;
    }

    public void setVaccinationCost(Integer VaccinationCost) {
        this.VaccinationCost = VaccinationCost;
    }

    public Integer getTravellingCost() {
        return TravellingCost;
    }

    public void setTravellingCost(Integer TravellingCost) {
        this.TravellingCost = TravellingCost;        Integer Cost = this.VaccinationCost + this.TravellingCost + this.Salary + this.FoodCost;

    }
    
    public Integer Salaries(List<Employee> e)
    {
        this.Salary = 0;
        for (Employee employee : e) 
        {
            this.Salary =  this.Salary + employee.getSalary();
        }
        return Salary;
    }
    public Integer TotalCost()
    {
        Integer Cost = this.VaccinationCost + this.TravellingCost + this.Salary + this.FoodCost;
        return Cost;
    }
    public Integer totalProfit(Cattle c, MilkProfit mp)
    {
        Integer profit =(c.profit() + mp.profit()) - TotalCost();
        return profit;
    }
}

