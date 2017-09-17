/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DonationSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.DonorRole.DonorWorkAreaJPanel;

/**
 *
 * @author Ankur
 */
public class DonorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, DonationSystem business) {
        return new DonorWorkAreaJPanel(userProcessContainer, account, (DonorOrganization)organization, enterprise);
    }
        
}
