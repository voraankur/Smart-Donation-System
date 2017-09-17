/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Recipient.getValue())){
            organization = new RecipientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AppliancesDeptHead.getValue())){
            organization = new AppliancesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ClothesDeptHead.getValue())){
            organization = new ClothesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MiscDeptHead.getValue())){
            organization = new MiscOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.UserVerification.getValue())){
            organization = new UserVerificationOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}