/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.People.Person;
import Business.People.SysAdmin;
import Business.Organization.AdminOrganization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Ankur
 */
public class ConfigureASystem {
    
    public static DonationSystem configure(){
        
        DonationSystem system = DonationSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
       
       
        
        
        Person admin = new SysAdmin();
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", admin, new SystemAdminRole());
        
        return system;
    }
    
    
}
