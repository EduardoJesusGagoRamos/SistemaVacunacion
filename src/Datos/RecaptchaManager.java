
package Datos;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class RecaptchaManager {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        public static String generarRecaptcha() {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            int length = 8;
            for (int i = 0; i < length; i++) {
                sb.append(CARACTERES.charAt(random.nextInt(CARACTERES.length())));
            }
            return sb.toString();
        }

        public static boolean verificarRecaptcha(String response) {
            // Implementa la lógica de verificación con la API de reCAPTCHA aquí
            // Devuelve true si la respuesta es válida, false en caso contrario
            return true; // Dummy implementation
        }
    }
