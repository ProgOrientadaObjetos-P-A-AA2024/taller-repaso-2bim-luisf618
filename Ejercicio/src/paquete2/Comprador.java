/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public class Comprador {

    private String nombres;
    private String cedula;

    public Comprador(String n, String c) {
        nombres = n;
        cedula = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerNombres(String x) {
        nombres = x;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Propietario:\nNombre: %s\nCedula: %s\n",
                nombres, cedula);
        return cadena;
    }

}
