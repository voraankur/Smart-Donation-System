/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AppliancesDeptHeadRole;

import Business.Enterprise.Enterprise;
import Business.Organization.AppliancesOrganization;
import Business.Organization.Organization;
import Business.Organization.UserVerificationOrganization;
import Business.People.Recipient;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationTestWorkRequest;
import Business.WorkQueue.VerificationTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankur
 */
public class RequestedAppliancesJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AppliancesOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form RequestedAppliancesJPanel
     */
    public RequestedAppliancesJPanel(JPanel userProcessContainer, UserAccount account, AppliancesOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateRequestedAppliancesTable();
    }

    private void populateRequestedAppliancesTable() {
        DefaultTableModel model = (DefaultTableModel) requestedAppliancesJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[7];
            row[0] = request.getProduct().getProductID();
            row[1] = request.getProduct();
            row[2] = request.getProduct().getDonor().getName();
            row[3] = request.getRequestor().getEmployee().getName();
            row[4] = request.getStatus();
            row[5] = request;
            row[6] = request.getMessage();

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
        requestedAppliancesJTable = new javax.swing.JTable();
        btnApproveRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRequestVerification = new javax.swing.JButton();
        btnRejectRequest = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        requestedAppliancesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tracking ID", "Product", "Donor", "Requestor", "Status", "Requested Date", "Message"
            }
        ));
        jScrollPane1.setViewportView(requestedAppliancesJTable);

        btnApproveRequest.setText("Approve Request");
        btnApproveRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveRequestActionPerformed(evt);
            }
        });

        btnBack.setText("<<  Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRequestVerification.setText("Request Verification");
        btnRequestVerification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestVerificationActionPerformed(evt);
            }
        });

        btnRejectRequest.setText("Reject Request");
        btnRejectRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectRequestActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Requested Appliances");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRequestVerification)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRejectRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnApproveRequest))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnApproveRequest)
                            .addComponent(btnRequestVerification))
                        .addGap(18, 18, 18)
                        .addComponent(btnRejectRequest)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveRequestActionPerformed
        int selectedRow = requestedAppliancesJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        // Product product = (Product)requestedAppliancesJTable.getValueAt(selectedRow, 0);
        DonationTestWorkRequest request = (DonationTestWorkRequest) requestedAppliancesJTable.getValueAt(selectedRow, 5);
        if(request.getStatus().equals("Rejected")){
            JOptionPane.showMessageDialog(null, "Item is already rejected.");
        } else if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(null, "Item is already approved");
        } else if (!request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "Verification not completed yet");
            return;
        } else {
            //request.setReceiver(userAccount);
            request.setStatus("Approved");

            Product product = (Product) requestedAppliancesJTable.getValueAt(selectedRow, 1);
            product.setProductStatus("Approved");
            product.setIsDonated("Yes");
            product.setRecipient((Recipient) request.getRequestor().getEmployee());
            Recipient recipient = (Recipient) request.getRequestor().getEmployee();
            recipient.getDonationList().getProductList().add(product);
            populateRequestedAppliancesTable();
        }
    }//GEN-LAST:event_btnApproveRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRequestVerificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestVerificationActionPerformed
        int selectedRow = requestedAppliancesJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        

        DonationTestWorkRequest request = (DonationTestWorkRequest) requestedAppliancesJTable.getValueAt(selectedRow, 5);
        //WorkRequest request= (WorkRequest)requestedAppliancesJTable.getValueAt(selectedRow, 5);
        
        if(request.getStatus().equals("Rejected")){
            JOptionPane.showMessageDialog(null, "Item is already rejected.");
            return;
        }
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(null, "Item is already approved");
            return;
        }
        if(request.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null, "User verification already completed");
            return;
        }
        
        UserAccount requestor = request.getRequestor();

        Product product = (Product) requestedAppliancesJTable.getValueAt(selectedRow, 1);

//        organization.getWorkQueue().getWorkRequestList().remove(request);

        //Product product = (Product)requestedAppliancesJTable.getValueAt(selectedRow, 0);
        //VerificationTestWorkRequest verifyRequest = new VerificationTestWorkRequest();

        //organization.getWorkQueue().getWorkRequestList().add(request);
        request.setProduct(product);
        //request.setRequestor(requestor);
        request.setStatus("Sent for Verification");
        request.setRequestDate(new Date());

        populateRequestedAppliancesTable();

        //verifyRequest.setRequestDate(new Date());
        //verifyRequest.setRequestor(requestor);
        //verifyRequest.setStatus("User Background Verification");
        //verifyRequest.setProduct(product);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof UserVerificationOrganization) {
                org = organization;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_btnRequestVerificationActionPerformed

    private void btnRejectRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectRequestActionPerformed
        int selectedRow = requestedAppliancesJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        // Product product = (Product)requestedAppliancesJTable.getValueAt(selectedRow, 0);
        //WorkRequest request= (WorkRequest)requestedAppliancesJTable.getValueAt(selectedRow, 5);
        //DonationTestWorkRequest request = null;
        
        DonationTestWorkRequest request = (DonationTestWorkRequest) requestedAppliancesJTable.getValueAt(selectedRow, 5);
        

//        DonationTestWorkRequest request = (DonationTestWorkRequest)requestedAppliancesJTable.getValueAt(selectedRow, 5);
        if(request.getStatus().equals("Rejected")){
            JOptionPane.showMessageDialog(null, "Item is already rejected.");
        } else if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(null, "Item is already approved");
        } else if (!request.getStatus().equals("Completed")) {
            JOptionPane.showMessageDialog(null, "Verification not completed yet");
            //return;
        } else {
            //request.setReceiver(userAccount);
            request.setStatus("Rejected");

            Product product = (Product) requestedAppliancesJTable.getValueAt(selectedRow, 1);
        product.setProductStatus("Rejected");
        product.setIsDonated("No");
            //product.setRecipient((Recipient)request.getRequestor().getEmployee());
            //Recipient recipient= (Recipient) request.getRequestor().getEmployee();
            //recipient.getDonationList().getProductList().add(product);
            populateRequestedAppliancesTable();
        }
    }//GEN-LAST:event_btnRejectRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveRequest;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRejectRequest;
    private javax.swing.JButton btnRequestVerification;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestedAppliancesJTable;
    // End of variables declaration//GEN-END:variables
}