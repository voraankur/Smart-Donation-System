/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LifeEvent;

import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class LifeEventDirectory {
    private ArrayList<LifeEvent> lifeEventList;
    
    public LifeEventDirectory(){
        lifeEventList= new ArrayList<>();
    }

    public ArrayList<LifeEvent> getLifeEventList() {
        return lifeEventList;
    }
    
}
