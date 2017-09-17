/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DonationSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.UserVerificationOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Verification.UserVerificationPersonWorkAreaJPanel;

/**
 *
 * @author Ankur
 */
public class UserVerificationRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, DonationSystem business) {
        return new UserVerificationPersonWorkAreaJPanel(userProcessContainer, account, (UserVerificationOrganization)organization, enterprise);
    }
    
}
