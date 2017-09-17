/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Verification;

import Business.Enterprise.Enterprise;
import Business.Organization.UserVerificationOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationTestWorkRequest;
import Business.WorkQueue.VerificationTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankur
 */
public class UserVerificationPersonWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private UserVerificationOrganization organization;
    /**
     * Creates new form UserVerificationJPanel
     */
    public UserVerificationPersonWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, UserVerificationOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateVerificationRequestTable();
    }
    
    public void populateVerificationRequestTable(){
        DefaultTableModel model = (DefaultTableModel) verificationJTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request.getProduct();
            row[1] = request.getRequestor().getEmployee().getName();
            row[2] = request.getMessage();
            row[3] = request.getStatus();
            row[4] = request;
            row[5] = request.getReceiver();
             
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        verificationJTable = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        verificationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Requestor", "Message", "Status", "Request Date", "Receiver"
            }
        ));
        jScrollPane1.setViewportView(verificationJTable);

        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("User Verification Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssignToMe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcess))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignToMe)
                    .addComponent(btnProcess))
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        int selectedRow = verificationJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        WorkRequest request = (WorkRequest)verificationJTable.getValueAt(selectedRow, 4);
        
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(null, "This work request is already approved by Department Head");
            return;
        }
        
        if(request.getReceiver()!=null){
            JOptionPane.showMessageDialog(null, "This work request is already assigned");
            return;
        }
        
        
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateVerificationRequestTable();
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int selectedRow = verificationJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        DonationTestWorkRequest request= (DonationTestWorkRequest)verificationJTable.getValueAt(selectedRow, 4);
        
        if(request.getReceiver()==null){
            JOptionPane.showMessageDialog(null, "Noone has picked up this request. Please assign it to yourself before processing!!");
            return;
        }
        
        if(request.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null, "This request is already completed");
            return;
        }
        
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(null, "This work request is already approved by Department Head");
            return;
        }
        
        request.setStatus("Processing");
        
        ProcessWorkRequest1JPanel processWorkRequestJPanel = new ProcessWorkRequest1JPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable verificationJTable;
    // End of variables declaration//GEN-END:variables
}