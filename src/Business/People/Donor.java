/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

//import Business.Donor.*;

import Business.Product.Product;
import Business.Product.ProductDirectory;
import java.util.ArrayList;


/**
 *
 * @author Ankur
 */
public class Donor extends Person {
    //private String dName;
    private String streetName;
    private String age;
    private String phoneNumber;
    private String city;
    private String zipcode;
    private ProductDirectory donationList;
//    private ProductDirectory donationList;
    
    public Donor(){
        donationList= new ProductDirectory();
    }

    public ProductDirectory getDonationList() {
        return donationList;
    }

    public void setDonationList(ProductDirectory donationList) {
        this.donationList = donationList;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}
