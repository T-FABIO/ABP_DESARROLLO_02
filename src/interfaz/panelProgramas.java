/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;

import static interfaz.panelCompanies.enviarNombresComProd;

import java.awt.Color;
import java.util.Set;

/**
 *
 * @author USUARIO
 */
public class panelProgramas extends javax.swing.JPanel {


    /**
     * Creates new form panelProgramas
     */
    public panelProgramas() {
        initComponents();
        setBounds(0,0,630,466);
        
    }
    
    
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CampoRNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbTipoPrograma = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbCompanyProductoras = new javax.swing.JComboBox<>();
        jcbRadio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(630, 466));

        jPanel1.setBackground(new java.awt.Color(247, 251, 252));
        jPanel1.setPreferredSize(new java.awt.Dimension(630, 466));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        jLabel1.setText("REGISTRAR PROGRAMAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 15, -1, -1));

        CampoRNombre.setBackground(new java.awt.Color(247, 251, 252));
        CampoRNombre.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        CampoRNombre.setForeground(new java.awt.Color(102, 102, 102));
        CampoRNombre.setText("Nombre De Programa");
        CampoRNombre.setBorder(null);
        CampoRNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoRNombreMouseClicked(evt);
            }
        });
        jPanel1.add(CampoRNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 176, 27));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jcbTipoPrograma.setBackground(new java.awt.Color(247, 251, 252));
        jcbTipoPrograma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbTipoPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccionar --", "Variedades", "Periodistico", "Deportivo", "Musical", "Cultural" }));
        jcbTipoPrograma.setToolTipText("GENEROS");
        jcbTipoPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcbTipoPrograma.setFocusable(false);
        jcbTipoPrograma.setName(""); // NOI18N
        jcbTipoPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcbTipoProgramaMouseEntered(evt);
            }
        });
        jcbTipoPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoProgramaActionPerformed(evt);
            }
        });
        jPanel1.add(jcbTipoPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 176, 30));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Radio que lo emite");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText("Compañia Productora");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 266, -1, -1));

        jcbCompanyProductoras.setBackground(new java.awt.Color(247, 251, 252));
        jcbCompanyProductoras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbCompanyProductoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccionar --" }));
        jcbCompanyProductoras.setToolTipText("GENEROS");
        jcbCompanyProductoras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcbCompanyProductoras.setFocusable(false);
        jcbCompanyProductoras.setName(""); // NOI18N
        jcbCompanyProductoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbCompanyProductorasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcbCompanyProductorasMouseEntered(evt);
            }
        });
        jcbCompanyProductoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCompanyProductorasActionPerformed(evt);
            }
        });
        jPanel1.add(jcbCompanyProductoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 304, 176, 30));

        jcbRadio.setBackground(new java.awt.Color(247, 251, 252));
        jcbRadio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbRadio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccionar --" }));
        jcbRadio.setToolTipText("GENEROS");
        jcbRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcbRadio.setFocusable(false);
        jcbRadio.setName(""); // NOI18N
        jcbRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbRadioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcbRadioMouseEntered(evt);
            }
        });
        jcbRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRadioActionPerformed(evt);
            }
        });
        jPanel1.add(jcbRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 218, 176, 30));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setText("Tipo de Programa");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 176, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CampoRNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoRNombreMouseClicked
        CampoRNombre.setText("");
    }//GEN-LAST:event_CampoRNombreMouseClicked

    private void jcbTipoProgramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbTipoProgramaMouseEntered
        jcbTipoPrograma.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_jcbTipoProgramaMouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jPanel2.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jPanel2.setBackground(Color.decode("#F7FBFC"));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jcbTipoProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoProgramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoProgramaActionPerformed

    private void jcbCompanyProductorasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCompanyProductorasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCompanyProductorasMouseEntered

    private void jcbCompanyProductorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCompanyProductorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCompanyProductorasActionPerformed

    private void jcbRadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbRadioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRadioMouseEntered

    private void jcbRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRadioActionPerformed

    private void jcbCompanyProductorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbCompanyProductorasMouseClicked
        
    }//GEN-LAST:event_jcbCompanyProductorasMouseClicked

    private void jcbRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbRadioMouseClicked
       
    }//GEN-LAST:event_jcbRadioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoRNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbCompanyProductoras;
    private javax.swing.JComboBox<String> jcbRadio;
    private javax.swing.JComboBox<String> jcbTipoPrograma;
    // End of variables declaration//GEN-END:variables
}
