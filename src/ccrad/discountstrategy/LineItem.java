/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrad.discountstrategy;

/**
 *
 * @author Corbin
 */
public class LineItem {
    private ProductStrategy product;
    
        public static void main(String[] args) {
       
            ProductStrategy shirt = new Product("123", "Green Shirt", 3);
            System.out.println(shirt.getProductName() + "  " + shirt.getProductId() + "   " + shirt.getQty() + "  $" + shirt.getDiscount());
    }
}
