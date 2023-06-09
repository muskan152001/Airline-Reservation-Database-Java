/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reservation;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lachhman
 */
public class AddFlightForm extends javax.swing.JFrame {

    /**
     * Creates new form addFlightForm
     */
    Connection con;
    PreparedStatement pst;
    public AddFlightForm() {
        con = DBConnector.ConnectDb();
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        arrival_time = new javax.swing.JTextField();
        departure_time = new javax.swing.JTextField();
        route = new javax.swing.JTextField();
        craft = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setText("Add Flights Schedule");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 346, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Air craft ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 150, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 150, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Departure Time");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 150, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Arrival Time");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 150, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Route code");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 150, 40));

        date.setMinimumSize(null);
        date.setName(""); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 170, 40));

        arrival_time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        arrival_time.setName(""); // NOI18N
        arrival_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrival_timeActionPerformed(evt);
            }
        });
        jPanel1.add(arrival_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 170, 40));

        departure_time.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        departure_time.setName(""); // NOI18N
        jPanel1.add(departure_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 170, 40));

        route.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        route.setName(""); // NOI18N
        jPanel1.add(route, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 170, 40));

        craft.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JET-453", "JET-235", "JET-632" }));
        craft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                craftActionPerformed(evt);
            }
        });
        jPanel1.add(craft, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 170, 40));

        jButton1.setBackground(new java.awt.Color(245, 235, 118));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 120, 35));

        jButton2.setBackground(new java.awt.Color(245, 235, 118));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 120, 35));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reservation/Airplane.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void craftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_craftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_craftActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       try{
          
            
            String sql = "insert into flight_schedule (aircraft_id, date_, arrival_time, departure_time, route_code) values(?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            
            java.sql.Date Sdate = new java.sql.Date(date.getDate().getTime());    
            java.sql.Time time1 = java.sql.Time.valueOf(arrival_time.getText());
            java.sql.Time time2 = java.sql.Time.valueOf(departure_time.getText());
            
            pst.setString(1, craft.getSelectedItem().toString());
            pst.setDate(2, Sdate);
            pst.setTime(3, time1);
            pst.setTime(4, time2);
            pst.setString(5, route.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Success Fully");
            
       }
       catch(SQLIntegrityConstraintViolationException ex){
           JOptionPane.showMessageDialog(null, "Route Code does not add");
       } catch(NumberFormatException | SQLException ex){
           JOptionPane.showMessageDialog(null, ex);
       } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void arrival_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrival_timeActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_arrival_timeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new AddminstatorHomeForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlightForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrival_time;
    private javax.swing.JComboBox<String> craft;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField departure_time;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField route;
    // End of variables declaration//GEN-END:variables
}
