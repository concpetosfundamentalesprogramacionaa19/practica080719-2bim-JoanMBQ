/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

/**
 *
 * @author TIMO
 */
public class Principal {

    public static void main(String[] args) {
        int num[] = {10, 20, 30, 1, 2, 3, 40, 4};
        int arreglo = Arreglo.obtenerTamanioArreglo(num, 8);
        int arreglo2 = Arreglo.obtenerSumaArreglo(num, 8);
        System.out.printf("La suma del metodo 1 es: %s\n"
                + "La suma del metodo 2 es: %s\n", arreglo, arreglo2);
    }
}