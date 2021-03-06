/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.Organization.RecipientOrganization;
import Business.People.Donor;
import Business.People.Person;
import Business.People.Recipient;
import Business.Requirement.Requirement;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ankur
 */
public class DonorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private DonorOrganization organization;
    private Boolean newRequirement=false;
    /**
     * Creates new form DonorWorkAreaJPanel
     */
    public DonorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DonorOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
       Donor donor=(Donor)userAccount.getEmployee();
       String welcomeStr="Welcome "+ donor +" to Smart Donation System";
       welcomeStringLabel.setText(welcomeStr);
       
            Organization org=null;
        for (Organization organization1 : enterprise.getOrganizationDirectory().getOrganizationList()) {
                       if (organization1 instanceof RecipientOrganization) {
                           org = organization1;   
                       }
        }
        for (Person person: org.getPersonDirectory().getPersonList() ){
           Recipient recipient = (Recipient) person;
           if(donor.getZipcode()!=null){
           if ((donor.getZipcode().equals(recipient.getZipcode()) &&
                   recipient.getRequirementList().getRequirementList().size()>0)){
               for(Requirement requirement: recipient.getRequirementList().getRequirementList())
               {
                   if(requirement.getStatus().equals("Pending")){
                       newRequirement = true;
                       //return;
                   }
               }
           }
        }
       
       if(newRequirement){
       newRequirementsJLabel.setText("New requirement in your area. Click on button if you want to see");
       newRequirementsJLabel.setVisible(true);
       }else{
           newRequirementsJLabel.setVisible(false);
       }
    }
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNewDonation = new javax.swing.JButton();
        btnDonationHistory = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnShowNearbyRequirements = new javax.swing.JButton();
        btnAddDetails = new javax.swing.JButton();
        welcomeStringLabel = new javax.swing.JLabel();
        newRequirementsJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        btnNewDonation.setText("Make a new donation");
        btnNewDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewDonationActionPerformed(evt);
            }
        });

        btnDonationHistory.setText("View Donation History");
        btnDonationHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationHistoryActionPerformed(evt);
            }
        });

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnShowNearbyRequirements.setText("Show Nearby Requirements");
        btnShowNearbyRequirements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowNearbyRequirementsActionPerformed(evt);
            }
        });

        btnAddDetails.setText("Add Details");
        btnAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailsActionPerformed(evt);
            }
        });

        welcomeStringLabel.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N

        newRequirementsJLabel.setText("jLabel2");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Donor Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnShowNearbyRequirements, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNewDonation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDonationHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(newRequirementsJLabel))
                            .addComponent(welcomeStringLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel6)))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeStringLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddDetails)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewDetails)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewDonation)
                        .addGap(26, 26, 26)
                        .addComponent(btnDonationHistory)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowNearbyRequirements))
                    .addComponent(newRequirementsJLabel))
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewDonationActionPerformed
        Donor donor= (Donor)userAccount.getEmployee();
        if((donor.getZipcode()==null || donor.getZipcode().equals(""))
                || donor.getPhoneNumber()==null || donor.getPhoneNumber().equals("")
                || donor.getStreetName()==null || donor.getStreetName().equals("")
                || donor.getCity()==null || donor.getCity().equals("")
                || donor.getAge()==null || donor.getAge().equals("")
           ){
            JOptionPane.showMessageDialog(null, "Enter details first");
            return;
        }else{
        NewDonationJPanel panel = new NewDonationJPanel(userProcessContainer,userAccount, organization,enterprise);
        userProcessContainer.add("NewDonationJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnNewDonationActionPerformed

    private void btnDonationHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationHistoryActionPerformed
        Donor donor= (Donor)userAccount.getEmployee();
        if((donor.getZipcode()==null || donor.getZipcode().equals(""))
                || donor.getPhoneNumber()==null || donor.getPhoneNumber().equals("")
                || donor.getStreetName()==null || donor.getStreetName().equals("")
                || donor.getCity()==null || donor.getCity().equals("")
                || donor.getAge()==null || donor.getAge().equals("")
           ){
            JOptionPane.showMessageDialog(null, "Enter details first");
            return;
        }else{
        ViewDonationHistoryJPanel panel = new ViewDonationHistoryJPanel(userProcessContainer,userAccount, organization,enterprise);
        userProcessContainer.add("ViewDonationHistoryJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnDonationHistoryActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        Donor donor= (Donor)userAccount.getEmployee();
        if((donor.getZipcode()==null || donor.getZipcode().equals(""))
                || donor.getPhoneNumber()==null || donor.getPhoneNumber().equals("")
                || donor.getStreetName()==null || donor.getStreetName().equals("")
                || donor.getCity()==null || donor.getCity().equals("")
                || donor.getAge()==null || donor.getAge().equals("")
           ){
            JOptionPane.showMessageDialog(null, "Enter details first");
            return;
        }else{
        ViewDetailsJPanel panel = new ViewDetailsJPanel(userProcessContainer,userAccount, organization,enterprise);
        userProcessContainer.add("ViewDetailsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnShowNearbyRequirementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowNearbyRequirementsActionPerformed
        Donor donor= (Donor)userAccount.getEmployee();
        Boolean isNearbyNeedyPeople=false;
        if((donor.getZipcode()==null || donor.getZipcode().equals(""))
                || donor.getPhoneNumber()==null || donor.getPhoneNumber().equals("")
                || donor.getStreetName()==null || donor.getStreetName().equals("")
                || donor.getCity()==null || donor.getCity().equals("")
                || donor.getAge()==null || donor.getAge().equals("")
           ){
            JOptionPane.showMessageDialog(null, "Enter details first");
            return;
        }else if(!donor.getZipcode().equals("")){
            Organization org=null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                       if (organization instanceof RecipientOrganization) {
                           org = organization;   
                       }
        }
        for (Person person: org.getPersonDirectory().getPersonList() ){
           Recipient recipient = (Recipient) person;
           if (donor.getZipcode().equals(recipient.getZipcode())){
               isNearbyNeedyPeople= true;
           }
        }
        
        if(!isNearbyNeedyPeople){
            
            JOptionPane.showMessageDialog(null, "There is no nearby requirements");
            return;
        }
        
        
        else{
        NearbyRequirementsJPanel panel = new NearbyRequirementsJPanel(userProcessContainer,userAccount, organization,enterprise);
        userProcessContainer.add("NearbyRequirementsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        }
    }//GEN-LAST:event_btnShowNearbyRequirementsActionPerformed

    private void btnAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailsActionPerformed
        
        AddDonorDetailsJPanel panel = new AddDonorDetailsJPanel(userProcessContainer,userAccount, organization,enterprise);
        userProcessContainer.add("UpdateDonorJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddDetailsActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDetails;
    private javax.swing.JButton btnDonationHistory;
    private javax.swing.JButton btnNewDonation;
    private javax.swing.JButton btnShowNearbyRequirements;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel newRequirementsJLabel;
    private javax.swing.JLabel welcomeStringLabel;
    // End of variables declaration//GEN-END:variables
}
