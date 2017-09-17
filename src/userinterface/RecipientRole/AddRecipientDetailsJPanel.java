/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RecipientRole;

import userinterface.DonorRole.*;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import userinterface.AdministrativeRole.*;
import Business.People.Donor;
import Business.Organization.Organization;
import Business.Organization.RecipientOrganization;
import Business.People.Recipient;
import Business.UserAccount.UserAccount;
import Business.Utils.MyAddressVerifier;
import Business.Utils.MyIntegerVerifier;
import Business.Utils.MyNameVerifier;
import Business.Utils.MyPhoneNumberVerifier;
import Business.Utils.MyZipCodeVerifier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ankur
 */
public class AddRecipientDetailsJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private RecipientOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form CreateDonorJPanel
     */
    public AddRecipientDetailsJPanel(JPanel userProcessContainer, UserAccount account, RecipientOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        Recipient recipient= (Recipient) userAccount.getEmployee();
        
        //Donor donor = (Donor)userAccount.getEmployee();
        nameTxt.setText(recipient.getName());
        nameTxt.setEnabled(false);
        MyAddressVerifier myStringVerifier= new MyAddressVerifier();
        streetNameTxt.setInputVerifier(myStringVerifier);
        MyPhoneNumberVerifier myPhoneNumberVerifier= new MyPhoneNumberVerifier();
        phoneNumberTxt.setInputVerifier(myPhoneNumberVerifier);
        MyNameVerifier myNameVerifier= new MyNameVerifier();
        nameTxt.setInputVerifier(myNameVerifier);
        cityTxt.setInputVerifier(myNameVerifier);
        MyZipCodeVerifier myZipVerifier= new MyZipCodeVerifier();
        zipcodeTxt.setInputVerifier(myZipVerifier);
        MyIntegerVerifier myAgeVerifier= new MyIntegerVerifier();
        ageTxt.setInputVerifier(myAgeVerifier);
        annualIncomeTxt.setInputVerifier(myAgeVerifier);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        phoneNumberTxt = new javax.swing.JTextField();
        streetNameTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        btnCreateDonor = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        zipcodeTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        annualIncomeTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("Name");

        jLabel3.setText("Phone Number");

        jLabel4.setText("Street Name");

        jLabel5.setText("Age");

        btnCreateDonor.setText("Add Details");
        btnCreateDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDonorActionPerformed(evt);
            }
        });

        btnBack.setText("<<  Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel7.setText("City");

        jLabel6.setText("Zip/ Postal Code");

        jLabel8.setText("Family Annual Income");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Recipient Registration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ageTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(zipcodeTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(streetNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annualIncomeTxt))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnBack)
                        .addGap(87, 87, 87)
                        .addComponent(btnCreateDonor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel9)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(streetNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(zipcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(annualIncomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateDonor)
                    .addComponent(btnBack))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDonorActionPerformed
      // String name = nameTxt.getText();
       String phoneNumer= phoneNumberTxt.getText();
       String address= streetNameTxt.getText();
       String age= ageTxt.getText();
       
       if(nameTxt.getText().trim().length()==0
               ||phoneNumberTxt.getText().trim().length()==0
               || streetNameTxt.getText().trim().length()==0
               || cityTxt.getText().trim().length()==0
               || zipcodeTxt.getText().trim().length()==0
               || ageTxt.getText().trim().length()==0
               || annualIncomeTxt.getText().trim().length()==0)
       {
           JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
       }
       
       
       //Donor donor = new Donor();
       //Donor donor = (Donor)userAccount.getEmployee();
       Recipient recipient= (Recipient) userAccount.getEmployee();
       //organization.getPersonDirectory().getPersonList().add(donor);
       //donor.setName(name);
       //recipient.setName(name);
       recipient.setPhoneNumber(phoneNumer);
       recipient.setStreetName(address);
       recipient.setCity(cityTxt.getText());
       recipient.setZipcode(zipcodeTxt.getText());
       recipient.setFamilyIncome(annualIncomeTxt.getText());
       recipient.setAge(age);
       
       JOptionPane.showMessageDialog(null, "Details added successfully!!");
       
       phoneNumberTxt.setText("");
       streetNameTxt.setText("");
       cityTxt.setText("");
       zipcodeTxt.setText("");
       annualIncomeTxt.setText("");
       ageTxt.setText("");
    }//GEN-LAST:event_btnCreateDonorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField annualIncomeTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateDonor;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JTextField streetNameTxt;
    private javax.swing.JTextField zipcodeTxt;
    // End of variables declaration//GEN-END:variables
}