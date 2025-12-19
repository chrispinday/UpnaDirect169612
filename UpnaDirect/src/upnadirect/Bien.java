/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

/**
 *
 * @author alumno
 */
class Bien {
    private TipoBien tipo;
    private double valor;
    
    public Bien(TipoBien tipo, double valor) {
        validarValor(tipo, valor);
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public TipoBien getTipo() {
        return this.tipo;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    private void validarValor(TipoBien tipo, double valor) {
        if (tipo == TipoBien.VEHICULO && valor > 50000) {
            throw new IllegalArgumentException(
                    "El importe máximo de un vehículo es 50.000"
            );
        }

        if (tipo == TipoBien.VIVIENDA && valor < 50000) {
            throw new IllegalArgumentException(
                    "El importe mínimo de una vivienda es 50.000"
            );
        }
    }
}
