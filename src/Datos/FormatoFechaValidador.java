
package Datos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Usuario
 */
public class FormatoFechaValidador {
    public static boolean validarFormatoFecha(String fecha) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                sdf.parse(fecha);
                return true;
            } catch (ParseException e) {
                return false;
            }
        }
    }
