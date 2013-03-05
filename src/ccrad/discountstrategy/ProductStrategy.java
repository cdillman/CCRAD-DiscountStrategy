/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrad.discountstrategy;

/**
 *
 * @author Corbin
 */
public interface ProductStrategy {

    DiscountStrategy getDiscount();

    String getProductId();

    String getProductName();

    double getCost();

    void setDiscount(DiscountStrategy discount);

    void setProductId(String productId);

    void setProductName(String productName);

    void setCost(double cost);
    

}
