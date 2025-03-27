/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

/**
 *
 * @author JORGE
 */
public class MotoValidator {

    public static boolean validateMarca(String marca) {
        return marca != null && !marca.trim().isEmpty();
    }

    public static boolean validateCilindraje(Integer cilindraje) {
        return cilindraje != null && cilindraje > 0 && cilindraje < 600;
    }
    public static boolean validatePrecio(Integer precio) {
        return precio != null && precio > 0 && precio < 600;
    }
    
    public static boolean validateColor(String color) {
        return color != null && !color.trim().isEmpty();
    }
}
