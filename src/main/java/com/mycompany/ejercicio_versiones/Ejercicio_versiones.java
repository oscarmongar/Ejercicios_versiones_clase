/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_versiones;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio_versiones {

   public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [][] num = new int [5][4];
		int fila = 0;
		int sumafilas=0;
		int sumatotal= 0;
		
		
		
		for (int i = 0; i<4; i++) {
			//System.out.print("Fila "+fila+"\t ");
			for (int b = 0; b<5; b++) {
				System.out.println("Introduce un numero");
				 
				num[b][i] = sc.nextInt();
			}
			fila = fila +1;
		}
		
	//	System.out.println( "\tColumna 0\tColumna 1\tColumna 2\tColumna 3\t Columna 4\t Columna 5");
		for (int i = 0; i<4; i++) {
			sumafilas=0;
			System.out.print("Fila \t ");
			for (int b = 0; b<5; b++) {
				sumafilas +=num[b][i];
				System.out.print(num [b][i]+"\t\t ");
			}
			System.out.println("Suma: " +sumafilas);
			sumatotal += sumafilas;
		}
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t Suma Total: " +sumatotal);
	   System.out.println("Incluido por Ivan");
			
   }}
