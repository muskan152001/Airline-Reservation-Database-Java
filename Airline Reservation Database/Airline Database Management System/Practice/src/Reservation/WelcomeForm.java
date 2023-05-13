/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reservation;

import javax.swing.JFrame;

/**
 *
 * @author Silence
 */
public class WelcomeForm extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeForm
     */
    public WelcomeForm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookticketBtn = new javax.swing.JButton();
        ticketcancle = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        loginpageBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setText("Welcome To Airline Ticket Booking System ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        bookticketBtn.setBackground(new java.awt.Color(245, 235, 118));
        bookticketBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bookticketBtn.setForeground(new java.awt.Color(51, 51, 0));
        bookticketBtn.setText("Book Ticket");
        bookticketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookticketBtnActionPerformed(evt);
            }
        });
        jPanel1.add(bookticketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 150, 40));

        ticketcancle.setBackground(new java.awt.Color(245, 235, 118));
        ticketcancle.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ticketcancle.setForeground(new java.awt.Color(51, 51, 0));
        ticketcancle.setText("Ticket Cancel");
        ticketcancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketcancleActionPerformed(evt);
            }
        });
        jPanel1.add(ticketcancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 150, 40));

        exitBtn.setBackground(new java.awt.Color(245, 235, 118));
        exitBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 150, 40));

        loginpageBtn.setBackground(new java.awt.Color(245, 235, 118));
        loginpageBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        loginpageBtn.setForeground(new java.awt.Color(51, 51, 0));
        loginpageBtn.setText("Login Page");
        loginpageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginpageBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginpageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 150, 40));

        searchBtn.setBackground(new java.awt.Color(245, 235, 118));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(51, 51, 0));
        searchBtn.setText("Search Flights");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 150, 40));

        jLabel2.setBackground(new java.awt.Color(245, 235, 118));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reservation/Airplane.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 748));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginpageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginpageBtnActionPerformed
        new LoginForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_loginpageBtnActionPerformed

    private void bookticketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookticketBtnActionPerformed
        new BookTicketForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bookticketBtnActionPerformed

    private void ticketcancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketcancleActionPerformed
        new TicketCancleForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ticketcancleActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        new SearchFlightsForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookticketBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginpageBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton ticketcancle;
    // End of variables declaration//GEN-END:variables
}
