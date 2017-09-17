/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class ProductDirectory {
 
    private ArrayList<Product> productList;
    
    public ProductDirectory(){
        productList= new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    
    public Product addProduct(String name, String type, String desc, int quantity ){
        Product product= new Product();
        product.setProductName(name);
        product.setProductType(type);
        product.setProductDesc(desc);
        product.setQuantity(quantity);
        productList.add(product);
        return product;

    }
}
