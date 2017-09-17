/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.LifeEvent.LifeEventDirectory;
import Business.Product.ProductDirectory;
import Business.Requirement.RequirementDirectory;

/**
 *
 * @author Ankur
 */
public class Recipient extends Person {
    
    private String streetName;
    private String city;
    private String zipcode;
    private String phoneNumber;
    private String familyIncome;
    private String age;
    private ProductDirectory donationList;
    private RequirementDirectory requirementList;
    private LifeEventDirectory lifeEventList;

    public Recipient(){
        donationList= new ProductDirectory();
        requirementList = new RequirementDirectory();
        lifeEventList= new LifeEventDirectory();
    }

    public LifeEventDirectory getLifeEventList() {
        return lifeEventList;
    }

    public void setLifeEventList(LifeEventDirectory lifeEventList) {
        this.lifeEventList = lifeEventList;
    }

    public RequirementDirectory getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(RequirementDirectory requirementList) {
        this.requirementList = requirementList;
    }
    
    public ProductDirectory getDonationList() {
        return donationList;
    }

    public void setDonationList(ProductDirectory donationList) {
        this.donationList = donationList;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(String familyIncome) {
        this.familyIncome = familyIncome;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
    
}
