/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public abstract class Aseguradora {
    private String nombre;
    
    public Aseguradora(String nombre) {
        this.nombre = nombre;
    }
    
    protected abstract double calcularImporte(Cliente cliente, Bien bien);
    
    protected abstract int calcularComision(double importe);
    
    public Oferta obtenerOferta(Cliente cliente, Bien bien) {
        double importe;
        int comision;
        importe = calcularImporte(cliente, bien);
        comision = calcularComision(importe);
        return new Oferta(this.nombre, importe, comision);
    }
}
