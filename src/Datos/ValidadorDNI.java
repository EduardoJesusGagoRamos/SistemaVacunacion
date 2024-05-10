
package Datos;

/**
 *
 * @author Usuario
 */
public class ValidadorDNI {
    public static boolean validarDNI(String dni) {
            // Validar el formato del DNI (8 dígitos)
            if (!dni.matches("\\d{8}")) {
                return false;
            }
            // Validar el número de DNI según algoritmo
            int dniNum = Integer.parseInt(dni.substring(0, 8));
            int modulo = dniNum % 23;
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letraEsperada = letras.charAt(modulo);
            return dni.charAt(8) == letraEsperada;
        }
    }