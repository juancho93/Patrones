/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones;

import java.util.ArrayList;

/**
 * 
 * @author Alex Gomez
 */
public class Suma implements Operacion{
    private int numero = 0;
    @Override
    public int realizarOperacion(ArrayList lista) {
        lista.stream().forEach((lista1) -> {
            numero = numero + (Integer)lista1;
        });
        
        System.out.println("El resultado de la suma es " + numero);
        return numero;
    } 

}
