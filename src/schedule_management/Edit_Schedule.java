/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schedule_management;

import arraylist_handler.ArrayListHandler;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author jdev1
 */
public class Edit_Schedule extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Schedule
     */
    
    public Edit_Schedule() {
        initComponents();
    }
    
   

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title_label = new javax.swing.JLabel();
        enter_course_prompt = new javax.swing.JLabel();
        search_textField = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label.setText("Edit Schedule ");
        title_label.setToolTipText("");

        enter_course_prompt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        enter_course_prompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enter_course_prompt.setText("Enter Course Name");
        enter_course_prompt.setToolTipText("");

        search_textField.setToolTipText("Enter Class Name");

        search_button.setText("Search");
        search_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_buttonMouseClicked(evt);
            }
        });

        jButton1.setText("Back to Schedule Management");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enter_course_prompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search_textField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enter_course_prompt)
                .addGap(18, 18, 18)
                .addComponent(search_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseClicked
        // TODO add your handling code here:
        ArrayListHandler.editSchedule(search_textField.getText());
        if(ArrayListHandler.getClassMatched() == true){
            Edit_Course_Information edit_course = new Edit_Course_Information(search_textField.getText());
            this.setVisible(false);
            edit_course.setVisible(true);
            
        }
        else if(ArrayListHandler.getClassMatched() == false){
             JDialog dialog = new JDialog(this, "Course not in schedule");
                dialog.add(new JLabel("Your course is not in your schedule."));
                dialog.setSize(250, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
            
        }
        else if (ArrayListHandler.getscheduleEmpty() == true){
            JDialog dialog = new JDialog(this, "Schedule is empty");
                dialog.add(new JLabel("Your schedule is empty."));
                dialog.setSize(250, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
            
        }
    }//GEN-LAST:event_search_buttonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Schedule_Management schedule_management = new  Schedule_Management();
        this.setVisible(false);
        schedule_management.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Edit_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enter_course_prompt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_textField;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
