/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import paquete2.Comprador;
import paquete2.Auto;
import paquete2.Consecionaria;
import paquete3.TipoCamioneta;
import paquete3.TipoSedan;
import paquete3.TipoSuv;

/**
 *
 * @author utpl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Comprador p1 = new Comprador("Juan Alberto", "1104323676");
        TipoSedan t1 = new TipoSedan(15, p1, "Modelo 1", 15600);
        t1.establecerDescuento();
        t1.establecerSeguro();

        Comprador p2 = new Comprador("Andres Rodrigo", "1104206812");
        TipoSedan t2 = new TipoSedan(12, p2, "Modelo 2", 18900);
        t2.establecerDescuento();
        t2.establecerSeguro();

        Comprador p3 = new Comprador("Kevin Andres", "1123145676");
        TipoSuv t3 = new TipoSuv(12, p3, "Modelo 3", 12300);
        t3.establecerSeguro();

        Comprador p4 = new Comprador("Diego Nicolas", "1108301234");
        TipoCamioneta t4 = new TipoCamioneta(11, p4, "Modelo 4", 23000);
        t4.establecerValor();
        t4.establecerSeguro();

        ArrayList<Auto> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).establecerPrecioFinal();
        }

        Consecionaria c1 = new Consecionaria("DICOA", list);
        c1.establecerVentasTotales();
        c1.establecerCaro();
        c1.establecerBarato();

        System.out.println(c1);

    }

}
