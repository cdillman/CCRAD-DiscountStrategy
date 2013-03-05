/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrad.discountstrategy;

/**
 *
 * @author Corbin
 */
public class CCRADDiscountStrategy {

    /**
     * @param args the command line arguments
     */
   
   
   public static void main(String[] args) {
       
            CashRegister cash = new CashRegister();
            
            cash.startNewSale("100");
            cash.addItem("A101", 4);
            cash.addItem("B205", 2);
            
            cash.getReceipt().printReceipt();
            
            
            
    }
}
