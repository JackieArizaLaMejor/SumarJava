/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumardosnumeros;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class SumarDosNumeros {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("SUMA!");
        int Resultado = SumarNumeros();
        System.out.println("Resultado Suma: " + Resultado);
    }
    
    public static int SumarNumeros(){
    System.out.println("Numero Uno!");
    int VariableUno = sc.nextInt();
    System.out.println("Numero Dos!");
    int VariableDos = sc.nextInt();
    
    int Resultado;
    Resultado = VariableUno+VariableDos;
        return Resultado;
          
          
    }
}
