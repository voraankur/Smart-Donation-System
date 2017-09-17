/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Organization.AppliancesOrganization;
import Business.Organization.ClothesOrganization;
import Business.Organization.DonorOrganization;
import Business.Organization.MiscOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.RecipientOrganization;
import Business.People.Donor;
import Business.People.Person;
import Business.People.Recipient;
import Business.Product.Product;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Ankur
 */
public class AnalysisJPanel extends javax.swing.JPanel {
    
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    /**
     * Creates new form AnalysisJPanel
     */
    public AnalysisJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        
    }
    
    private void findMostRequestedProduct(){
        for (Organization org: organizationDir.getOrganizationList()){
            for(WorkRequest request: org.getWorkQueue().getWorkRequestList()){
                
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        donorTable = new javax.swing.JTable();
        btnReport = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        recipientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        requirementsJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        donatedItemsJLabel = new javax.swing.JLabel();
        btnBarChartDonors = new javax.swing.JButton();
        btnBarChartRecipients = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        eachDonatedTypeJTable = new javax.swing.JTable();
        btnForEachType = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPieChart = new javax.swing.JButton();

        btnBack.setText("<<  Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        donorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Donor", "No of items donated"
            }
        ));
        jScrollPane1.setViewportView(donorTable);

        btnReport.setText("Show");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        recipientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Recipient", "Number of needs"
            }
        ));
        jScrollPane2.setViewportView(recipientTable);

        jLabel1.setText("Total Number of Requirements");

        jLabel2.setText("Total items donated");

        btnBarChartDonors.setText("Bar Chart");
        btnBarChartDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarChartDonorsActionPerformed(evt);
            }
        });

        btnBarChartRecipients.setText("Bar Chart");
        btnBarChartRecipients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarChartRecipientsActionPerformed(evt);
            }
        });

        eachDonatedTypeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Appliances Donated", "Clothes Donated", "Other items Donated"
            }
        ));
        jScrollPane3.setViewportView(eachDonatedTypeJTable);

        btnForEachType.setText("Bar Chart");
        btnForEachType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForEachTypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Donor Table");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Department Wise Donation");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Recipient Table");

        btnPieChart.setText("Pie Chart");
        btnPieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPieChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(79, 79, 79)
                                .addComponent(btnReport))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(85, 85, 85)
                                .addComponent(donatedItemsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBarChartRecipients)
                                    .addComponent(btnForEachType)
                                    .addComponent(btnBarChartDonors)
                                    .addComponent(btnPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(requirementsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnBarChartDonors))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnReport)))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(donatedItemsJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnForEachType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPieChart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnBarChartRecipients))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(requirementsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnBack)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateTable(){
        
        Organization org=null;
        Organization org1=null;
        
        for (Organization organization : organizationDir.getOrganizationList()){
            if(organization instanceof DonorOrganization){
                org=organization;
            }
            if(organization instanceof RecipientOrganization){
                org1=organization;
            }
        }
        
        DefaultTableModel dtm = (DefaultTableModel) donorTable.getModel();
        dtm.setRowCount(0);
        int totalDonation=0;
        for(Person person: org.getPersonDirectory().getPersonList())
        {
            if(person instanceof Donor){
                Donor donor = (Donor)person;
                Object[] row= new Object[2];
                row[0]=donor.getName();
                row[1]=donor.getDonationList().getProductList().size();
                totalDonation=totalDonation+donor.getDonationList().getProductList().size();
                dtm.addRow(row);
            }
        }
        donatedItemsJLabel.setText(String.valueOf(totalDonation));
        
        DefaultTableModel dtm1 = (DefaultTableModel) recipientTable.getModel();
        dtm1.setRowCount(0);
        int total=0;
        for(Person person: org1.getPersonDirectory().getPersonList())
        {
            if(person instanceof Recipient){
                Recipient recipient = (Recipient)person;
                Object[] row= new Object[2];
                row[0]=recipient.getName();
                row[1]=recipient.getRequirementList().getRequirementList().size();
                total=total+recipient.getRequirementList().getRequirementList().size();
                //row[2]= total;
                dtm1.addRow(row);
            }
        }
        requirementsJLabel.setText(String.valueOf(total));
    }
    
    private void populateEachTypesTable(){
        DefaultTableModel dtm = (DefaultTableModel) eachDonatedTypeJTable.getModel();
        dtm.setRowCount(0);
        
        Organization org = null;
        Organization org1= null;
        Organization org2= null;
        int countAppliances = 0;
        int countClothes = 0;
        int countMisc = 0;
                   for (Organization organization : organizationDir.getOrganizationList()) {
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
        for(Product product: org.getDonationList().getProductList()){
            countAppliances=countAppliances+1;
        }
        for(Product product: org1.getDonationList().getProductList()){
            countClothes=countClothes+1;
        }
        for(Product product: org2.getDonationList().getProductList()){
            countMisc=countMisc+1;
        }
        Object[] row= new Object[3];
        row[0]=countAppliances;
        row[1]=countClothes;
        row[2]=countMisc;
        dtm.addRow(row);
    }
    
    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        populateTable();
        populateEachTypesTable();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnBarChartDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarChartDonorsActionPerformed
        Organization org=null;
        Organization org1=null;
        
        for (Organization organization : organizationDir.getOrganizationList()){
            if(organization instanceof DonorOrganization){
                org=organization;
            }
            if(organization instanceof RecipientOrganization){
                org1=organization;
            }
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Person person: org.getPersonDirectory().getPersonList())
        {
            if(person instanceof Donor){
                Donor donor = (Donor)person;
                
                dataset.setValue(donor.getDonationList().getProductList().size(), 
                        "Donated items", donor.getName());
            }
        }
        JFreeChart chart= ChartFactory.createBarChart3D("Donor Statistics", "Donor Names", "Number of donated items", dataset, PlotOrientation.VERTICAL, false, true, false);
        
        chart.setBackgroundPaint(Color.CYAN);
        chart.getTitle().setPaint(Color.RED);
        
        CategoryPlot p= chart.getCategoryPlot();
        
        p.setRangeGridlinePaint(Color.BLUE);
        
        ChartFrame frame = new ChartFrame("Bar chart for Donors", chart);
        frame.setVisible(true);
        frame.setSize(450,350);
    }//GEN-LAST:event_btnBarChartDonorsActionPerformed

    private void btnBarChartRecipientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarChartRecipientsActionPerformed
        Organization org=null;
        Organization org1=null;
        
        for (Organization organization : organizationDir.getOrganizationList()){
            if(organization instanceof DonorOrganization){
                org=organization;
            }
            if(organization instanceof RecipientOrganization){
                org1=organization;
            }
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(Person person: org1.getPersonDirectory().getPersonList())
        {
            if(person instanceof Recipient){
                Recipient recipient = (Recipient)person;
                
                dataset.setValue(recipient.getRequirementList().getRequirementList().size(), 
                        "Requirements", recipient.getName());
            }
        }
        JFreeChart chart= ChartFactory.createBarChart("Recipients Statistics", "Recipients Names", "Number of requirements", dataset, PlotOrientation.VERTICAL, false, true, false);
        
        CategoryPlot p= chart.getCategoryPlot();
        
        p.setRangeGridlinePaint(Color.RED);
        
        ChartFrame frame = new ChartFrame("Bar chart for Recipients", chart);
        frame.setVisible(true);
        frame.setSize(450,350);
    }//GEN-LAST:event_btnBarChartRecipientsActionPerformed

    private void btnForEachTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForEachTypeActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        Organization org = null;
        Organization org1= null;
        Organization org2= null;
        int countAppliances = 0;
        int countClothes = 0;
        int countMisc = 0;
                   for (Organization organization : organizationDir.getOrganizationList()) {
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
        for(Product product: org.getDonationList().getProductList()){
            countAppliances=countAppliances+1;
        }
        for(Product product: org1.getDonationList().getProductList()){
            countClothes=countClothes+1;
        }
        for(Product product: org2.getDonationList().getProductList()){
            countMisc=countMisc+1;
        }
        
        dataset.setValue(countAppliances, "Donation", "Appliances");
        dataset.setValue(countClothes, "Donation", "Clothes");
        dataset.setValue(countMisc, "Donation", "Other items");
        
        JFreeChart chart= ChartFactory.createBarChart3D("Donation Statistics", "Department", "Number of donations", dataset, PlotOrientation.VERTICAL, false, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.BLUE);
        
        CategoryPlot p= chart.getCategoryPlot();
        
        p.setRangeGridlinePaint(Color.RED);
        
        ChartFrame frame = new ChartFrame("Bar chart for Department wise Donation", chart);
        frame.setVisible(true);
        frame.setSize(450,350);
    }//GEN-LAST:event_btnForEachTypeActionPerformed

    private void btnPieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPieChartActionPerformed
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        Organization org = null;
        Organization org1= null;
        Organization org2= null;
        int countAppliances = 0;
        int countClothes = 0;
        int countMisc = 0;
                   for (Organization organization : organizationDir.getOrganizationList()) {
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
        for(Product product: org.getDonationList().getProductList()){
            countAppliances=countAppliances+1;
        }
        for(Product product: org1.getDonationList().getProductList()){
            countClothes=countClothes+1;
        }
        for(Product product: org2.getDonationList().getProductList()){
            countMisc=countMisc+1;
        }
        
        pieDataset.setValue("Appliances", countAppliances);
        pieDataset.setValue("Clothes",countClothes);
        pieDataset.setValue("Other items", countMisc);
        
        JFreeChart chart= ChartFactory.createPieChart3D("Pie Chart for Donation Statistics", pieDataset, true, true, true );
        
        PiePlot3D p= (PiePlot3D)chart.getPlot();
        //p.setForegroundAlpha(TOP_ALIGNMENT);
        
        ChartFrame frame = new ChartFrame("3D Pie chart for Department wise Donation", chart);
        frame.setVisible(true);
        frame.setSize(450,500);
        try{
            final ChartRenderingInfo info= new ChartRenderingInfo(new StandardEntityCollection());
            final File file1=new File("DonationByDepartment.jpeg");
            ChartUtilities.saveChartAsJPEG(file1, chart, 600, 400, info);
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_btnPieChartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBarChartDonors;
    private javax.swing.JButton btnBarChartRecipients;
    private javax.swing.JButton btnForEachType;
    private javax.swing.JButton btnPieChart;
    private javax.swing.JButton btnReport;
    private javax.swing.JLabel donatedItemsJLabel;
    private javax.swing.JTable donorTable;
    private javax.swing.JTable eachDonatedTypeJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable recipientTable;
    private javax.swing.JLabel requirementsJLabel;
    // End of variables declaration//GEN-END:variables
}