/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RecipientRole;

import Business.Enterprise.Enterprise;
import Business.Organization.RecipientOrganization;
import Business.People.Recipient;
import Business.Product.Product;
import Business.Requirement.Requirement;
import Business.UserAccount.UserAccount;
import Business.Utils.MyProductDescVerifier;
import Business.Utils.MyProductVerifier;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankur
 */
public class RaiseANewNeedJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    //private ArrayList<Product> tempProductList;
    private RecipientOrganization organization;
    /**
     * Creates new form RaiseANewNeedJPanel
     */
    public RaiseANewNeedJPanel(JPanel userProcessContainer, UserAccount account,RecipientOrganization organization,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        Recipient recipient= (Recipient) userAccount.getEmployee();
        populateRequirementTable();
        MyProductVerifier myProdVerifier= new MyProductVerifier();
        reqTitleTxt.setInputVerifier(myProdVerifier);
        MyProductDescVerifier myProdDescVerifier= new MyProductDescVerifier();
        reqDescTxt.setInputVerifier(myProdDescVerifier);
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
        reqTitleTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reqDescTxt = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        requirementTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("Requirement Title");

        jLabel2.setText("Description");

        reqDescTxt.setColumns(20);
        reqDescTxt.setRows(5);
        jScrollPane1.setViewportView(reqDescTxt);

        btnBack.setText("<<  Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        requirementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Requirement", "Desc", "Status", "Donor"
            }
        ));
        jScrollPane2.setViewportView(requirementTable);
        if (requirementTable.getColumnModel().getColumnCount() > 0) {
            requirementTable.getColumnModel().getColumn(1).setMinWidth(300);
        }

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Raise a New Need");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(btnSubmit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reqTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(reqTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Recipient recipient= (Recipient) userAccount.getEmployee();
        
        String req= reqTitleTxt.getText();
        String reqD= reqDescTxt.getText();
        
        if(req.trim().length()==0 || reqD.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please fill the requirements");
            return;
        }
        
        Requirement requirement = new Requirement();
        
        requirement.setRequirementName(req);
        requirement.setRequirementDesc(reqD);
        requirement.setStatus("Pending");
        
        recipient.getRequirementList().getRequirementList().add(requirement);
        
        populateRequirementTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void populateRequirementTable(){
        
        Recipient recipient= (Recipient) userAccount.getEmployee();
        
        DefaultTableModel model = (DefaultTableModel) requirementTable.getModel();
        
        model.setRowCount(0);
        
        for(Requirement requirement: recipient.getRequirementList().getRequirementList()){
            Object[] row = new Object[4];
            row[0]= requirement.getRequirementName();
            row[1]= requirement.getRequirementDesc();
            row[2]= requirement.getStatus();
            row[3]= requirement.getDonor();
            model.addRow(row);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea reqDescTxt;
    private javax.swing.JTextField reqTitleTxt;
    private javax.swing.JTable requirementTable;
    // End of variables declaration//GEN-END:variables
}
