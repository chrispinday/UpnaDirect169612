/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class Presentador {
    private IVista vista;
    private Cliente cliente;
    
    public Presentador(IVista vista) {
        this.vista = vista;
    }
    
    public void admitirCliente() {
        int anioNac = this.vista.consultarAnioNacimiento();
        double salario = this.vista.consultarSalario();
    }
    
    public void admitirBien() {
        TipoBien tipoBien = this.vista.consultarTipoBien();
        double valor = this.vista.consultarValor();
    }
    
    public void mostrarMejorOferta() {
        
    }
    
    
    
}
