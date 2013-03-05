package ccrad.discountstrategy;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Corbin
 */
public class CashRegister {
    private Receipt receipt;

    public void startNewSale(String custId) {
        receipt = new Receipt(custId);
    }
    
    public void addItem(String productId, int qty){
        receipt.addLineItem(productId, qty);
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    
        
    
}
