/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DonationSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AppliancesOrganization;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.AppliancesDeptHeadRole.AppliancesDeptHeadWorkAreaJPanel;

/**
 *
 * @author Ankur
 */
public class AppliancesDeptHead extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, DonationSystem business) {
        return new AppliancesDeptHeadWorkAreaJPanel(userProcessContainer, account,(AppliancesOrganization)organization, enterprise );
    }
    
}
