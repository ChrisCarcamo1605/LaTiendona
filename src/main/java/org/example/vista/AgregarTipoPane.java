/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.vista;

import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.example.dao.ProductoDAO;
import org.example.dao.TipoProductoDAO;
import org.example.modelo.Producto;
import org.example.modelo.TipoProducto;
import org.example.utils.JPAUtils;

/**
 *
 * @author Christian
 */
public class AgregarTipoPane extends javax.swing.JPanel {

    /**
     * Creates new form AgregarTipoPane
     */
    public AgregarTipoPane() {
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

        agregarTipoPane = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nombreTipoTxt1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 0, 51));
        setPreferredSize(new java.awt.Dimension(320, 310));

        agregarTipoPane.setBackground(new java.awt.Color(102, 0, 51));
        agregarTipoPane.setMinimumSize(new java.awt.Dimension(550, 490));
        agregarTipoPane.setPreferredSize(new java.awt.Dimension(320, 310));
        agregarTipoPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre");
        agregarTipoPane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        nombreTipoTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreTipoTxt1.setText("Leche");
        nombreTipoTxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTipoTxt1KeyTyped(evt);
            }
        });
        agregarTipoPane.add(nombreTipoTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarTipoPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarTipoPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTipoTxt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTipoTxt1KeyTyped
         char caracter = evt.getKeyChar();
        if (Character.isDigit(caracter)) {
            evt.consume();
        } else {
       
        JTextField textField = (JTextField) evt.getSource();
        if (textField.getText().length() >= 20) {
            evt.consume(); // Ignorar el evento si ya tiene 3 dígitos
            JOptionPane.showMessageDialog(textField, "Solo se permiten hasta 3 dígitos.");
        }
    }
    }//GEN-LAST:event_nombreTipoTxt1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agregarTipoPane;
    private javax.swing.JLabel jLabel11;
    public javax.swing.JTextField nombreTipoTxt1;
    // End of variables declaration//GEN-END:variables
}
