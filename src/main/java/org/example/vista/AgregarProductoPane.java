/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.vista;

import jakarta.persistence.EntityManager;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.example.dao.TipoProductoDAO;
import org.example.modelo.TipoProducto;
import org.example.utils.JPAUtils;

/**
 *
 * @author Christian
 */
public class AgregarProductoPane extends javax.swing.JPanel {

    /**
     * Creates new form AgregarProductoPane
     */
    public AgregarProductoPane() {
        initComponents();
        cargarTipos();
    }

    public void cargarTipos() {
        EntityManager em = JPAUtils.getEntityManager();
        TipoProductoDAO tipos = new TipoProductoDAO(em);
        List<TipoProducto> tiposList = tipos.consultaTodos();

        TipoProductoComboBox1.removeAllItems();
        for (TipoProducto a : tiposList) {
            TipoProductoComboBox1.addItem(a);
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

        agregarProductoPane = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nombreTxt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        descripcionTxt1 = new javax.swing.JTextField();
        TipoProductoComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        precioTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        agregarProductoPane.setBackground(new java.awt.Color(102, 0, 51));
        agregarProductoPane.setPreferredSize(new java.awt.Dimension(320, 380));
        agregarProductoPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre");
        agregarProductoPane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        nombreTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreTxt1.setText("Leche");
        nombreTxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTxt1KeyTyped(evt);
            }
        });
        agregarProductoPane.add(nombreTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripcion");
        agregarProductoPane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        descripcionTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descripcionTxt1.setText("Leche demipAlo");
        descripcionTxt1.setToolTipText("");
        agregarProductoPane.add(descripcionTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, -1));

        TipoProductoComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TipoProductoComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoProductoComboBox1ItemStateChanged(evt);
            }
        });
        TipoProductoComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoProductoComboBox1ActionPerformed(evt);
            }
        });
        agregarProductoPane.add(TipoProductoComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 166, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo");
        agregarProductoPane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        precioTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precioTxt.setText("4.99");
        precioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTxtActionPerformed(evt);
            }
        });
        precioTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioTxtKeyTyped(evt);
            }
        });
        agregarProductoPane.add(precioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 85, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio");
        agregarProductoPane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarProductoPane, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(agregarProductoPane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void TipoProductoComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoProductoComboBox1ActionPerformed

    }//GEN-LAST:event_TipoProductoComboBox1ActionPerformed

    private void precioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTxtActionPerformed

    }//GEN-LAST:event_precioTxtActionPerformed

    private void TipoProductoComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoProductoComboBox1ItemStateChanged

    }//GEN-LAST:event_TipoProductoComboBox1ItemStateChanged

    private void nombreTxt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTxt1KeyTyped
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
    }//GEN-LAST:event_nombreTxt1KeyTyped

    private void precioTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioTxtKeyTyped
        char caracter = evt.getKeyChar();
        String text = precioTxt.getText();
        
        if (text.contains(".")) {
        int decimalIndex = text.indexOf(".");
        // Contar los dígitos después del punto
        if (text.length() - decimalIndex > 2) {
            evt.consume();
            return;
        }
    }
        if (!Character.isDigit(caracter) && caracter != '.') {
            evt.consume();
        } else {

            JTextField textField = (JTextField) evt.getSource();
            if (textField.getText().length() >= 5) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_precioTxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<TipoProducto> TipoProductoComboBox1;
    private javax.swing.JPanel agregarProductoPane;
    public javax.swing.JTextField descripcionTxt1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JTextField nombreTxt1;
    public javax.swing.JTextField precioTxt;
    // End of variables declaration//GEN-END:variables
}
