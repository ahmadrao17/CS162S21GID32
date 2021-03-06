/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dukofarms;

import javax.swing.JPanel;

/**
 *
 * @author G3NZ
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    public Menu() {
        initComponents();
        anima.setOpaque(false);
        cus.setOpaque(false);
        emp.setOpaque(false);
        mil.setOpaque(false);
        rec.setOpaque(false);
        logout.setOpaque(false);
        back.setOpaque(false);
        MainPanel p = new MainPanel();
        changePanel(p);
    }
    
    public void changePanel(JPanel p)
    {
        jLayeredPane2.removeAll();
        jLayeredPane2.add(p);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
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
        anima = new javax.swing.JButton();
        cus = new javax.swing.JButton();
        emp = new javax.swing.JButton();
        mil = new javax.swing.JButton();
        rec = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(150, 100, 50));

        anima.setBackground(new java.awt.Color(150, 100, 50));
        anima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        anima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-cow-breed-50.png"))); // NOI18N
        anima.setText("Animals ");
        anima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        anima.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        anima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animaActionPerformed(evt);
            }
        });

        cus.setBackground(new java.awt.Color(150, 100, 50));
        cus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-person-50.png"))); // NOI18N
        cus.setText("Customers ");
        cus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusActionPerformed(evt);
            }
        });

        emp.setBackground(new java.awt.Color(150, 100, 50));
        emp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-name-tag-50.png"))); // NOI18N
        emp.setText("Employees ");
        emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empActionPerformed(evt);
            }
        });

        mil.setBackground(new java.awt.Color(150, 100, 50));
        mil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-milk-bottle-50.png"))); // NOI18N
        mil.setText("MIlk ");
        mil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milActionPerformed(evt);
            }
        });

        rec.setBackground(new java.awt.Color(150, 100, 50));
        rec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-journal-50.png"))); // NOI18N
        rec.setText("Records ");
        rec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(150, 100, 50));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baseline_logout_black_24dp.png"))); // NOI18N
        logout.setToolTipText("Log Out");
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(150, 100, 50));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-page-24.png"))); // NOI18N
        back.setToolTipText("Back to Home");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(anima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(anima)
                .addGap(18, 18, 18)
                .addComponent(cus)
                .addGap(18, 18, 18)
                .addComponent(emp)
                .addGap(18, 18, 18)
                .addComponent(mil)
                .addGap(18, 18, 18)
                .addComponent(rec, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 410));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane2.setLayout(new java.awt.CardLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(690, 496));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jLayeredPane2.add(jPanel4, "card2");

        jPanel3.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/istockphoto-1141422847-612x612.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 620, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void milActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milActionPerformed
        // TODO add your handling code here:
        milk m = new milk();
        changePanel(m);
    }//GEN-LAST:event_milActionPerformed

    private void cusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusActionPerformed
        // TODO add your handling code here:
        customers c=new customers();
        changePanel(c);
    }//GEN-LAST:event_cusActionPerformed

    private void animaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animaActionPerformed
        // TODO add your handling code here:
        animals a = new animals();
        changePanel(a);
    }//GEN-LAST:event_animaActionPerformed

    private void empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empActionPerformed
        // TODO add your handling code here:
        employees em = new employees();
        changePanel(em);
    }//GEN-LAST:event_empActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        MainPanel p = new MainPanel();
        changePanel(p);
    }//GEN-LAST:event_backActionPerformed

    private void recActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recActionPerformed
        // TODO add your handling code here:
        records r = new records();
        changePanel(r);
    }//GEN-LAST:event_recActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Welcome w = new Welcome();
        w.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseEntered

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anima;
    private javax.swing.JButton back;
    private javax.swing.JButton cus;
    private javax.swing.JButton emp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logout;
    private javax.swing.JButton mil;
    private javax.swing.JButton rec;
    // End of variables declaration//GEN-END:variables
}
