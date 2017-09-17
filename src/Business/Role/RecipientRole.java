/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DonationSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RecipientOrganization;
import Business.UserAccount.UserAccount;
//import UserInterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.RecipientRole.RecipientWorkAreaJPanel;

/**
 *
 * @author Ankur
 */
public class RecipientRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, DonationSystem business) {
        return new RecipientWorkAreaJPanel(userProcessContainer, account, (RecipientOrganization)organization, enterprise);
    }
    
}
