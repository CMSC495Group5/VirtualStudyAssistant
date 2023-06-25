
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Brandon
 */
public class vsa_dashboard extends javax.swing.JFrame {

    Color defaultColor,clickColor;
    public vsa_dashboard() {
        initComponents();
        defaultColor = new Color(23,20,20);
        clickColor = new Color(51,102,255);
        
        dash_menu.setBackground(defaultColor);
        sched_menu.setBackground(defaultColor);
        task_menu.setBackground(defaultColor);
        resource_menu.setBackground(defaultColor);
        prog_menu.setBackground(defaultColor);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        task_menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        resource_menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        prog_menu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        sched_menu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        dash_menu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        dash_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Brandon\\Downloads\\icons8-exit-48.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Virtual Study Assistant");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Virtual Study Assistant");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Virtual Study Assistant");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 70));

        jPanel2.setBackground(new java.awt.Color(23, 20, 20));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        task_menu.setBackground(new java.awt.Color(23, 20, 20));
        task_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                task_menuMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-menu-50.png"))); // NOI18N
        jLabel2.setText("Study Tasks");

        javax.swing.GroupLayout task_menuLayout = new javax.swing.GroupLayout(task_menu);
        task_menu.setLayout(task_menuLayout);
        task_menuLayout.setHorizontalGroup(
            task_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, task_menuLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        task_menuLayout.setVerticalGroup(
            task_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(task_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 50));

        resource_menu.setBackground(new java.awt.Color(23, 20, 20));
        resource_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resource_menuMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-menu-50.png"))); // NOI18N
        jLabel4.setText("Study Resources");

        javax.swing.GroupLayout resource_menuLayout = new javax.swing.GroupLayout(resource_menu);
        resource_menu.setLayout(resource_menuLayout);
        resource_menuLayout.setHorizontalGroup(
            resource_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resource_menuLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        resource_menuLayout.setVerticalGroup(
            resource_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(resource_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 230, 50));

        prog_menu.setBackground(new java.awt.Color(23, 20, 20));
        prog_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prog_menuMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-menu-50.png"))); // NOI18N
        jLabel5.setText("Progress Tracking");

        javax.swing.GroupLayout prog_menuLayout = new javax.swing.GroupLayout(prog_menu);
        prog_menu.setLayout(prog_menuLayout);
        prog_menuLayout.setHorizontalGroup(
            prog_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prog_menuLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        prog_menuLayout.setVerticalGroup(
            prog_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(prog_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 50));

        sched_menu.setBackground(new java.awt.Color(23, 20, 20));
        sched_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sched_menuMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-menu-50.png"))); // NOI18N
        jLabel6.setText("Study Schedules");

        javax.swing.GroupLayout sched_menuLayout = new javax.swing.GroupLayout(sched_menu);
        sched_menu.setLayout(sched_menuLayout);
        sched_menuLayout.setHorizontalGroup(
            sched_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sched_menuLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(49, 49, 49))
        );
        sched_menuLayout.setVerticalGroup(
            sched_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(sched_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 50));

        dash_menu.setBackground(new java.awt.Color(23, 20, 20));
        dash_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_menuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dash_menuMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-menu-50.png"))); // NOI18N
        jLabel7.setText("Dashboard");

        javax.swing.GroupLayout dash_menuLayout = new javax.swing.GroupLayout(dash_menu);
        dash_menu.setLayout(dash_menuLayout);
        dash_menuLayout.setHorizontalGroup(
            dash_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dash_menuLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        dash_menuLayout.setVerticalGroup(
            dash_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(dash_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 500));

        dash_panel.setBackground(new java.awt.Color(255, 255, 255));
        dash_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Welcome, <insert username>");
        dash_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Brandon\\Downloads\\v996-009_1-kroir4dk.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        dash_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 503));

        getContentPane().add(dash_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 610, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void sched_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sched_menuMousePressed
        dash_menu.setBackground(defaultColor);
        sched_menu.setBackground(clickColor);
        task_menu.setBackground(defaultColor);
        resource_menu.setBackground(defaultColor);
        prog_menu.setBackground(defaultColor);
    }//GEN-LAST:event_sched_menuMousePressed

    private void task_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_task_menuMousePressed
        dash_menu.setBackground(defaultColor);
        sched_menu.setBackground(defaultColor);
        task_menu.setBackground(clickColor);
        resource_menu.setBackground(defaultColor);
        prog_menu.setBackground(defaultColor);
    }//GEN-LAST:event_task_menuMousePressed

    private void resource_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resource_menuMousePressed
        dash_menu.setBackground(defaultColor);
        sched_menu.setBackground(defaultColor);
        task_menu.setBackground(defaultColor);
        resource_menu.setBackground(clickColor);
        prog_menu.setBackground(defaultColor);
    }//GEN-LAST:event_resource_menuMousePressed

    private void prog_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prog_menuMousePressed
        dash_menu.setBackground(defaultColor);
        sched_menu.setBackground(defaultColor);
        task_menu.setBackground(defaultColor);
        resource_menu.setBackground(defaultColor);
        prog_menu.setBackground(clickColor);
    }//GEN-LAST:event_prog_menuMousePressed

    private void dash_menuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_menuMousePressed
        dash_menu.setBackground(clickColor);
        sched_menu.setBackground(defaultColor);
        task_menu.setBackground(defaultColor);
        resource_menu.setBackground(defaultColor);
        prog_menu.setBackground(defaultColor);
    }//GEN-LAST:event_dash_menuMousePressed

    private void dash_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_menuMouseClicked
        dash_menu.setVisible(true);
    }//GEN-LAST:event_dash_menuMouseClicked

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
            java.util.logging.Logger.getLogger(vsa_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vsa_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vsa_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vsa_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vsa_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dash_menu;
    private javax.swing.JPanel dash_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel prog_menu;
    private javax.swing.JPanel resource_menu;
    private javax.swing.JPanel sched_menu;
    private javax.swing.JPanel task_menu;
    // End of variables declaration//GEN-END:variables
}
