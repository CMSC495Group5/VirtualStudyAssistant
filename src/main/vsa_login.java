package main;


import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Brandon
 */
public class vsa_login extends javax.swing.JFrame {
    
    private String username;
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    Color panDefault,panEnter,panClick;
    public vsa_login() {
        initComponents();
        panDefault=new Color(51,102,255);
        panClick=new Color(35,85,235);
        panEnter=new Color(35,85,235);
        login_button.setBackground(panDefault);
        setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_box = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        login_button = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(843, 570));

        jPanel1.setBackground(new java.awt.Color(23, 20, 20));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Virtual Study Assistant");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 570));

        name_box.setBackground(new java.awt.Color(23, 20, 20));
        name_box.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name_box.setForeground(new java.awt.Color(255, 255, 255));
        name_box.setBorder(null);
        name_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_boxActionPerformed(evt);
            }
        });
        jPanel1.add(name_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 346, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 346, -1));

        login_button.setBackground(new java.awt.Color(51, 102, 255));
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_buttonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                login_buttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                login_buttonMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout login_buttonLayout = new javax.swing.GroupLayout(login_button);
        login_button.setLayout(login_buttonLayout);
        login_buttonLayout.setHorizontalGroup(
            login_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_buttonLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        login_buttonLayout.setVerticalGroup(
            login_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_buttonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 350, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Username");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 158, -1));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_boxActionPerformed
        setUsername(name_box.getText());
    }//GEN-LAST:event_name_boxActionPerformed

    private void login_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseEntered
        login_button.setBackground(panEnter);
    }//GEN-LAST:event_login_buttonMouseEntered

    private void login_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseExited
        login_button.setBackground(panDefault);
    }//GEN-LAST:event_login_buttonMouseExited

    private void login_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMousePressed
        login_button.setBackground(panClick);
    }//GEN-LAST:event_login_buttonMousePressed

    private void login_buttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseReleased
        login_button.setBackground(panDefault);
    }//GEN-LAST:event_login_buttonMouseReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        vsa_dashboard dash = new vsa_dashboard(name_box.getText());
        this.setVisible(false);
        dash.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        login_button.setBackground(panEnter);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        login_button.setBackground(panDefault);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        login_button.setBackground(panClick);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        login_button.setBackground(panDefault);
    }//GEN-LAST:event_jLabel4MouseReleased

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
            java.util.logging.Logger.getLogger(vsa_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vsa_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vsa_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vsa_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vsa_login login = new vsa_login();
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel login_button;
    private javax.swing.JTextField name_box;
    // End of variables declaration//GEN-END:variables
}
