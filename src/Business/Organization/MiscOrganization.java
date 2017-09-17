/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MiscDeptHead;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class MiscOrganization extends Organization {
    
    public MiscOrganization(){
        super(Organization.Type.MiscDeptHead.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MiscDeptHead());
        return roles;
    }
    
}
