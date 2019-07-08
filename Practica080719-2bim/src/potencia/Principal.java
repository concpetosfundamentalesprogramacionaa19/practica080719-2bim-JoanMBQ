/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

/**
 *
 * @author TIMO
 */
public class Principal {

    public static void main(String[] args) {
        int potencia = Potencia.get_potencia(2, 4);
        System.out.printf("%d\n", potencia);
    }
}