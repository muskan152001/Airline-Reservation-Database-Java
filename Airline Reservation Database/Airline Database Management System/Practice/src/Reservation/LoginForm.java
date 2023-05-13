package Reservation;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    static String usernameStr = null;
    public LoginForm() {
        initComponents();
        con = DBConnector.ConnectDb();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginsystemLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        forgotpasswordBtn = new javax.swing.JButton();
        passwordTxt = new javax.swing.JPasswordField();
        showpasswordCb = new javax.swing.JCheckBox();
        usernameLbl1 = new javax.swing.JLabel();
        roll_id = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 748));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginsystemLbl.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        loginsystemLbl.setText("Login Page");
        jPanel1.add(loginsystemLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 200, -1));

        usernameLbl.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        usernameLbl.setText("Username");
        usernameLbl.setToolTipText("");
        jPanel1.add(usernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 130, 40));

        usernameTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameTxt.setToolTipText("");
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 204, 40));

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        passwordLbl.setText("Password");
        passwordLbl.setToolTipText("");
        jPanel1.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 130, 40));

        loginBtn.setBackground(new java.awt.Color(245, 235, 118));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setToolTipText("");
        loginBtn.setAlignmentX(0.5F);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 105, 40));

        signupBtn.setBackground(new java.awt.Color(245, 235, 118));
        signupBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        signupBtn.setText("Sign up");
        signupBtn.setToolTipText("");
        signupBtn.setAlignmentX(0.5F);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 105, 40));

        forgotpasswordBtn.setBackground(new java.awt.Color(245, 235, 118));
        forgotpasswordBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        forgotpasswordBtn.setText("Forgot Password");
        forgotpasswordBtn.setToolTipText("");
        forgotpasswordBtn.setAlignmentX(0.5F);
        forgotpasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpasswordBtnActionPerformed(evt);
            }
        });
        jPanel1.add(forgotpasswordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, -1, 40));

        passwordTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordTxt.setToolTipText("");
        passwordTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 204, 40));

        showpasswordCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showpasswordCb.setText("Show password");
        showpasswordCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordCbActionPerformed(evt);
            }
        });
        jPanel1.add(showpasswordCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, -1, 20));

        usernameLbl1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        usernameLbl1.setText("Role ID");
        usernameLbl1.setToolTipText("");
        jPanel1.add(usernameLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 130, 40));

        roll_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        roll_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Administrator" }));
        roll_id.setName(""); // NOI18N
        jPanel1.add(roll_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reservation/Airplane.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String login = "select * from login where username=? and pass=? and role_id=?";
        try {
            usernameStr = usernameTxt.getText();
            
            pst = con.prepareStatement(login);
            pst.setString(1, usernameTxt.getText());
            pst.setString(2, passwordTxt.getText());
            pst.setString(3, roll_id.getSelectedItem().toString());
            rs = pst.executeQuery();
            if (rs.next()) {
                rs.close();
                pst.close();
                if (roll_id.getSelectedItem().toString().equals("Administrator")) {
                    setVisible(false);
                    new AddminstatorHomeForm().setVisible(true);
                } else {
                    setVisible(false);
                    new WelcomeForm().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect User Data");
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SignUpForm().setVisible(true);
    }//GEN-LAST:event_signupBtnActionPerformed

    private void forgotpasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpasswordBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgotPasswordForm().setVisible(true);
    }//GEN-LAST:event_forgotpasswordBtnActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void showpasswordCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordCbActionPerformed
        if (showpasswordCb.isSelected()) {
            passwordTxt.setEchoChar((char) 0);
        } else {
            passwordTxt.setEchoChar('*');
        }
    }//GEN-LAST:event_showpasswordCbActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotpasswordBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginsystemLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JComboBox<String> roll_id;
    private javax.swing.JCheckBox showpasswordCb;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JLabel usernameLbl1;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
