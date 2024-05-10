
package Interfaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nefij
 */
public class NumVacunas extends javax.swing.JFrame {

   // Variables para almacenar los datos del archivo dni.txt
    private Map<String, String[]> dniData;
    
    // Variable para almacenar los datos del archivo dosis.txt
    private Map<String, Integer> dosisData;

    /**
     * Creates new form NumVacunas
     */
    public NumVacunas() throws ParseException {
        initComponents();
        dniData = new HashMap<>();
        dosisData = new HashMap<>();
        loadDniData("dni.txt");
        loadDosisData("dosis.txt");
    }

    /**
     * Método para cargar los datos del archivo dni.txt en un mapa.
     * @param filename Ruta del archivo dni.txt
     */
    private void loadDniData(String filePath) throws ParseException {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                // Obtener los datos
                String dni = data[0];
                String fechaNacimiento = data[1];
                String fechaVacunacion = data[2];
                String nombreCompleto = data[3];

                // Mostrar los datos en los JLabel
                lblNombre.setText("Nombre: " + nombreCompleto);
                lblDni.setText("DNI: " + dni);
                // Calcular la edad desde la fecha de nacimiento
                // Mostrar la edad en el JLabel lblEdad
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaNac = dateFormat.parse(fechaNacimiento);
                int edad = calcularEdad(fechaNac);
                lblEdad.setText("Edad: " + edad + " años");
            }

            scanner.close();
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
    }

   private void loadDosisData(String filePath) {
    try {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(",");

            // Obtener los datos
            String dni = data[0];
            int numeroDosis = Integer.parseInt(data[1]);

            // Mostrar el número de dosis en el JLabel lblNumeroDosis
            lblNumeroDosis.setText("Número de dosis: " + numeroDosis);
            
            // Actualizar el estado de los JCheckBox
            switch (numeroDosis) {
                case 1:
                    Check1.setSelected(true);
                    break;
                case 2:
                    Check1.setSelected(true);
                    Check2.setSelected(true);
                    break;
                case 3:
                    Check1.setSelected(true);
                    Check2.setSelected(true);
                    Check3.setSelected(true);
                    break;
                case 4:
                    Check1.setSelected(true);
                    Check2.setSelected(true);
                    Check3.setSelected(true);
                    Check4.setSelected(true);
                    break;
                default:
                    break;
            }
        }

        scanner.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }}

    private int calcularEdad(Date fechaNac) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNac.getYear();
        if (fechaNac.getMonth() > fechaActual.getMonth()
                || (fechaNac.getMonth() == fechaActual.getMonth() && fechaNac.getDate() > fechaActual.getDate())) {
            edad--;
        }
        return edad;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar3 = new javax.swing.JButton();
        PanelDatos3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        Pqr = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        lblNumeroDosis = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        Check2 = new javax.swing.JCheckBox();
        Check1 = new javax.swing.JCheckBox();
        Check4 = new javax.swing.JCheckBox();
        Check3 = new javax.swing.JCheckBox();
        lblEdad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Encabezado3.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga.png"))); // NOI18N

        btnCerrar3.setText("Cerrar sesión");
        btnCerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Encabezado3Layout = new javax.swing.GroupLayout(Encabezado3);
        Encabezado3.setLayout(Encabezado3Layout);
        Encabezado3Layout.setHorizontalGroup(
            Encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Encabezado3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar3)
                .addGap(14, 14, 14))
        );
        Encabezado3Layout.setVerticalGroup(
            Encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Encabezado3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(Encabezado3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnCerrar3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDatos3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tu Vacunacion COVID-19");

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setText("Ver certificado de vacunacion");

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setText("Ver esquema de vacunacion");

        jLabel3.setText("Certificado covid 19");

        jLabel4.setText("Visualiza y descarga tu certificado de");

        jLabel5.setText("Vacunacion COVID-19");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setText("Ver pasaporte COVID-19 UE");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Pasaporte COVID-19");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("de la Union Europea");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout PanelDatos3Layout = new javax.swing.GroupLayout(PanelDatos3);
        PanelDatos3.setLayout(PanelDatos3Layout);
        PanelDatos3Layout.setHorizontalGroup(
            PanelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatos3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PanelDatos3Layout.setVerticalGroup(
            PanelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatos3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        Pqr.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setBackground(new java.awt.Color(255, 255, 0));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/qr.png"))); // NOI18N
        jLabel24.setOpaque(true);

        lblNombre.setText("Nombre");

        lblDni.setText("DNI:");

        jSeparator1.setForeground(new java.awt.Color(255, 153, 51));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 255));
        jLabel27.setText("VACUNACIÓN COVID-19");

        lblNumeroDosis.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblNumeroDosis.setForeground(new java.awt.Color(255, 153, 51));
        lblNumeroDosis.setText("NUMERO DE DOSIS");

        jPanel5.setBackground(new java.awt.Color(255, 153, 51));
        jPanel5.setForeground(new java.awt.Color(255, 153, 51));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Dosis");

        Check2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 5, true));
        Check2.setOpaque(true);

        Check1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 5, true));
        Check1.setOpaque(true);

        Check4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 5, true));
        Check4.setOpaque(true);

        Check3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 5, true));
        Check3.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addGap(45, 45, 45)
                .addComponent(Check1)
                .addGap(18, 18, 18)
                .addComponent(Check2)
                .addGap(18, 18, 18)
                .addComponent(Check3)
                .addGap(18, 18, 18)
                .addComponent(Check4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Check4)
                    .addComponent(Check2)
                    .addComponent(Check1)
                    .addComponent(Check3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblEdad.setText("Edad:");

        javax.swing.GroupLayout PqrLayout = new javax.swing.GroupLayout(Pqr);
        Pqr.setLayout(PqrLayout);
        PqrLayout.setHorizontalGroup(
            PqrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PqrLayout.createSequentialGroup()
                .addGroup(PqrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PqrLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(PqrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumeroDosis)
                            .addComponent(jLabel27)))
                    .addGroup(PqrLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PqrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PqrLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(PqrLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblDni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        PqrLayout.setVerticalGroup(
            PqrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PqrLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblNombre)
                .addGap(28, 28, 28)
                .addGroup(PqrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(lblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumeroDosis)
                .addGap(33, 33, 33)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnVolver)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pqr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(PanelDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pqr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar3ActionPerformed

        // Cerrar la sesión (por ejemplo, volver a la ventana de inicio de sesión)
        dispose(); // Cerrar la ventana actual
        Carnet carnet = new Carnet(); // Crear una nueva instancia de la interfaz Carnet
        carnet.setVisible(true); // Mostrar la interfaz Carnet
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrar3ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        // Cerrar la ventana actual y abrir la interfaz Vacuna
        dispose(); // Cerrar la ventana actual
        Vacuna vacuna = new Vacuna(); // Crear una nueva instancia de la interfaz Vacuna
        vacuna.setVisible(true); // Mostrar la interfaz Vacuna
          // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Check1;
    private javax.swing.JCheckBox Check2;
    private javax.swing.JCheckBox Check3;
    private javax.swing.JCheckBox Check4;
    private javax.swing.JPanel Encabezado3;
    private javax.swing.JPanel PanelDatos3;
    private javax.swing.JPanel Pqr;
    private javax.swing.JButton btnCerrar3;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroDosis;
    // End of variables declaration//GEN-END:variables
}
