/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import BaseDeDatos.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author papas
 */
public class ModficarUsuario extends javax.swing.JInternalFrame {

    private Usuario consulta;
    private BaseDeDatos.Usuario modificar;
    public ModficarUsuario() {
        initComponents();
        modificar = new BaseDeDatos.Usuario();
        
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
        nombretxt = new javax.swing.JTextField();
        Buscarbt = new javax.swing.JButton();
        Modificarbt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        contrasenatxt = new javax.swing.JTextField();
        codigousuariotxt = new javax.swing.JTextField();
        idusuariotxt = new javax.swing.JTextField();
        apellidotxt = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 223, 208));
        setBorder(null);
        setClosable(true);
        setTitle("Modificar Usuarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo (1).png"))); // NOI18N
        setName("modificarUsuario"); // NOI18N
        setPreferredSize(new java.awt.Dimension(540, 400));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("CodigoUsuario");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("IdUsuario");

        nombretxt.setEditable(false);

        Buscarbt.setBackground(new java.awt.Color(233, 115, 0));
        Buscarbt.setForeground(new java.awt.Color(226, 223, 208));
        Buscarbt.setText("Buscar");
        Buscarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarbtActionPerformed(evt);
            }
        });

        Modificarbt.setBackground(new java.awt.Color(233, 115, 0));
        Modificarbt.setForeground(new java.awt.Color(226, 223, 208));
        Modificarbt.setText("Modificar");
        Modificarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarbtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña");

        contrasenatxt.setEditable(false);

        idusuariotxt.setEditable(false);

        apellidotxt.setEditable(false);

        jButton6.setBackground(new java.awt.Color(226, 223, 208));
        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("X");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contrasenatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idusuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(codigousuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Modificarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton6)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigousuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idusuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(contrasenatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buscarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarbtActionPerformed
        if (evt.getSource() == Buscarbt) {
            int codigoUsuario = Integer.parseInt(codigousuariotxt.getText());
            codigousuariotxt.setEditable(false);
            nombretxt.setEditable(true);
            apellidotxt.setEditable(true);
            idusuariotxt.setEditable(true);
            contrasenatxt.setEditable(true);

            // Crear una instancia de Consultar
            consulta = new Usuario();

            // Obtener los datos del usuario
            String[] usuarioDatos = consulta.obtenerUsuarioPorId(codigoUsuario);

            if (usuarioDatos != null) {
                // Llenar los campos de texto con los datos del usuario
                codigousuariotxt.setText(usuarioDatos[0]); // Código de usuario
                nombretxt.setText(usuarioDatos[1]); // Nombre
                apellidotxt.setText(usuarioDatos[2]); // Apellido
                idusuariotxt.setText(usuarioDatos[3]); // ID de usuario
                contrasenatxt.setText(usuarioDatos[4]); // Contraseña
            } else {
                // Mostrar un mensaje si no se encuentra el usuario
                JOptionPane.showMessageDialog(this, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                // Limpiar los campos si no se encuentra el usuario
                codigousuariotxt.setText("");
                nombretxt.setText("");
                apellidotxt.setText("");
                idusuariotxt.setText("");
                contrasenatxt.setText("");
            }
        }
    }//GEN-LAST:event_BuscarbtActionPerformed

    private void ModificarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarbtActionPerformed
        if (evt.getSource() == Modificarbt) {
            // Obtener el código de usuario del campo de texto
            int codigoUsuario = Integer.parseInt(codigousuariotxt.getText()); // Esto lanzará una excepción si el texto no es un número
            String nombreusuario = nombretxt.getText();
            String apellidousuario = apellidotxt.getText();
            int idusuario = Integer.parseInt(idusuariotxt.getText());
            String contrasena = contrasenatxt.getText();
            
            // Llamar al método para eliminar el usuario
            boolean modificado = modificar.modificarUsuario(codigoUsuario,nombreusuario,apellidousuario, idusuario, contrasena);

            if (modificado) {
                codigousuariotxt.setEditable(true);
                nombretxt.setEditable(false);
                apellidotxt.setEditable(false);
                idusuariotxt.setEditable(false);
                contrasenatxt.setEditable(false);
                JOptionPane.showMessageDialog(this, "Usuario modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Limpiar los campos de texto
                codigousuariotxt.setText("");
                nombretxt.setText("");
                apellidotxt.setText("");
                idusuariotxt.setText("");
                contrasenatxt.setText("");
            } else {
                // Mostrar mensaje de error si no se pudo eliminar
                JOptionPane.showMessageDialog(this, "No se encontró el usuario o no se pudo modificar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ModificarbtActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbt;
    private javax.swing.JButton Modificarbt;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JTextField codigousuariotxt;
    private javax.swing.JTextField contrasenatxt;
    private javax.swing.JTextField idusuariotxt;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}
