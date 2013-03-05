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
    private double cost;
    private DiscountStrategy discount;
   

    public Product(String id, String name, double cost, DiscountStrategy dis) {
        productId = id;
        productName = name;
        this.cost = cost;
        discount = dis;
        
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
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public DiscountStrategy getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(DiscountStrategy discount) {
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
    
    
    
//        public static void main(String[] args) {
//            Product shirt = new Product("123","Green Shirt");
//            DiscountStrategy dis = new NormalDiscount(20,.1);
//            System.out.println(dis.getDiscount() + "  " + shirt.getProductName());
//    }
    
    
}
