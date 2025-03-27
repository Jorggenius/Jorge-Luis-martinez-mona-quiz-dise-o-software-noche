/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JORGE
 */
public class Moto {
    int id;
    String marca;
    int cilindraje;
    int precio;
    String color;

    public Moto(int id, String marca, int cilindraje, int precio, String color) {
        this.id = id;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.precio = precio;
        this.color = color;
    }
    public Moto(String marca, int cilindraje, int precio, String color) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.precio = precio;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
