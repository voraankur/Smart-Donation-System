/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Product.Product;
import Business.Role.AppliancesDeptHead;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class AppliancesOrganization extends Organization {

    
    
    public AppliancesOrganization() {
        super(Organization.Type.AppliancesDeptHead.getValue());
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AppliancesDeptHead());
        return roles;
    }
    
}
