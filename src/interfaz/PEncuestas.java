
package interfaz;

import java.awt.Color;

public class PEncuestas extends javax.swing.JPanel {

    /**
     * Creates new form panel2
     */
    public PEncuestas() {
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

        jpanelcambio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIniciarEncuesta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 251, 252));

        jpanelcambio.setBackground(new java.awt.Color(247, 251, 252));

        jLabel2.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        jLabel2.setText("ENCUESTAS");

        jPanel1.setBackground(new java.awt.Color(247, 251, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        txtIniciarEncuesta.setBackground(new java.awt.Color(204, 255, 255));
        txtIniciarEncuesta.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtIniciarEncuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIniciarEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/encuesta (1).png"))); // NOI18N
        txtIniciarEncuesta.setText("INICIAR UNA ENCUESTA");
        txtIniciarEncuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtIniciarEncuesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtIniciarEncuesta.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        txtIniciarEncuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIniciarEncuestaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIniciarEncuestaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtIniciarEncuestaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIniciarEncuesta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIniciarEncuesta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanelcambioLayout = new javax.swing.GroupLayout(jpanelcambio);
        jpanelcambio.setLayout(jpanelcambioLayout);
        jpanelcambioLayout.setHorizontalGroup(
            jpanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelcambioLayout.createSequentialGroup()
                .addGroup(jpanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelcambioLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel2))
                    .addGroup(jpanelcambioLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jpanelcambioLayout.setVerticalGroup(
            jpanelcambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelcambioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(82, 82, 82)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelcambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelcambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIniciarEncuestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIniciarEncuestaMouseClicked
        jpanelcambio.removeAll();
        jpanelcambio.updateUI();
        jpanelcambio.setLayout(null);
        jpanelcambio.add(new ModuloPreguntas());
        
    }//GEN-LAST:event_txtIniciarEncuestaMouseClicked

    private void txtIniciarEncuestaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIniciarEncuestaMouseEntered
        jPanel1.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_txtIniciarEncuestaMouseEntered

    private void txtIniciarEncuestaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIniciarEncuestaMouseExited
        jPanel1.setBackground(Color.decode("#F7FBFC"));
    }//GEN-LAST:event_txtIniciarEncuestaMouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered

    }//GEN-LAST:event_jPanel1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanelcambio;
    private javax.swing.JLabel txtIniciarEncuesta;
    // End of variables declaration//GEN-END:variables
}
