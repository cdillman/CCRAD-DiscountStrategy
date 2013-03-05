/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrad.discountstrategy;

/**
 *
 * @author Corbin
 */
public class SecondDiscount implements DiscountStrategy{
    
    private double discount = .10;
    private double cost;
    private double qty;

    @Override
    public double getDiscount() {
        return discount * cost * qty;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public SecondDiscount(double cost, double qty) {
        this.cost = cost;
        this.qty = qty;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public double getQty() {
        return qty;
    }

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }
    
    
    
        
}
