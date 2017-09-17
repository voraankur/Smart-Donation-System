/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Network.Network;
import Business.Organization.Organization;
import com.db4o.collections.ActivatableArrayList;

/**
 *
 * @author Ankur
 */
public class DonationSystem extends Organization {
    private static DonationSystem business;
    private ArrayList<Network> networkList;
    
    public static DonationSystem getInstance(){
        if(business==null){
            business=new DonationSystem();
            
        }
        return business;
    }
    
    private DonationSystem(){
        super(null);
        networkList=new ArrayList<>();
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network createNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
      
    }
}
