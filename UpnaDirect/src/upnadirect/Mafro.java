/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class Mafro extends Aseguradora {

    public Mafro() {
        super("Mafro");
    }

    @Override
    protected double calcularImporte(Cliente cliente, Bien bien) {
        double importe;
        if (bien.getTipo() == TipoBien.VEHICULO && cliente.getEdad() < 20) {
            importe = 0.05 * bien.getValor();
        }
        else if (bien.getTipo() == TipoBien.VIVIENDA && bien.getValor() > 200000 
                && cliente.getSalario() < 20000) {
            importe = 0.02 * bien.getValor();
        }
        else {
            importe = 0.03 * bien.getValor();
        }
        return importe;
    }

    @Override
    protected int calcularComision(double importe) {
        int comision;
        if (importe <= 1000) {
            comision =  (int)Math.floor(0.1 * importe);
        }else {
            comision =  (int)Math.floor(0.3 * importe);
        }
        return comision;
    }
    
}
