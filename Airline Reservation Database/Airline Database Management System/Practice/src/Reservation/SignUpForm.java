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
 * @author Silence
 */
public class SignUpForm extends javax.swing.JFrame {

    /**
     * Creates new form SignUpForm
     */
    Connection con ;
    PreparedStatement pst;
    ResultSet res;
    static int contact_id=0;
    public SignUpForm() {
        initComponents();
        con = DBConnector.ConnectDb();
        setExtendedState(JFrame.MAXIMIZED_BOTH);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signupPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cell = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        repassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signupPanel.setPreferredSize(new java.awt.Dimension(1366, 748));
        signupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign up Form");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signupPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 270, -1));

        username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupPanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 170, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Username");
        signupPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 120, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Email Address");
        signupPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 120, 40));

        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        signupPanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 170, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Cell");
        signupPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 120, 40));

        cell.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupPanel.add(cell, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 170, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Address");
        signupPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 120, 40));

        address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupPanel.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 170, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Password");
        signupPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 120, 40));

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupPanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 170, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Re-type Password");
        signupPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, 40));

        repassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupPanel.add(repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 170, 40));

        jButton1.setBackground(new java.awt.Color(245, 235, 118));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jButton1.setText("Create ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        signupPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 140, 35));

        jButton3.setBackground(new java.awt.Color(245, 235, 118));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        signupPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 140, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reservation/Airplane.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        signupPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));
        jLabel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(signupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            
           
            if( username.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Name Field is null");
            }
            
            else if(password.getText().equals("") || repassword.getText().equals("") ){
                JOptionPane.showMessageDialog(this, "Password Field is null");
            }
            else if(!(repassword.getText().equals(password.getText()))){
                    JOptionPane.showMessageDialog(this, "Password didnot match");
            }
            else{
                
                String contact ="Insert into contacts (email, cell, address)values(?,?,?)";
                pst = con.prepareStatement(contact);
                pst.setString(1, email.getText());
                pst.setString(2, cell.getText()); 
                pst.setString(3, address.getText());
                pst.execute();
               
                contact = "select contact_id from contacts where email=? and cell=? and address=?";
                pst = con.prepareStatement(contact);
                pst.setString(1, email.getText());
                pst.setString(2, cell.getText());
                pst.setString(3, address.getText());

                res = pst.executeQuery();
                if (res.next()) {
                    contact_id = res.getInt(1);
                }  
                              
                String login ="Insert into login  (contact_id, username, pass)values(?,?,?)";
                 pst=con.prepareStatement(login);
                pst.setInt(1, contact_id);
                pst.setString(2, username.getText());
                pst.setString(3, password.getText()); 
                pst.execute();
                  
                
                JOptionPane.showMessageDialog(null, "Contact ID : " + contact_id);
            }
        }catch (SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Username Already registor choose another");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LoginForm().setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField cell;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
