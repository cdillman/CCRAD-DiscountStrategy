/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrad.discountstrategy;

/**
 *
 * @author Corbin
 */
public class FakeDataBase {
    private Customer[] customers = {
	        new Customer("100", "John Smith"),
	        new Customer("200", "Sally Jones"),
	        new Customer("300", "Bob Clementi")};
    
      Product[] products = {
	        new Product("A101", "Baseball Hat", 19.95, new NormalDiscount(0.15, 3)),
	        new Product("B205", "Men's Dress Shirt", 35.50, new SecondDiscount(.10,5)),
	        new Product("C222", "Women's Socks", 9.50, new SecondDiscount(.10, 8))
	    };
     
       public final Customer findCustomer(final String custId) {
                Customer customer = null;
                for(Customer c : customers) {
                    if(custId.equals(c.getIdNumber())) {
                        customer = c;
                        break;
                    }
                }

                return customer;
       }
       
       public final Product findProduct(final String prodId) {
	        // validation is needed
	        Product product = null;
	        for(Product p : products) {
	            if(prodId.equals(p.getProductId())) {
	                product = p;
	                break;
	            }
	        }

	        return product;
	    }
	
}
