/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class Adasles extends Aseguradora{

    public Adasles() {
        super("Adasles");
    }

    @Override
    protected double calcularImporte(Cliente cliente, Bien bien) {
        double importe;
        if (bien.getTipo() == TipoBien.VEHICULO && (cliente.getEdad() < 20 || cliente.getEdad() > 60)) {
            importe = 0.06 * bien.getValor();
        }
        else {
            importe = 0.02 * bien.getValor();
        }
        return importe;
    }
    
    @Override
    protected int calcularComision(double importe) {
        int comision;
        if (importe <= 1000) {
            comision =  (int)Math.floor(0.1 * importe);
        }else {
            comision =  (int)Math.floor(0.5 * importe);
        }
        return comision;
    }
    
}
