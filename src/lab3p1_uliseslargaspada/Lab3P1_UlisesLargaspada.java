/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_uliseslargaspada;

import java.util.Scanner;

/**
 *
 * @author ularg
 */
public class Lab3P1_UlisesLargaspada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-- Bienvenido a la app que resuelve diversos ejercicios --");
        
        // Initialize scanner
        Scanner entry = new Scanner(System.in);
        
        do {
            System.out.println("-- Elija una opcion del siguiente menu: --");
            System.out.println("1 - Cadena Repetida");
            System.out.println("2 - Sumatoria");
            System.out.println("3 - Reloj");
            System.out.println("4 - Salir");
            
            // Pedir Entrada
            int option = entry.nextInt();
            
            // Switch para resolver los ejercicios 
            switch (option) {
                case 1:
                    System.out.println("Bienvenido a Cadena Repetida");
                    System.out.println("Ingrese una cadena con puntos para calcular sus repeticiones");
                    System.out.println("(Que su cadena no tenga espacios)");
                    
                    // Solicitar Cadena
                    entry.nextLine();
                    String cadena1 = entry.nextLine();
                    
                    if (cadena1.contains(" ")) {
                        System.out.println("Ingrese una combinacion sin espacios");
                        System.out.println();
                    } else {
                        // Size
                        int size = cadena1.length();
                        
                        String result = "";
                        
                        String palabra = "";
                                                
                        String puntos = "";
                                                                        
                        for (int i = 0; i < size; i++) {
                            palabra = palabra + cadena1.charAt(i);
                            
                            // Chequear donde hay puntos
                            if (palabra.contains(".")) {
                                
                                puntos = puntos + cadena1.charAt(i);
                                                             
                                if (i+1 == size) {
                                    palabra = palabra.substring(0, (palabra.length() - puntos.length()));

                                    // Sumar la palabra al resultado
                                    for (int z = 0; z < puntos.length(); z++) {
                                        result = result + palabra;
                                    }
                                    
                                    palabra = "";
                                    puntos = "";
                                } else if(puntos.contains("")) {
                                    palabra = palabra.substring(0, (palabra.length() - puntos.length()));
                                    // Sumar la palabra al resultado
                                    for (int z = 0; z < puntos.length() - 1; z++) {
                                        result = result + palabra;
                                    }
                                    
                                    palabra = "";
                                    puntos = "";
                                }
                            }
                            
                            
                        }
                        
                        System.out.println("El resultado es: " + result);
                        
                    }
                    
                    break;
                    
                case 2:
                    System.out.println("Bienvenido a sumatoria");
                    System.out.print("Ingrese un entero como limite de la sumatoria: ");
                    
                    // Entrada
                    int K = entry.nextInt();
                    
                    // Resultado
                    double resultado = 0;
                    
                    // Caldulo del resultado
                    for(int i = 1; i <= K; i++) {
                        // Primera Suma
                        double suma1 = 2*i + 1;
                        
                        // Factorial
                        double factorialLimite = i*i + 3;
                        double factorial = 1;
                        for(int j = 1; j <= factorialLimite; j++) {
                            factorial = factorial*j;
                        }
                        
                        // potencia
                        double potencia = i;
                        for (int z = 1; z < K; z++) {
                            potencia = potencia * i;
                        }                        
                           
                        resultado = resultado + (suma1*potencia)/factorial;
                    }
                    
                    System.out.println("El resultado es: " + resultado);
                    
                    break;
                    
                case 3:
                    System.out.println("Bienvenido al ejercicio de Reloj");
                    System.out.println("Por favor, ingrese la altura del reloj: ");
                    
                    // Solicitar altura
                    int altura = entry.nextInt();

                    // Realizar figura 
                    // Upper part
                    for (int i = 1; i <= altura; i++) {
                        for (int j = 1; j < i ; j++){
                            System.out.print(" ");
                        }
                        for(int z = i; z <= altura ; z++ ) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    
                    // Lower Part 
                    for (int i = altura - 1; i >= 1; i--) {
                        for(int j = 1; j < i; j++){
                            System.out.print(" ");
                        }
                        for(int z = i; z <= altura; z++ ) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    
                    break;
                    
                default:
                    System.out.println("Porfavor seleccione una option de las anteriores");
            }
            
            // Salir del programa 
            if (option == 4) {
                break;
            }
        } while(true);

        
    }
    
}
