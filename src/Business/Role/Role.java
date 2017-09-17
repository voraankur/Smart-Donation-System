/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DonationSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Ankur
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        AppliancesDeptHead("Appliances Dept Head"),
        ClothesDeptHead("Clothe Dept Head"),
        FurnitureDeptHead("Furniture Dept Head"),
        MiscDeptHead("Misc Dept Head"),
        Donor("Donor"),
        Recipient("Recipient");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            DonationSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
