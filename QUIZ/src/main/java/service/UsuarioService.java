/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import exception.InvalidUserDataException;
import java.sql.SQLException;
import modelo.Usuario;
import repository.UsuarioRepository;
import validator.UsuarioValidator;

/**
 *
 * @author JORGE
 */
public class UsuarioService {
    private UsuarioRepository  usuarioRepository = new UsuarioRepository();
    
    public Usuario getUsuarioById(int id) throws SQLException {
        return usuarioRepository.findById(id);
    }
    
      public void CreateUsuario(String nombre, String contraseña) throws SQLException, InvalidUserDataException {
        if (!UsuarioValidator.validateName(nombre)|| !!UsuarioValidator.validateContraseña(contraseña))
              {
            throw new InvalidUserDataException("Invalid user data");
        }
        Usuario usuario = new Usuario(nombre, contraseña);
        usuarioRepository.save(usuario);
    }
}
