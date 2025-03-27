/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

/**
 *
 * @author JORGE
 */
public class UsuarioValidator {
     public static boolean validateName(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
     public static boolean validateContraseña(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
}
