/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;

/**
 *
 * @author USUARIO
 */
import Emisora.Trabajadores;
import java.awt.Color;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class panelTrabajadores extends javax.swing.JPanel {

    Set<Trabajadores> listaTrabajador = new HashSet<>();
    
    String nombre, cedula, tipoTrabajo;
    
    
    public panelTrabajadores() {
        initComponents();
        setBounds(0,0,630,466);
        rdbComercial.setEnabled(false);
        rdbPeriodistica.setEnabled(false);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreTrabajador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCedulaIdentidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdbPeriodistica = new javax.swing.JRadioButton();
        rdbComercial = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jbctrabajo = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(247, 251, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DialogInput", 3, 16)); // NOI18N
        jLabel1.setText("REGISTRAR TRABAJADORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 104, -1, -1));

        txtNombreTrabajador.setBackground(new java.awt.Color(247, 251, 252));
        txtNombreTrabajador.setFont(new java.awt.Font("DialogInput", 0, 13)); // NOI18N
        txtNombreTrabajador.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreTrabajador.setText("Nombre");
        txtNombreTrabajador.setBorder(null);
        txtNombreTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreTrabajadorMouseClicked(evt);
            }
        });
        jPanel1.add(txtNombreTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 136, 180, -1));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Cedula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 196, -1, -1));

        txtCedulaIdentidad.setBackground(new java.awt.Color(247, 251, 252));
        txtCedulaIdentidad.setFont(new java.awt.Font("DialogInput", 0, 13)); // NOI18N
        txtCedulaIdentidad.setForeground(new java.awt.Color(102, 102, 102));
        txtCedulaIdentidad.setText("Cedula");
        txtCedulaIdentidad.setBorder(null);
        txtCedulaIdentidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCedulaIdentidadMouseClicked(evt);
            }
        });
        jPanel1.add(txtCedulaIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 234, 180, -1));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Tipo de Trabajo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 271, -1, -1));

        buttonGroup1.add(rdbPeriodistica);
        rdbPeriodistica.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        rdbPeriodistica.setText("Periodistica");
        jPanel1.add(rdbPeriodistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        buttonGroup1.add(rdbComercial);
        rdbComercial.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        rdbComercial.setText("Comercial");
        rdbComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbComercialActionPerformed(evt);
            }
        });
        jPanel1.add(rdbComercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 161, 180, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 256, 180, 10));

        jPanel2.setBackground(new java.awt.Color(247, 251, 252));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-archivo.png"))); // NOI18N
        jLabel5.setText("REGISTRAR");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jbctrabajo.setBackground(new java.awt.Color(247, 251, 252));
        jbctrabajo.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jbctrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipos", "etc1", "etc2", "etc3" }));
        jbctrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbctrabajoActionPerformed(evt);
            }
        });
        jPanel1.add(jbctrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdbComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbComercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbComercialActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jPanel2.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jPanel2.setBackground(Color.decode("#F7FBFC"));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jbctrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbctrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbctrabajoActionPerformed

    private void txtNombreTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreTrabajadorMouseClicked
        txtNombreTrabajador.setText("");
    }//GEN-LAST:event_txtNombreTrabajadorMouseClicked

    private void txtCedulaIdentidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaIdentidadMouseClicked
        txtCedulaIdentidad.setText("");
    }//GEN-LAST:event_txtCedulaIdentidadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jbctrabajo;
    private javax.swing.JRadioButton rdbComercial;
    private javax.swing.JRadioButton rdbPeriodistica;
    private javax.swing.JTextField txtCedulaIdentidad;
    private javax.swing.JTextField txtNombreTrabajador;
    // End of variables declaration//GEN-END:variables
}