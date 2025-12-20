/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class LineaIndirecta extends Aseguradora{

    public LineaIndirecta() {
        super("LINEA INDIRECTA");
    }

    @Override
    protected double calcularImporte(Cliente cliente, Bien bien) {
        double importe;
        if (bien.getTipo() == TipoBien.VEHICULO && bien.getValor()< 20000) {
            importe = 0.04 * bien.getValor();
        }
        else if (bien.getTipo() == TipoBien.VIVIENDA && bien.getValor() < 150000) {
            importe = 0.04 * bien.getValor();
        }
        else if (bien.getTipo() == TipoBien.VEHICULO && bien.getValor() >= 20000
                && cliente.getEdad() > 60) {
            importe = 0.06 * bien.getValor();
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
            comision =  (int)Math.floor(0.01 * importe);
        }else {
            comision =  (int)Math.floor(0.04 * importe);
        }
        return comision;
    }
    
}
