/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliners;

import Buisness.AirlineDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Harshitha
 */
public class TravelWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TravelWorkAreaJPanel
     */
     JPanel userProcessContainer;
     AirlineDirectory airlineDir;
     JSplitPane leftJPanel;
    public TravelWorkAreaJPanel(JPanel userProcessContainer,AirlineDirectory airlineDir,JSplitPane leftJPanel) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.airlineDir=airlineDir;
        this.leftJPanel=leftJPanel;
        
        
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
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Travel Agency Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 33, -1, -1));

        jButton1.setText("Manage Airlines>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 165, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         ManageAirlinersJPanel panel = new ManageAirlinersJPanel(userProcessContainer, airlineDir,leftJPanel);
        userProcessContainer.add("ManageSupplierAdministrative", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
