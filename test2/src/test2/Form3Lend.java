/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PANACHAITECHAPHAISAL
 */
public class Form3Lend extends javax.swing.JFrame {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;

    public Form3Lend() {
        initComponents();
        con = Test2.connectDB();
        ShowDataComboName();
        ShowDataComboBook();
    }

    public void ShowDataComboName() {
        try {
            String sql = "select * from myusername";
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("UserName");
                comboUser.addItem(name);
            }
        } catch (Exception e) {
        }
    }

    public void ShowDataComboBook() {
        try {
            String sql = "select * from booklist";
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("bookname");
                book.addItem(name);
            }
        } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboUser = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        book = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Lend");

        jLabel2.setText("Username");

        comboUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUserActionPerformed(evt);
            }
        });

        jLabel3.setText("bookname");

        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        jButton1.setText("comfirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("back to Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText(" Book borrowing has a period of 5 days after borrowing..");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(book, 0, 191, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel4)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUserActionPerformed

    }//GEN-LAST:event_comboUserActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
        MainForm mainform = new MainForm();
        mainform.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String sql = "INSERT INTO `history`(`IDName`, `BookName`, `LendDate`,`TimetoSend`, `ReturnDate`, `Status`, `Fine`)"
                    + " VALUES(?,?,?,?,?,?,?    )";
            Calendar c = Calendar.getInstance();
            Date today = c.getTime();
            pst = con.prepareCall(sql);
            pst.setString(1, comboUser.getSelectedItem().toString());
            pst.setString(2, book.getSelectedItem().toString());
            pst.setString(3, "" + today);
            Calendar d = Calendar.getInstance();
            d.setTime(new Date()); // Now use today date.
            d.add(Calendar.DATE, 5); // Adding 5 days      
            Date next = d.getTime();
            pst.setString(4, "" +next);
            pst.setString(5, "");
            pst.setString(6, "Lend");
            pst.setString(7, "0");
            pst.execute();

            String sql1 = "select * from myusername where UserName='" + comboUser.getSelectedItem().toString() + "'";
            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            int add5 = 0;
            if (rs.next()) {
                add5 = rs.getInt("UserTime");
            }

            String sql3 = "Select * from booklist where bookname='" + book.getSelectedItem().toString() + "'";
            pst = con.prepareStatement(sql3);
            rs = pst.executeQuery();
            int booknum = 0;
            if (rs.next()) {
                booknum = rs.getInt("NumofBook");
            }

            if (booknum <= 0) {
                JOptionPane.showMessageDialog(this, "No book to lend", "Book", JOptionPane.INFORMATION_MESSAGE);

            } else {
                String sql2 = "update myusername set UserTime=?,UserStats=? where UserName='" + comboUser.getSelectedItem().toString() + "'";
                pst = con.prepareStatement(sql2);
                add5 += 1;
                pst.setString(1, "" + add5);
                pst.setString(2, "OK");
                pst.execute();

                String sql4 = "update booklist set NumofBook=? where bookname='" + book.getSelectedItem().toString() + "'";
                pst = con.prepareStatement(sql4);
                booknum -= 1;
                pst.setString(1, "" + booknum);
                pst.execute();

                JOptionPane.showMessageDialog(this, "Save", "Save Complete", JOptionPane.INFORMATION_MESSAGE);
                MainForm mainform = new MainForm();
                mainform.setVisible(true);
                close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

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
            java.util.logging.Logger.getLogger(Form3Lend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form3Lend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form3Lend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form3Lend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form3Lend().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> book;
    private javax.swing.JComboBox<String> comboUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
