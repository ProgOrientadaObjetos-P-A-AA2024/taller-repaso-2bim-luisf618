/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author utpl
 */
public abstract class Auto {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Auto(Comprador p, String m, double pb) {
        propietario = p;
        marca = m;
        precioBase = pb;
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Comprador x) {
        propietario = x;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public void establecerPrecioBase(double x) {
        precioBase = x;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public abstract void establecerPrecioFinal();

    @Override
    public String toString() {
        String cadena = String.format("%s\nMarca: %s\nPrecio Base: %.2f\n",
                propietario, marca, precioBase);
        return cadena;
    }

}
