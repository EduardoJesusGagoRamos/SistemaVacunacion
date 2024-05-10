
package Controlador;
import Interfaz.Carnet;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author nefij
 */
public class ControladorCarnet {
     public boolean validarDatos(String documento, String fechaEmision, String fechaNacimiento) {
        // Verificar que el DNI tenga 8 dígitos
        if (documento.length() != 8 || !documento.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI debe tener 8 dígitos.");
            return false;
        }

        // Verificar el formato de la fecha de emisión
        if (!fechaEmision.matches("\\d{2}/\\d{2}/\\d{4}")) {
            JOptionPane.showMessageDialog(null, "Formato de fecha de emisión inválido. Utilice dd/mm/yyyy.");
            return false;
        }

        // Verificar el formato de la fecha de nacimiento
        if (!fechaNacimiento.matches("\\d{2}/\\d{2}/\\d{4}")) {
            JOptionPane.showMessageDialog(null, "Formato de fecha de nacimiento inválido. Utilice dd/mm/yyyy.");
            return false;
        }

        // Validación exitosa
        return true;
    }

    public void guardarDatosEnArchivo(String documento, String fechaEmision, String fechaNacimiento) {
        // Guardar los datos en un archivo de texto
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt", true))) {
            writer.write("DNI: " + documento + ", Fecha de Emisión: " + fechaEmision + ", Fecha de Nacimiento: " + fechaNacimiento);
            writer.newLine();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos en el archivo.");
        }
    }
}
