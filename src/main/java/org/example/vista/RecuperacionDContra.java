/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.vista;


import org.example.infra.email.UserService;

public class RecuperacionDContra extends javax.swing.JFrame {

    /**
     * Creates new form RecuperacionDeContra
     */
    
    String email;
    UserService service;
    public RecuperacionDContra() {
        initComponents();
    }
    public RecuperacionDContra(String email, UserService service) {
        
        this.email = email;
        this.service = service;
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        conNuevaTxt = new javax.swing.JTextField();
        codigoBtn = new javax.swing.JButton();
        listoBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 51));

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codTxt.setActionCommand("<Not Set>");
        codTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codTxtActionPerformed(evt);
            }
        });
        jPanel1.add(codTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 172, 230, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el Codigo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        conNuevaTxt.setEditable(false);
        conNuevaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(conNuevaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 230, -1));

        codigoBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        codigoBtn.setText("Enviar");
        codigoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(codigoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        listoBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listoBtn.setText("Listo");
        listoBtn.setEnabled(false);
        jPanel1.add(listoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jTextPane1.setBackground(new java.awt.Color(102, 0, 51));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Te enviamos un codigo a tu correo, revisa tu bandeja de entrada e intruce el codigo en la parte de abajo.");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBtnActionPerformed
        System.out.println("ËL CODIGO ES:"+codTxt.getText());
        boolean estadoRecu = service.verifyRecoveryCode(email, codTxt.getText());
            
        if (estadoRecu) {
            conNuevaTxt.isEditable();
            listoBtn.isEnabled();
            if (conNuevaTxt != null) {
                service.resetPassword(email, conNuevaTxt.getText());
            }
        }
    }//GEN-LAST:event_codigoBtnActionPerformed

    private void codTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codTxtActionPerformed

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
            java.util.logging.Logger.getLogger(RecuperacionDContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperacionDContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperacionDContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperacionDContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperacionDContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codTxt;
    private javax.swing.JButton codigoBtn;
    private javax.swing.JTextField conNuevaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton listoBtn;
    // End of variables declaration//GEN-END:variables
}
