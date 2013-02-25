/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrad.discountstrategy;

/**
 *
 * @author Corbin
 */
public interface DiscountStrategy {

    double getDiscount();
    double getCost();
    double getQty();
    
    void setDiscount(double discount);
    void setCost(double cost);
    void setQty(double qty);
    
}
