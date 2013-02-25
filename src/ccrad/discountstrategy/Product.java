/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ccrad.discountstrategy;

/**
 *
 * @author Corbin
 */
public class Product implements ProductStrategy{
    
    private String productId;
    private String productName;
    private double qty;
    private DiscountStrategy discount;
   

    public Product(String id, String name, double qty) {
        productId = id;
        productName = name;
        this.qty = qty;
    }

    @Override
    public String getProductId() {
        return productId;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getQty() {
        return qty;
    }

    @Override
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public DiscountStrategy getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
    
        public static void main(String[] args) {
            Product shirt = new Product("123","Green Shirt", 3);
            DiscountStrategy dis = new NormalDiscount(20, shirt.getQty());
            System.out.println(dis.getDiscount() + shirt.getProductName());
    }
    
    
}
