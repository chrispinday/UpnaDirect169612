/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class UpnaDirect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aseguradora mafro = new Mafro();
        Aseguradora lineaIndirecta = new LineaIndirecta();
        Aseguradora adasles = new Adasles();
        ServicioOfertas servicioOfertas = new ServicioOfertas(mafro, lineaIndirecta, adasles);
        
        Presentador presentador = new Presentador(new VistaConsola(), servicioOfertas);
        presentador.ejecutar();
    }
    
}
