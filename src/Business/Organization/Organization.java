/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.People.PersonDirectory;
import Business.Product.ProductDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ProductDirectory donationList;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Organization"), Donor("Donor Organization"), Recipient("Recipient Organization"),
        AppliancesDeptHead("Appliances Organization"), ClothesDeptHead("Clothes Organization"), 
        MiscDeptHead("Misc Organization"), UserVerification("User Verification Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        donationList= new ProductDirectory();
        
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public ProductDirectory getDonationList() {
        return donationList;
    }

    public void setDonationList(ProductDirectory donationList) {
        this.donationList = donationList;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
