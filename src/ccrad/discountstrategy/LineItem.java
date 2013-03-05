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

    public ProductStrategy product;
    private int qty;
    private double origPrice;
//    private String prodId;
//    private String prodName;
    
    public LineItem(String prodId, int qty) {
        FakeDataBase db = new FakeDataBase();
        product = db.findProduct(prodId);
    }

    public double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(double origPrice) {
        this.origPrice = origPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

//    public String getProdId() {
//        return prodId;
//    }
//
//    public void setProdId(String prodId) {
//        this.prodId = prodId;
//    }
//
//    public String getProdName() {
//        return prodName;
//    }
//
//    public void setProdName(String prodName) {
//        this.prodName = prodName;
//    }

    public ProductStrategy getProduct() {
        return product;
    }

    public void setProduct(ProductStrategy product) {
        this.product = product;
    }
    
}
