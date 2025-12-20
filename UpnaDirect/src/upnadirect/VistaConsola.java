/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class VistaConsola implements IVista{
    private final String ANSI_PURPLE = "\u001B[35m";
    private final String ANSI_RED = "\u001B[31m";
    private final String ANSI_RESET = "\u001B[0m";
    private final Scanner scanner = new Scanner(System.in);
    
    @Override
    public int consultarAnioNacimiento() {
        System.out.print("//Introduzca el año de nacimiento del cliente> ");
        String respuesta = scanner.nextLine();
        return Integer.parseInt(respuesta);
    }

    @Override
    public double consultarSalario() {
        System.out.print("//Introduzca el salario del cliente> ");
        String respuesta = scanner.nextLine();
        return Double.parseDouble(respuesta);
    }

    @Override
    public TipoBien consultarTipoBien() {
        while(true) {
            System.out.print("//Introduzca el tipo de bien (VEHICULO / VIVIENDA) >");
            String entrada = scanner.nextLine().trim().toUpperCase();
            try {
                return TipoBien.valueOf(entrada);
            } catch (IllegalArgumentException e) {
                System.out.println("\t//❌ Opción inválida. Intente nuevamente");
            }
        }
    }

    @Override
    public double consultarValor() {
        System.out.print("//Introduzca el valor del bien> ");
        String respuesta = scanner.nextLine();
        return Double.parseDouble(respuesta);
    }

    @Override
    public void imprimirMensaje(String mensaje) {
        System.out.println("// " + mensaje);
    }
    
    @Override
    public void imprimirError(String mensaje) {
        System.out.println(ANSI_RED + "// " + mensaje + ANSI_RESET);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("");
        System.out.println("");
        System.out.println(ANSI_PURPLE + "//----------------MENU----------------");
        System.out.println(ANSI_PURPLE + "//1-Registrar cliente");
        System.out.println(ANSI_PURPLE + "//2-Registrar bien");
        System.out.println(ANSI_PURPLE + "//3-Calcular mejor oferta para el cliente y bien");
        System.out.println(ANSI_PURPLE + "//4-Salir");
        System.out.println("//------------------------------------" + ANSI_RESET);
    }

    @Override
    public int obtenerOpcion() {
        System.out.print("//Introduzca opcion> ");
        String respuesta = scanner.nextLine();
        return Integer.parseInt(respuesta);
    }
    
}
