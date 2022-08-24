/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.SwingConstants;
//import java.awt.Desktop;

public class RegistrarLogin extends javax.swing.JPanel {


    public RegistrarLogin() {
        initComponents();
        txt_verificacion.setVisible(false);
        setBounds(0,0,400,410);
        //jButton2.setHorizontalTextPosition(SwingConstants.LEFT); SIRVE PARA PONER EL ICONO DE IN TEXTFIELD DE IZQUIERDA A DERECHA
        //jButton3.setHorizontalTextPosition(SwingConstants.LEFT); SIRVE PARA PONER EL ICONO DE IN TEXTFIELD DE IZQUIERDA A DERECHA
        
        
    }
    
    public JPanel ver(){
        return this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registrarNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        registrarApellido = new javax.swing.JTextField();
        registrarTelefono = new javax.swing.JTextField();
        registrarCorreo = new javax.swing.JTextField();
        registrarContraseña = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        panelBtnregistrarpersona = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_verificacion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 251, 252));
        setPreferredSize(new java.awt.Dimension(320, 400));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("DialogInput", 3, 14)); // NOI18N
        jLabel1.setText("REGISTRAR");
        add(jLabel1);
        jLabel1.setBounds(164, 20, 72, 20);

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE");
        add(jLabel2);
        jLabel2.setBounds(38, 67, 119, 16);

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APELLIDO");
        add(jLabel3);
        jLabel3.setBounds(38, 113, 100, 16);

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TELEFONO");
        add(jLabel4);
        jLabel4.setBounds(38, 159, 100, 16);

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CORREO");
        add(jLabel5);
        jLabel5.setBounds(38, 205, 100, 16);

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTRASEÑA");
        add(jLabel6);
        jLabel6.setBounds(38, 251, 100, 16);

        registrarNombre.setBackground(new java.awt.Color(247, 251, 252));
        registrarNombre.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        registrarNombre.setForeground(new java.awt.Color(153, 153, 153));
        registrarNombre.setText("Introducir Nombre");
        registrarNombre.setToolTipText("Nombre");
        registrarNombre.setBorder(null);
        registrarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarNombreMousePressed(evt);
            }
        });
        add(registrarNombre);
        registrarNombre.setBounds(161, 67, 148, 16);
        add(jSeparator1);
        jSeparator1.setBounds(156, 273, 148, 10);

        registrarApellido.setBackground(new java.awt.Color(247, 251, 252));
        registrarApellido.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        registrarApellido.setForeground(new java.awt.Color(153, 153, 153));
        registrarApellido.setText("Introducir Apellido");
        registrarApellido.setToolTipText("Apellido");
        registrarApellido.setBorder(null);
        registrarApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarApellidoMousePressed(evt);
            }
        });
        add(registrarApellido);
        registrarApellido.setBounds(161, 113, 148, 16);

        registrarTelefono.setBackground(new java.awt.Color(247, 251, 252));
        registrarTelefono.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        registrarTelefono.setForeground(new java.awt.Color(153, 153, 153));
        registrarTelefono.setText("Introducir Telefono");
        registrarTelefono.setToolTipText("Telefono");
        registrarTelefono.setBorder(null);
        registrarTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarTelefonoMousePressed(evt);
            }
        });
        add(registrarTelefono);
        registrarTelefono.setBounds(161, 159, 148, 16);

        registrarCorreo.setBackground(new java.awt.Color(247, 251, 252));
        registrarCorreo.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        registrarCorreo.setForeground(new java.awt.Color(153, 153, 153));
        registrarCorreo.setText("Introducir Correo");
        registrarCorreo.setToolTipText("Correo");
        registrarCorreo.setBorder(null);
        registrarCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarCorreoMousePressed(evt);
            }
        });
        registrarCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                registrarCorreoKeyReleased(evt);
            }
        });
        add(registrarCorreo);
        registrarCorreo.setBounds(161, 205, 148, 16);

        registrarContraseña.setBackground(new java.awt.Color(247, 251, 252));
        registrarContraseña.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        registrarContraseña.setForeground(new java.awt.Color(153, 153, 153));
        registrarContraseña.setText("Introducir Contraseña");
        registrarContraseña.setToolTipText("Contraseña");
        registrarContraseña.setBorder(null);
        registrarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registrarContraseñaMousePressed(evt);
            }
        });
        registrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarContraseñaActionPerformed(evt);
            }
        });
        add(registrarContraseña);
        registrarContraseña.setBounds(156, 251, 148, 16);
        add(jSeparator2);
        jSeparator2.setBounds(161, 223, 148, 10);
        add(jSeparator3);
        jSeparator3.setBounds(161, 181, 148, 10);
        add(jSeparator4);
        jSeparator4.setBounds(161, 131, 148, 10);
        add(jSeparator5);
        jSeparator5.setBounds(161, 89, 148, 10);

        panelBtnregistrarpersona.setBackground(new java.awt.Color(247, 251, 252));
        panelBtnregistrarpersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("RESGISTRARSE");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBtnregistrarpersonaLayout = new javax.swing.GroupLayout(panelBtnregistrarpersona);
        panelBtnregistrarpersona.setLayout(panelBtnregistrarpersonaLayout);
        panelBtnregistrarpersonaLayout.setHorizontalGroup(
            panelBtnregistrarpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelBtnregistrarpersonaLayout.setVerticalGroup(
            panelBtnregistrarpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        add(panelBtnregistrarpersona);
        panelBtnregistrarpersona.setBounds(220, 320, 102, 30);

        txt_verificacion.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        txt_verificacion.setForeground(new java.awt.Color(255, 0, 0));
        txt_verificacion.setText("Invalido");
        add(txt_verificacion);
        txt_verificacion.setBounds(330, 200, 60, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarContraseñaActionPerformed

    private void registrarNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarNombreMousePressed
        registrarNombre.setText("");
        registrarNombre.setForeground(Color.black);
    }//GEN-LAST:event_registrarNombreMousePressed

    private void registrarApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarApellidoMousePressed
        registrarApellido.setText("");
        registrarApellido.setForeground(Color.black);
    }//GEN-LAST:event_registrarApellidoMousePressed

    private void registrarTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarTelefonoMousePressed
        registrarTelefono.setText("");
        registrarTelefono.setForeground(Color.black);
    }//GEN-LAST:event_registrarTelefonoMousePressed

    private void registrarCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarCorreoMousePressed
        registrarCorreo.setText("");
        registrarCorreo.setForeground(Color.black);
    }//GEN-LAST:event_registrarCorreoMousePressed

    private void registrarContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarContraseñaMousePressed
        registrarContraseña.setText("");
        registrarContraseña.setForeground(Color.black);
    }//GEN-LAST:event_registrarContraseñaMousePressed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        panelBtnregistrarpersona.setBackground(Color.decode("#B7E4C7"));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        panelBtnregistrarpersona.setBackground(Color.decode("#F7FBFC"));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String rnombre = "Introducir Nombre";
        String rapellido = "Introducir Apellido";
        String rtelefono = "Introducir Telefono";
        String rcorreo = "Introducir Correo";
        String rcontraseña = "Introducir Contraseña";

        if (registrarNombre.getText().isEmpty() || registrarApellido.getText().isEmpty() || registrarTelefono.getText().isEmpty()
                || registrarCorreo.getText().isEmpty() || registrarContraseña.getText().isEmpty() || registrarNombre.getText().equals(rnombre)
                || registrarApellido.getText().equals(rapellido) || registrarTelefono.getText().equals(rtelefono) || registrarCorreo.getText().equals(rcorreo)
                || registrarContraseña.getText().equals(rcontraseña)) {

            JOptionPane.showMessageDialog(this, "! FAVOR NO DEJAR CAMPOS VACIOS ¡", " * ATENCION * ", JOptionPane.WARNING_MESSAGE);
        } else {

            if (registrarContraseña.getText().length() >= 16 || registrarContraseña.getText().length() <= 7) {

                JOptionPane.showMessageDialog(null, "Solo se admiten de 8 a 15 caracteres", "CONTRASEÑA INCORRECTA", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sesion", "root", "");
                    PreparedStatement pst = cn.prepareStatement("insert into usuarios values(?,?,?,?,?)");

                    pst.setString(1, registrarNombre.getText().trim());
                    pst.setString(2, registrarApellido.getText().trim());
                    pst.setString(3, registrarTelefono.getText().trim());
                    pst.setString(4, registrarCorreo.getText().trim());
                    pst.setString(5, registrarContraseña.getText());
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");

                    registrarNombre.setText(rnombre);
                    registrarNombre.setForeground(Color.gray);
                    registrarApellido.setText(rapellido);
                    registrarApellido.setForeground(Color.gray);
                    registrarTelefono.setText(rtelefono);
                    registrarTelefono.setForeground(Color.gray);
                    registrarCorreo.setText(rcorreo);
                    registrarCorreo.setForeground(Color.gray);
                    registrarContraseña.setText(rcontraseña);
                    registrarContraseña.setForeground(Color.gray);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
                }
            }

        }

//        if(registrarCorreo.getText().equals(s)){
//        
//        }

    }//GEN-LAST:event_jLabel7MouseClicked

    private void registrarCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarCorreoKeyReleased
        if(verificar_email(registrarCorreo.getText())){
            txt_verificacion.setVisible(false);
        }else{
            txt_verificacion.setVisible(true);
        }
    }//GEN-LAST:event_registrarCorreoKeyReleased

    public boolean verificar_email(String correo){
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mat = patron.matcher(correo);    
        return mat.find();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel panelBtnregistrarpersona;
    private javax.swing.JTextField registrarApellido;
    private javax.swing.JTextField registrarContraseña;
    private javax.swing.JTextField registrarCorreo;
    private javax.swing.JTextField registrarNombre;
    private javax.swing.JTextField registrarTelefono;
    private javax.swing.JLabel txt_verificacion;
    // End of variables declaration//GEN-END:variables
}