/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RecipientRole;

import Business.Enterprise.Enterprise;
import Business.Organization.AppliancesOrganization;
import Business.Organization.ClothesOrganization;
import Business.Organization.MiscOrganization;
import Business.Organization.Organization;
import Business.Organization.RecipientOrganization;
import Business.People.Recipient;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankur
 */
public class RequestProductJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ArrayList<Product> tempProductList;
    private RecipientOrganization organization;
    /**
     * Creates new form RequestProductJPanel
     */
    public RequestProductJPanel(JPanel userProcessContainer, UserAccount account,RecipientOrganization organization,Enterprise enterprise ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populateDonationTable();
        
    }
    
    private void checkIfAlreadyRequested(){
       
    }
    
    private void populateDonationTable(){
        DefaultTableModel dtm = (DefaultTableModel) donatedProductsJTable.getModel();
        dtm.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for(Product product: organization.getDonationList().getProductList()){
                if(product.getProductStatus().equals("Approved")){
                    product.setProductStatus("Donated");
                }
                if(!product.getProductStatus().equals("In-Process")){
                Object[] row= new Object[4];
                row[0] = product;
                row[1] = product.getProductDesc();
                row[2] = product.getProductType();
                row[3] = product.getIsDonated();
                dtm.addRow(row);
                }
            }
        }
        
        /*
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            
            row[0] = request.getProduct();
            row[1] = request.getProduct().getProductDesc();
            row[2] = request.getProduct().getProductType();
            row[3] = request;
            
            dtm.addRow(row);
            }
        }*/
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
        donatedProductsJTable = new javax.swing.JTable();
        btnRequestProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        donatedProductsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Description", "Product Type", "Status"
            }
        ));
        jScrollPane1.setViewportView(donatedProductsJTable);

        btnRequestProduct.setText("Request Product");
        btnRequestProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestProductActionPerformed(evt);
            }
        });

        btnBack.setText("<<  Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Request product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(185, 185, 185)
                        .addComponent(btnRequestProduct)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRequestProduct))
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRequestProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestProductActionPerformed
        int selectedRow = donatedProductsJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        Product product = (Product)donatedProductsJTable.getValueAt(selectedRow, 0);
        //DonationTestWorkRequest request = (DonationTestWorkRequest)donatedProductsJTable.getValueAt(selectedRow, 3);
       // WorkRequest request = (WorkRequest)donatedProductsJTable.getValueAt(selectedRow, 3);
        
        if(product.getIsDonated().equals("Yes"))
        {
            JOptionPane.showMessageDialog(null, "The product is already donated. "
                    + "Please select some other product");
            return;
        }
        else if(product.getProductStatus().equals("In-Process"))
        {
            JOptionPane.showMessageDialog(null, "The product is not recieved by respective department yet. "
                    + "Please come again later. We apologise for the inconvenience");
            return;
        }
        else{
        product.setProductStatus("Requested");
        DonationTestWorkRequest request= new DonationTestWorkRequest();
        
        request.setRequestDate(new Date());
        request.setRequestor(userAccount);
        request.setStatus("Requested");
        request.setProduct(product);
        
        Organization org = null;
        Organization org1= null;
        Organization org2= null;
                   for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                           if (organization instanceof AppliancesOrganization) {
                           org = organization;   
                       }
                        if (organization instanceof ClothesOrganization) {
                           org1 = organization;   
                       }
                        if (organization instanceof MiscOrganization) {
                           org2 = organization;   
                       }
                   }
        /*
        if(product.getProductType().equals("Appliances")){
            org.getWorkQueue().getWorkRequestList().add(request);
        }else if(product.getProductType().equals("Clothes")){
            org1.getWorkQueue().getWorkRequestList().add(request);
        }else if(product.getProductType().equals("Miscellaneous")){
            org2.getWorkQueue().getWorkRequestList().add(request);
        }           
        */
        
        
        if(request.getProduct().getProductType().equals("Appliances")){
            org.getWorkQueue().getWorkRequestList().add(request);
        } else if(request.getProduct().getProductType().equals("Clothes")){
            org1.getWorkQueue().getWorkRequestList().add(request);
        } else if(request.getProduct().getProductType().equals("Miscellaneous")){
            org2.getWorkQueue().getWorkRequestList().add(request);
        }
        
        checkIfAlreadyRequested();
        
        request.setStatus("Requested");
        
        populateDonationTable();
        
        Recipient r1= null;
        
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        JOptionPane.showMessageDialog(null, "Product requested is " +  request.getProduct() +"." +
                "We are working on your request. Thank you!!");
        }
    }//GEN-LAST:event_btnRequestProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestProduct;
    private javax.swing.JTable donatedProductsJTable;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
