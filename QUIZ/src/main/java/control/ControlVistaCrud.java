/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import exception.InvalidUserDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Moto;
import service.MotoService;

/**
 *
 * @author JORGE
 */
public class ControlVistaCrud {
    MotoService motoService;
    ArrayList<Moto> motos;

    public ControlVistaCrud() throws SQLException {
        motoService = new MotoService();
        motos = motoService.getMotos();
    }
    
    public void createMoto(Moto moto)throws SQLException, InvalidUserDataException{
        motoService.createMoto(moto.getMarca(), moto.getCilindraje(), moto.getPrecio(), moto.getColor());
    }

    public ArrayList<Moto> getMotos() {
        return motos;
    }
    
    public void delete(int id) throws SQLException{
        motoService.deleteMoto(id);
    }
    
    public  void upDate(int id, String marca, int cilindraje, int precio, String color) throws SQLException, InvalidUserDataException{
        motoService.updateMoto(id, marca, cilindraje, precio, color);
    }
   
    public ArrayList<Moto> motosSql() throws SQLException{
        ArrayList<Moto> m = motoService.getMotos();
        return m;
    }
}
