/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liconex_g13;

import java.util.Scanner;

/**
 *
 * @author hugoa
 */
public class LICONEX_G13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        menuPrincipal();
        opcion = entrada.nextInt();
        System.out.println();
        System.out.println();
        while (opcion != 9) {
            switch (opcion) {
                case 1:
                    //codigo para examen de moto
                    break;
                case 2:
                    //codigo para examen de auto
                    break;
                case 3:
                    menuConsulta();
                    opcion = entrada.nextInt();
                    System.out.println();
                    System.out.println();

                    while (opcion != 9) {
                        switch (opcion) {
                            case 1:
                                //codigo para examen por dni
                                break;
                            case 2:
                                //codigo para examen de moto por fecha
                                break;
                            case 3:
                                // codigo para examen de auto por fecha
                                break;
                            case 4:
                                //consulta opcional
                                break;
                            case 9: {

                                break;
                            }
                            default:
                                System.out.println("    INGRESE UNA OPCION VALIDA");
                                System.out.println();
                                System.out.println();
                                menuConsulta();
                                opcion = entrada.nextInt();
                                System.out.println();
                                System.out.println();
                                break;
                        }
                       

                    }
                    
                    menuPrincipal();
                    opcion = entrada.nextInt();
                    System.out.println();
                    System.out.println();
                                
                                break;
                case 9:
                    break;

                default:
                    System.out.println("    INGRESE UNA OPCION VALIDA");
                    System.out.println();
                    System.out.println();
                    menuPrincipal();
                    opcion = entrada.nextInt();
                    System.out.println();
                    System.out.println();
            }
        }
    }
 public static void menuPrincipal() {
        System.out.println("     LICENCIAS DE CONDUCIR");
        System.out.println("         Menú Principal");
        System.out.println("===============================");
        System.out.println("   1.- Registrar Examen MOTO");
        System.out.println("   2.- Registrar Examen AUTO");
        System.out.println("   3.- Consultas");
        System.out.println();
        System.out.println("   9.- Cerrar la aplicación");
        System.out.println();
        System.out.print("   Ingrese una opción: ");

    }

    public static void menuConsulta() {
        System.out.println("     LICENCIAS DE CONDUCIR");
        System.out.println("         Menú Consultas");
        System.out.println("================================");
        System.out.println("   1.- Examen por DNI");
        System.out.println("   2.- Examen de moto por FECHA");
        System.out.println("   3.- Examen de auto por FECHA");
        System.out.println("   4.- Consulta opcional");
        System.out.println();
        System.out.println("   9.- volver al menú anterior");
        System.out.println();
        System.out.print("   Ingrese una opción: ");

    }   
}

