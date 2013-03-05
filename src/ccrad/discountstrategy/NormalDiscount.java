/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrad.discountstrategy;

/**
 *
 * @author Corbin
 */
public class NormalDiscount implements DiscountStrategy {
    private double discount = .10;
    private double cost;
    private double qty;
    
    public NormalDiscount(double cost, double dis){
        this.cost = cost;
        discount = dis;
    }

    @Override
    public double getDiscount() {
        return discount * cost * qty;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
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

    
    
    
    
    public static void main(String[] args) {
        
        NormalDiscount dis = new NormalDiscount(20, 2);
        System.out.println(dis.getDiscount());
        
       
    }
}
