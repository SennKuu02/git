/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jLabel_36 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8_36 = new javax.swing.JLabel();
        jLabel9_36 = new javax.swing.JLabel();
        txtusername_36 = new javax.swing.JTextField();
        txtpassword_36 = new javax.swing.JPasswordField();
        butlogin_36 = new javax.swing.JButton();
        jButton_36 = new javax.swing.JButton();
        butcancer_36 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_36.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_36.setText("Đăng nhập sách");

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8_36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8_36.setText("Username : ");

        jLabel9_36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9_36.setText("Password : ");

        txtusername_36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtpassword_36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        butlogin_36.setBackground(new java.awt.Color(255, 255, 153));
        butlogin_36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        butlogin_36.setText("Login");
        butlogin_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butlogin_36ActionPerformed(evt);
            }
        });

        jButton_36.setBackground(new java.awt.Color(255, 255, 153));
        jButton_36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_36.setText("Reset");
        jButton_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_36ActionPerformed(evt);
            }
        });

        butcancer_36.setBackground(new java.awt.Color(255, 255, 153));
        butcancer_36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        butcancer_36.setText("Cancel");
        butcancer_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcancer_36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9_36)
                    .addComponent(jLabel8_36))
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtusername_36, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(txtpassword_36))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(butlogin_36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_36, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butcancer_36)
                .addGap(0, 69, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusername_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8_36))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9_36)
                    .addComponent(txtpassword_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butlogin_36)
                    .addComponent(jButton_36)
                    .addComponent(butcancer_36))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel_36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel_36)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butlogin_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butlogin_36ActionPerformed
        // TODO add your handling code here:
        String username=txtusername_36.getText();
        String password=txtpassword_36.getText();
        StringBuilder sb= new StringBuilder();
        if(username.equals("")){
            sb.append("Username bỏ trống \n");
        }
        if(password.equals("")){
            sb.append("Password bỏ trống \n");
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(),"Invalidation",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(username.equals("abc")&& password.equals("12345")){

            txtusername_36.setText(null);
            txtpassword_36.setText(null);
            AdminQuanLySach Info=new AdminQuanLySach();
            Info.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Username hoặc Password bị sai","Failure",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butlogin_36ActionPerformed

    private void jButton_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_36ActionPerformed
        // TODO add your handling code here:
        txtusername.setText("");
        txtpassword.setText("");
    }//GEN-LAST:event_jButton_36ActionPerformed

    private void butcancer_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcancer_36ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_butcancer_36ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butcancer_36;
    private javax.swing.JButton butlogin_36;
    private javax.swing.JButton jButton_36;
    private javax.swing.JLabel jLabel8_36;
    private javax.swing.JLabel jLabel9_36;
    private javax.swing.JLabel jLabel_36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txtpassword_36;
    private javax.swing.JTextField txtusername_36;
    // End of variables declaration//GEN-END:variables

    private static class txtusername {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public txtusername() {
        }
    }

    private static class txtpassword {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public txtpassword() {
        }
    }
}
