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
public class TipoSedan extends Auto {

    private double porcentajeDescuento;
    private double descuento;
    private double seguro;

    public TipoSedan(double pd, Comprador p, String m, double pb) {
        super(p, m, pb);
        porcentajeDescuento = pd;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase - descuento + seguro;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double x) {
        porcentajeDescuento = x;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    public void establecerDescuento() {
        descuento = precioBase * (porcentajeDescuento / 100);
    }

    public double obtenerSeguro() {
        return seguro;
    }

    public void establecerSeguro() {
        seguro = precioBase * 0.01;
    }

    @Override
    public String toString() {
        String cadena = String.format("Tipo Sedan\n%s\nPorcentaje de "
                + "descuento: %.2f\nDescuento: %.2f\nSeguro de mecanico: "
                + "%.2f\nPrecio Final: %.2f\n", super.toString(),
                porcentajeDescuento, descuento, seguro, precioFinal);
        return cadena;
    }

}
