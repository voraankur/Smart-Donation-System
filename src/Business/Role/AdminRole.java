/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DonationSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Ankur
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, DonationSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
