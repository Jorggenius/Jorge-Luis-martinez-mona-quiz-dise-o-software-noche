/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import exception.InvalidUserDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Moto;
import repository.MotoRepository;
import validator.MotoValidator;

/**
 *
 * @author JORGE
 */
public class MotoService {

    private MotoRepository motoRepository = new MotoRepository();

    public Moto getMotoById(int id) throws SQLException {
        return motoRepository.findById(id);
    }

    public ArrayList<Moto> getMotos() throws SQLException {
        return motoRepository.findAll();
    }

    public void deleteMoto(int id) throws SQLException {
        motoRepository.delete(id);
    }

    public void createMoto(String marca, int cilindraje, int precio, String color) throws SQLException, InvalidUserDataException {
        if (!MotoValidator.validateMarca(marca)
                || !MotoValidator.validateCilindraje(cilindraje) || !MotoValidator.validatePrecio(precio)
                || !MotoValidator.validateColor(color)) {
            throw new InvalidUserDataException("Invalid user data");
        }
        Moto moto = new Moto(marca, cilindraje, precio, color);
        motoRepository.save(moto);
    }

    public void updateMoto(int id, String marca, int cilindraje, int precio, String color) throws SQLException, InvalidUserDataException {
        if (!MotoValidator.validateMarca(marca)
                || !MotoValidator.validateCilindraje(cilindraje)
                || !MotoValidator.validatePrecio(precio)
                || !MotoValidator.validateColor(color)) {
            throw new InvalidUserDataException("Invalid user data");
        }

        Moto moto = new Moto(id, marca, cilindraje, precio, color);
        motoRepository.update(moto);
    }

}
