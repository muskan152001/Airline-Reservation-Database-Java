/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reservation;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 */
/**
 *
 * @author Silence
 */
public class TicketCancleForm extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet res;

    /**
     * Creates new form AddFlights
     */
    public TicketCancleForm() {
        initComponents();
        con = DBConnector.ConnectDb();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateTxt = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        flight = new javax.swing.JTextField();
        booking = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        searcBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        T_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 748));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ticket Cancel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 63, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 264, 130, 35));

        dateTxt.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(976, 264, 160, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Flight ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 339, 130, 35));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Booking ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 264, 130, 35));

        flight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        flight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightActionPerformed(evt);
            }
        });
        jPanel1.add(flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 339, 160, 40));

        booking.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingActionPerformed(evt);
            }
        });
        jPanel1.add(booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 266, 160, 40));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setText("Price paid");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 130, 35));

        price.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 160, 40));

        deleteBtn.setBackground(new java.awt.Color(245, 235, 118));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 51, 51));
        deleteBtn.setText("Delete");
        deleteBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 631, 130, 35));

        searcBtn.setBackground(new java.awt.Color(245, 235, 118));
        searcBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        searcBtn.setForeground(new java.awt.Color(0, 51, 51));
        searcBtn.setText("Search");
        searcBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searcBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 166, -1, -1));

        jButton4.setBackground(new java.awt.Color(245, 235, 118));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("Exit");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 631, 130, 35));

        jButton5.setBackground(new java.awt.Color(245, 235, 118));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 51));
        jButton5.setText("Home");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 631, 130, 35));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setText("Customer name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 166, -1, 35));

        cname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 170, 160, 40));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Description");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 110, 40));

        description.setColumns(20);
        description.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 400, 340, 68));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Transaction ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 130, 35));

        T_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        T_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_idActionPerformed(evt);
            }
        });
        jPanel1.add(T_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 400, 160, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reservation/Airplane.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new WelcomeForm().setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    int TicketPrice =0;
    private void searcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcBtnActionPerformed
       
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date();
        System.out.println(sdf.format(date));
        dateTxt.setDate(date);
        String sql = "select amount from customer where booking_id=? and flight_id=? and customer_name=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt( booking.getText()));
            pst.setInt(2, Integer.parseInt(flight.getText()));
            pst.setString(3, cname.getText());
            res = pst.executeQuery();
            
            if (res.next()) {
                TicketPrice  = res.getInt(1);
                price.setText(""+TicketPrice);
            }
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_searcBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        
        try{
            String sql=null;
            
            sql = "Insert into cancel_ticket (flight_id, passenger_name, description) values(?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(flight.getText()));
            pst.setString(2, cname.getText());
            pst.setString(3, description.getText());
            pst.execute();
        
            
            int TID = Integer.parseInt(T_id.getText());
           // UPDATE transactions SET extra_charges = 500  , total_amount= total_amount-500 WHERE transaction_id = 23;
            int extra_charges = (int)(TicketPrice  * .1);
            sql = "UPDATE transactions SET extra_charges = "+ extra_charges +" , total_amount=" + (TicketPrice - extra_charges)  + " WHERE transaction_id =" + TID;
            
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            int return_amount = TicketPrice - extra_charges;
            
            sql = "delete from customer where booking_id = '" + booking.getText() + "'" ;
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showInternalMessageDialog(null, "Tickert cancel Success Fully \nRetrun Amount : " + return_amount );
        }catch(NumberFormatException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingActionPerformed

    private void flightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightActionPerformed

    private void T_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_idActionPerformed

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
            java.util.logging.Logger.getLogger(TicketCancleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketCancleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketCancleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketCancleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketCancleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T_id;
    private javax.swing.JTextField booking;
    private javax.swing.JTextField cname;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextArea description;
    private javax.swing.JTextField flight;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JButton searcBtn;
    // End of variables declaration//GEN-END:variables
}
