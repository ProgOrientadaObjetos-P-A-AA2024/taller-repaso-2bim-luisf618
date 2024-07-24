/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete2.Auto;
import paquete2.Comprador;

/**
 *
 * @author utpl
 */
public class TipoSuv extends Auto {

    private double porcentaje;
    private double seguro;

    public TipoSuv(double por, Comprador p, String m, double pb) {
        super(p, m, pb);
        porcentaje = por;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + seguro;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    public void establecerPorcentaje(double x) {
        porcentaje = x;
    }

    public double obtenerSeguro() {
        return seguro;
    }

    public void establecerSeguro() {
        seguro = precioBase * (porcentaje / 100);
    }

    @Override
    public String toString() {
        String cadena = String.format("Tipo Suv\n%s\nPorcentaje de seguro"
                + " para personas: %.2f\nprecio de seguro: %.2f\nPrecio FInal: "
                + "%.2f\n", super.toString(), porcentaje, seguro, precioFinal);
        return cadena;
    }

}
