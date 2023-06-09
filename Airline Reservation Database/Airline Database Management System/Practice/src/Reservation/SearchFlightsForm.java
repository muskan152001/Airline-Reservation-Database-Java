/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reservation;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Silence
 */
public class SearchFlightsForm extends javax.swing.JFrame {

    /**
     * Creates new form SearchFLightsForm
     */
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    BookTicketForm ticketData;
    public SearchFlightsForm() {
        initComponents();
        con= DBConnector.ConnectDb();
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
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        sourceTxt = new javax.swing.JComboBox<>();
        destinationTxt = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Search Flights");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Source");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 130, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Destination");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 130, 40));

        searchBtn.setBackground(new java.awt.Color(245, 235, 118));
        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 230, -1, 40));

        searchTable.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Flight Id", "Source", "Destination", "Date", "Arrival Time", "Departure Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTable.setAutoscrolls(false);
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 375, 1027, 281));

        sourceTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sourceTxt.setMaximumRowCount(3);
        sourceTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Karachi", "Faisalabad", "Lahore", "islamabad", "Sukkur" }));
        jPanel1.add(sourceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 130, 40));

        destinationTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        destinationTxt.setMaximumRowCount(3);
        destinationTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lahore", "islamabad", "Karachi", "Faisalabad", "Sukkur" }));
        destinationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationTxtActionPerformed(evt);
            }
        });
        jPanel1.add(destinationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 130, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reservation/Airplane.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 748));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        
        String sql="""
                   select  flight_id,  date_, arrival_time, departure_time from flight_schedule f 
                   where f.route_code = ( select route_code from routes r where source_=? and destination=?) """;
       try{
            pst=con.prepareStatement(sql);
            pst.setString(1,sourceTxt.getSelectedItem().toString());
            pst.setString(2,destinationTxt.getSelectedItem().toString());
            rs=pst.executeQuery();
             
            ResultSetMetaData rsmd = rs.getMetaData();
            int col;
            col = rsmd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) searchTable.getModel();
            df.setRowCount(0);
            while(rs.next()){
                 Vector v2=new Vector();
                 for(int i=1; i<=col; i++){
                     v2.add(rs.getString("flight_id"));
                     v2.add(sourceTxt.getSelectedItem().toString());
                     v2.add(destinationTxt.getSelectedItem().toString());
                     v2.add(rs.getString("date_"));
                     v2.add(rs.getString("arrival_time"));
                     v2.add(rs.getString("departure_time"));
                     
                 }
                 df.addRow(v2);
             }
       }
       catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void destinationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationTxtActionPerformed

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        try {
            DefaultTableModel Df =  (DefaultTableModel) searchTable.getModel();
            int selectIndex = searchTable.getSelectedRow();
            ticketData = new BookTicketForm();
            
            ticketData.flightidTxt.setText(Df.getValueAt(selectIndex,0).toString());
            ticketData.sourceTxt.setText(Df.getValueAt(selectIndex,1).toString());
            ticketData.destinationTxt.setText(Df.getValueAt(selectIndex,2).toString());
            java.util.Date date=new SimpleDateFormat("yyyy-MM-dd").parse(Df.getValueAt(selectIndex, 3).toString());
            ticketData.dateTxt.setDate(date);
            ticketData.arrivaltimeTxt.setText(Df.getValueAt(selectIndex,4).toString());
            ticketData.departuretimeTxt.setText(Df.getValueAt(selectIndex,5).toString());
            
            ticketData.setVisible(true);
            setVisible(false);
        } catch (ParseException | IllegalArgumentException ex) {
            Logger.getLogger(SearchFlightsForm.class.getName()).log(Level.SEVERE, null, ex);
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_searchTableMouseClicked

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
            java.util.logging.Logger.getLogger(SearchFlightsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFlightsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFlightsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFlightsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchFlightsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> destinationTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable searchTable;
    private javax.swing.JComboBox<String> sourceTxt;
    // End of variables declaration//GEN-END:variables
}
