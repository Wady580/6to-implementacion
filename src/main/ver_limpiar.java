/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
/**
 *
 * @author maxim
 */
public class ver_limpiar extends javax.swing.JFrame {

    /**
     * Creates new form ver_limpiar
     */
    public ver_limpiar() {
        initComponents();
    }

    public void limpiar(){
        frm_insert_clients.txt_nombre.setText("");
        frm_insert_clients.txt_apellido.setText("");
        frm_insert_clients.txt_balance.setText("");
        frm_insert_clients.txt_tipo.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bkg_label = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        img_warning = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_cancel_limpiar = new javax.swing.JButton();
        btn_aceptar_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aviso");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(232, 122, 20));
        setMaximumSize(new java.awt.Dimension(650, 400));
        setMinimumSize(new java.awt.Dimension(650, 400));
        setPreferredSize(new java.awt.Dimension(650, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 400));

        bkg_label.setBackground(new java.awt.Color(232, 122, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_warning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exclamation.png"))); // NOI18N
        jPanel3.add(img_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel6.setText("??Est?? seguro de querer realizar esta acci??n?");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 135, -1, -1));

        btn_cancel_limpiar.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        btn_cancel_limpiar.setText("Cancelar");
        btn_cancel_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel_limpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cancel_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 180, 45));

        btn_aceptar_limpiar.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        btn_aceptar_limpiar.setText("Aceptar");
        btn_aceptar_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar_limpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_aceptar_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 210, 180, 45));

        javax.swing.GroupLayout bkg_labelLayout = new javax.swing.GroupLayout(bkg_label);
        bkg_label.setLayout(bkg_labelLayout);
        bkg_labelLayout.setHorizontalGroup(
            bkg_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        bkg_labelLayout.setVerticalGroup(
            bkg_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bkg_labelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bkg_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bkg_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptar_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        this.dispose();
    }//GEN-LAST:event_btn_aceptar_limpiarActionPerformed

    private void btn_cancel_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel_limpiarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancel_limpiarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ver_limpiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ver_limpiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ver_limpiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ver_limpiar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ver_limpiar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bkg_label;
    private javax.swing.JButton btn_aceptar_limpiar;
    private javax.swing.JButton btn_cancel_limpiar;
    private javax.swing.JLabel img_warning;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
