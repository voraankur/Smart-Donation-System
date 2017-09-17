/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.People.Donor;
import Business.People.Recipient;
import java.awt.Image;
import java.io.File;
import static java.sql.JDBCType.BLOB;
import static java.sql.Types.BLOB;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Ankur
 */
public class Product {
    
    private int productID;
    private String productName;
    private String productType;
    private String productDesc;
    private int quantity;
    private Donor donor;
    private Recipient recipient;
    private String productStatus;
    private String isDonated;
    private static int min=1000000000;
    private static int max=2147483647;
    private Date donationDate;
    private Date receivedDate;
    //private Image productImage;
    private File productImage;
    
    public Product(){
        Random randomGenerator = new Random();
         int randomInt = randomGenerator.nextInt((max-min)+1)+min; 
         productID= randomInt;
         donationDate= new Date();
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public File getProductImage() {
        return productImage;
    }

    public void setProductImage(File productImage) {
        this.productImage = productImage;
    }

    public String getIsDonated() {
        return isDonated;
    }

    public void setIsDonated(String isDonated) {
        this.isDonated = isDonated;
    }

    @Override
    public String toString() {
        return this.productName; //To change body of generated methods, choose Tools | Templates.
    }

}
