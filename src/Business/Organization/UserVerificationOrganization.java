/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.UserVerificationRole;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class UserVerificationOrganization extends Organization {

    public UserVerificationOrganization() {
        super(Organization.Type.UserVerification.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new UserVerificationRole());
        return roles;
    }
    
}
