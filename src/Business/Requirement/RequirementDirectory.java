/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Requirement;

import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class RequirementDirectory {
    
    private ArrayList<Requirement> requirementList;
    
    public RequirementDirectory(){
        requirementList= new ArrayList<>();
    }

    public ArrayList<Requirement> getRequirementList() {
        return requirementList;
    }
    
    public Requirement addRequirement(String requirementName, String requirementDesc){
        Requirement requirement = new Requirement();
        requirement.setRequirementName(requirementName);
        requirement.setRequirementDesc(requirementDesc);
        requirementList.add(requirement);
        return requirement;
    }
}
