/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reservation;

import static Reservation.LoginForm.usernameStr;
import static Reservation.SignUpForm.contact_id;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Silence
 */
public class BookTicketForm extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet res;

    static int totalamount = 0;

    /**
     * Creates new form BookTicketForm
     */
    public BookTicketForm() {
        initComponents();
        con = DBConnector.ConnectDb();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        departuretimeTxt = new javax.swing.JTextField();
        classTxt = new javax.swing.JComboBox<>();
        dateTxt = new com.toedter.calendar.JDateChooser();
        ticket = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        arrivaltimeTxt = new javax.swing.JTextField();
        flightidTxt = new javax.swing.JTextField();
        homeBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        destinationTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sourceTxt = new javax.swing.JTextField();
        searchflightsBtn = new javax.swing.JButton();
        bookticketsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchflightsBtn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        departuretimeTxt.setEditable(false);
        departuretimeTxt.setBackground(new java.awt.Color(255, 255, 255));
        departuretimeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(departuretimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 300, 170, 40));

        classTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        classTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First class", "Business class", "Economy class" }));
        jPanel2.add(classTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 380, 170, 40));
        jPanel2.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 170, 40));

        ticket.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ticket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticket.setText("Class");
        jPanel2.add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Source");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Destination");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Customer name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, -1, -1));

        arrivaltimeTxt.setEditable(false);
        arrivaltimeTxt.setBackground(new java.awt.Color(255, 255, 255));
        arrivaltimeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        arrivaltimeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivaltimeTxtActionPerformed(evt);
            }
        });
        jPanel2.add(arrivaltimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, 170, 40));

        flightidTxt.setEditable(false);
        flightidTxt.setBackground(new java.awt.Color(255, 255, 255));
        flightidTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        flightidTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightidTxtActionPerformed(evt);
            }
        });
        jPanel2.add(flightidTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 170, 40));

        homeBtn.setBackground(new java.awt.Color(245, 235, 118));
        homeBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        homeBtn.setText("Paying");
        homeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 640, 150, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Arrival time");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, -1, 30));

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, 170, 40));

        destinationTxt.setEditable(false);
        destinationTxt.setBackground(new java.awt.Color(255, 255, 255));
        destinationTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(destinationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 170, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Flight ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Date");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Departure time");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, 32));

        sourceTxt.setEditable(false);
        sourceTxt.setBackground(new java.awt.Color(255, 255, 255));
        sourceTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(sourceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 170, 40));

        searchflightsBtn.setBackground(new java.awt.Color(245, 235, 118));
        searchflightsBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchflightsBtn.setText("Search Flights");
        searchflightsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchflightsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchflightsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchflightsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 640, 150, 40));

        bookticketsBtn.setBackground(new java.awt.Color(245, 235, 118));
        bookticketsBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bookticketsBtn.setText("Book Tickets");
        bookticketsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bookticketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookticketsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(bookticketsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 150, 40));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 50)); // NOI18N
        jLabel1.setText("Ticket Booking Form");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 80, -1, -1));

        searchflightsBtn2.setBackground(new java.awt.Color(245, 235, 118));
        searchflightsBtn2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchflightsBtn2.setText("Other Ticket");
        searchflightsBtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchflightsBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchflightsBtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(searchflightsBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reservation/Airplane.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));

        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookticketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookticketsBtnActionPerformed
        String contact=null;
        int price =0 ;
        try {
            if(contact_id==0){
                        
                contact = "select contact_id from  login where username='" + usernameStr + "'";
                
                pst = con.prepareStatement(contact);                
                res = pst.executeQuery();
                if (res.next()) {
                    contact_id = res.getInt(1);
                }
            }
            // Agr pehle exist krti ho to pehle exist wile return hogi
            System.out.println(contact_id);
                       
            
            String sql = """
                  select first_class, business_class, economy_class from charges 
                  where route_code = (select route_code from routes where source_=? and destination=?)""";

                pst = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                pst.setString(1, sourceTxt.getText());
                pst.setString(2, destinationTxt.getText());
                res = pst.executeQuery();
                if (res.next()) {
                    String item = classTxt.getSelectedItem().toString();
                    

                    switch (item) {
                        case "First class" -> {
                            price = res.getInt(1);
                            totalamount += res.getInt(1);
//                            JOptionPane.showMessageDialog(null, "Ticket price : " + res.getInt(1) + "\nBooking ID : " + bookingid);
                        }
                        case "Business class" -> {
                            price = res.getInt(2);
                            totalamount += res.getInt(2);
                        }
                        case "Economy class" -> {
                            price = res.getInt(3);

                            totalamount += res.getInt(3);

                        }
                        default -> {
                        }
                    }
                }
                int seatNo = 0;
                sql = "select seat_no from customer where flight_id =" + Integer.parseInt(flightidTxt.getText());
                pst = con.prepareStatement(sql);
                res = pst.executeQuery();
                while(res.next()){
                    seatNo = res.getInt(1);
                }
                
                seatNo++;

            int bookingid = 0;
            
            if (name.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill the Remaining Fields");
            } else {
              
                sql = "Insert into customer (flight_id, customer_name, contact_id, amount,  _source, destination,seat_no)values(?,?,?,?,?,?,?)";

                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(flightidTxt.getText()));
                pst.setString(2, name.getText());
                pst.setInt(3, contact_id);
                pst.setInt(4, price);
                pst.setString(5, sourceTxt.getText());
                pst.setString(6, destinationTxt.getText());
                pst.setInt(7, seatNo);
                
                
                pst.execute();
                
                sql = "Select booking_id from customer where flight_id=? and customer_name=? and contact_id=?  and  _source=? and destination=?";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(flightidTxt.getText()));
                pst.setString(2, name.getText());
                pst.setInt(3, contact_id);
                pst.setString(4, sourceTxt.getText());
                pst.setString(5, destinationTxt.getText());
                res = pst.executeQuery();
                if (res.next()) {
                    bookingid = res.getInt(1);
                }

            }
            JOptionPane.showMessageDialog(null, "Ticket price : " + price + "\nBooking ID : " + bookingid + "\nSeat No : " + seatNo);


        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Fill the Remaining Fields");
        } catch (SQLException | ClassCastException  ex) {
            JOptionPane.showMessageDialog(null, ex );
        }

    }//GEN-LAST:event_bookticketsBtnActionPerformed

    private void searchflightsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchflightsBtnActionPerformed
        setVisible(false);
        new SearchFlightsForm().setVisible(true);
    }//GEN-LAST:event_searchflightsBtnActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        setVisible(false);
        new DebtCardForm().setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void flightidTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightidTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightidTxtActionPerformed

    private void arrivaltimeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivaltimeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrivaltimeTxtActionPerformed

    private void searchflightsBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchflightsBtn2ActionPerformed
        // TODO add your handling code here:
        name.setText(null);
        
    }//GEN-LAST:event_searchflightsBtn2ActionPerformed

    /**
     * @param args the command line arguments
     * @throws Reservation.BookTicketForm
     *
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
            java.util.logging.Logger.getLogger(BookTicketForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTicketForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField arrivaltimeTxt;
    private javax.swing.JButton bookticketsBtn;
    private javax.swing.JComboBox<String> classTxt;
    public com.toedter.calendar.JDateChooser dateTxt;
    public javax.swing.JTextField departuretimeTxt;
    public javax.swing.JTextField destinationTxt;
    public javax.swing.JTextField flightidTxt;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private transient volatile javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JButton searchflightsBtn;
    private javax.swing.JButton searchflightsBtn2;
    public javax.swing.JTextField sourceTxt;
    private javax.swing.JLabel ticket;
    // End of variables declaration//GEN-END:variables

}

class SeatException extends Exception {

    SeatException() {

    }

    @Override
    public String toString() {
        return "Seat can not be negative";
    }
}

class FieldsMatchException extends Exception {

    FieldsMatchException() {

    }

    @Override
    public String toString() {
        return "Source and destination can't be same";
    }
}
