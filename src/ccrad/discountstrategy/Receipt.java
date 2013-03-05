/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrad.discountstrategy;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Corbin
 */
public class Receipt {
    
     private LineItem[] lineItems = new LineItem[0];
     private Customer customer;
    
     public Receipt(String custID) {
         FakeDataBase db = new FakeDataBase();
         customer = db.findCustomer(custID);
     }
     
     public void addLineItem(String prodId, int qty) {
       LineItem item = new LineItem(prodId, qty);
        addToArray(item);
        
    }
     
     private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
     public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPrice();
        }
        return grandTotal;
    }
     
     
     public void printReceipt(){
         
         String output = "Thanks for Shopping With Us!";
         output += "\n\n";
         output += "Sold to: " + customer.getFullName();
         output += "\nID\tDesc\tPrice\tQty\tSubtotal\tDiscount\n";
         output += "--\t----\t-----\t---\t--------\t--------";
         Date date = new Date();
         String format = "MM-dd-yyyy hh:mm a";
         SimpleDateFormat sdf = new SimpleDateFormat(format);
//         formattedDate = sdf.format(date);
         System.out.println(sdf.format(date));
         System.out.println(output);
          
         
        for(int i = 0; i < lineItems.length; i++) {
              
              System.out.println(lineItems[i].getProduct().getProductId() + " " + lineItems[i].getProduct().getProductName() + " " + lineItems[i].getProduct().getCost() + " " + lineItems[i].getProduct().getDiscount());
        }
     }
//     public static void main(String[] args) {
//         
//         ProductStrategy pro = new Product("123", "Green");
//         LineItem item = new LineItem(pro, 3);
//         Customer cust = new Customer();
//         
//         System.out.println(cust.getFirstName() + " " + cust.getIdNumber() + " " + item.product.getProductName());
//    }
}
