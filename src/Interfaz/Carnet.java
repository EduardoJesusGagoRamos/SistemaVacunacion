
package Interfaz;

import Datos.RecaptchaManager;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.HeadlessException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author USER 17
 */
public class Carnet extends javax.swing.JFrame {

    public Carnet() {
      initComponents();
        cmbTipodoc.addItem("DNI");
        generarRecaptcha();

        // Configura el DocumentFilter para txtDni
        PlainDocument doc = (PlainDocument) txtDni.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (string == null) {
                    return;
                }
                if ((fb.getDocument().getLength() + string.length()) <= 8 && string.matches("\\d+")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text == null) {
                    return;
                }
                if ((fb.getDocument().getLength() + text.length() - length) <= 8 && text.matches("\\d*")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
        // Configura el formato de fecha para txtFormat

        
        MaskFormatter maskFormatter;
        try {
            maskFormatter = new MaskFormatter("## ## ####");
            maskFormatter.setPlaceholderCharacter('_');
            maskFormatter.install(txtEmision);
            txtEmision.addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent e) {
                    if (txtEmision.getText().equals("  ")) {
                        txtEmision.setText("");
                    }
                }
            });
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        //MaskFormatter maskFormatter;
        try {
            maskFormatter = new MaskFormatter("## ## ####");
            maskFormatter.setPlaceholderCharacter('_');
            maskFormatter.install(txtNacimiento);
            txtNacimiento.addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent e) {
                    if (txtNacimiento.getText().equals("  ")) {
                        txtNacimiento.setText("");
                    }
                }
            });
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbTipodoc = new javax.swing.JComboBox<>();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RecapchaTex = new javax.swing.JLabel();
        txtVerificacion = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEmision = new javax.swing.JFormattedTextField();
        txtNacimiento = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(240, 240));

        Encabezado.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga.png"))); // NOI18N

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDatos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel3.setText("Identifícate para ingresar");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Selecciona tu tipo de Documento");

        cmbTipodoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipodocItemStateChanged(evt);
            }
        });
        cmbTipodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipodocActionPerformed(evt);
            }
        });

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Numero de Documento");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Emisión de tu DNI");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Fecha de Nacimiento ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Verificacion");

        RecapchaTex.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RecapchaTex.setText("______________");

        btnContinuar.setText("Continuar");
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinuarMouseClicked(evt);
            }
        });
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel17.setText("Revisa la Política de Privacidad y Términos y ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel18.setText("Condiciones de la plataforma.");

        txtEmision.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd MM yyyy"))));
        txtEmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(PanelDatosLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3))
                            .addGroup(PanelDatosLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addComponent(cmbTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDatosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel16))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmision)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDatosLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(RecapchaTex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95))))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmbTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecapchaTex, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGap(3, 3, 3)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logotipo.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("a Carné de Vacunación");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Te damos la bienvenida ");

        jLabel10.setText("En esta plataforma podrás:");

        jLabel11.setText("- Ver y descargar tu Carné de Vacunación.");

        jLabel12.setText("- Verificar la validez de un código QR.");

        jLabel13.setText("- Ver el detalle de tu esquema de vacunación.");

        jLabel14.setText("- Descargar tu certificado de vacunación.");

        jLabel15.setText("- Solicitar el registro de tu vacunación COVID-19.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public String getDniIngresado() {
        return txtDni.getText();
    }

        

    
    private void cmbTipodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipodocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipodocActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
      String recaptchaResponse = RecapchaTex.getText();
        String userInput = txtVerificacion.getText();
        String dni = txtDni.getText();
        String fechaEmision = txtEmision.getText();
        String FechaNacimiento = txtNacimiento.getText();
        

        // Convertir ambas cadenas a minúsculas antes de compararlas
        recaptchaResponse = recaptchaResponse.toLowerCase();
        userInput = userInput.toLowerCase();

        try {
            // Verificar reCAPTCHA
            if (!userInput.equals(recaptchaResponse)) {
                JOptionPane.showMessageDialog(this, "reCAPTCHA inválido. Por favor, inténtelo de nuevo.");
                generarRecaptcha();
                return;
            }

            // Verificar DNI
            if (dni.length() != 8 || !dni.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos.");
                return;
            }

            // Verificar fecha de emision
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            dateFormat.setLenient(false); // No permite fechas inválidas
            try {
                dateFormat.parse(fechaEmision);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Utilice el formato dd MM yyyy.");
                return;
            }
            
            //
            //SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            dateFormat.setLenient(false); // No permite fechas inválidas
            try {
                dateFormat.parse(FechaNacimiento);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Utilice el formato dd MM yyyy.");
                return;
            }  // Guardar los datos en un archivo de texto
           

            // Si todo está bien, mostrar el formulario de ingreso
            JOptionPane.showMessageDialog(this, "Todos los datos son válidos. Mostrando formulario de ingreso.");
            Vacuna ingresoForm = new Vacuna();
            ingresoForm.setVisible(true);
            this.dispose();
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error al verificar los datos: " + ex.getMessage());
        }

   

    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuarMouseClicked

    private void cmbTipodocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipodocItemStateChanged
      
    }//GEN-LAST:event_cmbTipodocItemStateChanged

    private void txtEmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmisionActionPerformed

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
            java.util.logging.Logger.getLogger(Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Carnet().setVisible(true);
        });
    }private void generarRecaptcha() {
        RecapchaTex.setText(RecaptchaManager.generarRecaptcha());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JLabel RecapchaTex;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> cmbTipodoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDni;
    private javax.swing.JFormattedTextField txtEmision;
    private javax.swing.JFormattedTextField txtNacimiento;
    private javax.swing.JTextField txtVerificacion;
    // End of variables declaration//GEN-END:variables
}
