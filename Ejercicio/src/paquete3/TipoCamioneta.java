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
public class TipoCamioneta extends Auto {

    private double porcentaje;
    private double valor;
    private double seguro;

    public TipoCamioneta(double por, Comprador p, String m, double pb) {
        super(p, m, pb);
        porcentaje = por;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + valor + seguro;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    public void establecerPorcentaje(double x) {
        porcentaje = x;
    }

    public double obtenerValor() {
        return valor;
    }

    public void establecerValor() {
        valor = precioBase * (porcentaje / 100);
    }

    public double obtenerSeguro() {
        return seguro;
    }

    public void establecerSeguro() {
        seguro = valor * 1.5;
    }

    @Override
    public String toString() {
        String cadena = String.format("Tipo Camioneta\n%s\nPorcentaje de "
                + "importacion: %.2f\nValor fijo de importacion: %.2f\nSeguro "
                + "de mantenimiento: %.2f\nPrecio Final: %.2f\n",
                super.toString(), porcentaje, valor, seguro, precioFinal);
        return cadena;
    }

}
