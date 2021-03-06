/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliners;

import Buisness.AirlineDirectory;
import Buisness.Airlines;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harshitha
 */
public class ManageAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersJPanel
     */
   // private AirlinerDirectory airlinerdirectory;
    
    private JTextField tfield;
    JPanel userProcessContainer;
   
    JSplitPane leftJPanel;
    
   
     AirlineDirectory airlineDir;

    public ManageAirlinersJPanel(JPanel userProcessContainer,AirlineDirectory airlineDir) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.airlineDir=airlineDir;
      //  this.leftJPanel=leftJPanel;
//         SearchAirlinePanel sfp = new SearchAirlinePanel(userProcessContainer,airlineDir,leftJPanel);
//     leftJPanel.setLeftComponent(sfp);
//     leftJPanel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        backjButton2 = new javax.swing.JButton();
        removejButton1 = new javax.swing.JButton();
        viewjButton2 = new javax.swing.JButton();
        addsupplierjButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        supplierTable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AIRLINER NAMES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierTable);

        backjButton2.setBackground(new java.awt.Color(255, 153, 102));
        backjButton2.setText("<<Back");
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });

        removejButton1.setBackground(new java.awt.Color(34, 167, 240));
        removejButton1.setText("Remove");
        removejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejButton1ActionPerformed(evt);
            }
        });

        viewjButton2.setBackground(new java.awt.Color(34, 167, 240));
        viewjButton2.setLabel("View Airliner");
        viewjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButton2ActionPerformed(evt);
            }
        });

        addsupplierjButton3.setBackground(new java.awt.Color(34, 167, 240));
        addsupplierjButton3.setLabel("Add Airliner");
        addsupplierjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsupplierjButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setText("MANAGE AIRLINES WORK AREA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 173, Short.MAX_VALUE)
                .addComponent(addsupplierjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(viewjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(removejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(backjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addsupplierjButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(backjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 16, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton2ActionPerformed

    private void removejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejButton1ActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(
            null,
            "Do you really want to delete?",
            "Delete Confirmation",
            JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION)
        {
        int row = supplierTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a Airline from the table to remove", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Airlines s = (Airlines)supplierTable.getValueAt(row, 0);
        airlineDir.removeSupplier(s);
        refreshTable();
    }//GEN-LAST:event_removejButton1ActionPerformed
    }
    private void viewjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButton2ActionPerformed
        // TODO add your handling code here:
        int row = supplierTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        Airlines s = (Airlines)supplierTable.getValueAt(row, 0);
        ViewAirlinerJPanel va = new ViewAirlinerJPanel(userProcessContainer, s);
        userProcessContainer.add("ViewAirlines", va);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
//        SearchFlightPanel sfp = new SearchFlightPanel();
//     leftJPanel.setLeftComponent(sfp);
//     leftJPanel.setVisible(true);

        
        
        
    }//GEN-LAST:event_viewjButton2ActionPerformed

    private void addsupplierjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsupplierjButton3ActionPerformed
        // TODO add your handling code here:

        //int i=1;
        CreateNewAirlinerJPanel createAirline = new CreateNewAirlinerJPanel(userProcessContainer, airlineDir);
        userProcessContainer.add("AddSupplier", createAirline);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
      
    }//GEN-LAST:event_addsupplierjButton3ActionPerformed

    public void refreshTable() {
        int rowCount = supplierTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)supplierTable.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            model.removeRow(i);
        }
        
        for(Airlines s : airlineDir.getAirLineDirtList()) {
            Object row[] = new Object[1];
            row[0] = s;
            model.addRow(row);
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addsupplierjButton3;
    private javax.swing.JButton backjButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removejButton1;
    private javax.swing.JTable supplierTable;
    private javax.swing.JButton viewjButton2;
    // End of variables declaration//GEN-END:variables
}
