/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class VistaFalsa implements IVista{

    private int anioNacimiento;
    private double salario;
    private TipoBien tipo;
    private double valor;
    
    private String mensaje;//adicional
    
    
    public VistaFalsa(int anioNacimiento, double salario, TipoBien tipo, double valor) {
        this.anioNacimiento = anioNacimiento;
        this.salario = salario;
        this.tipo = tipo;
        this.valor = valor;
        
        this.mensaje = "";
    }

    @Override
    public int consultarAnioNacimiento() {
        return this.anioNacimiento;
    }

    @Override
    public double consultarSalario() {
        return this.salario;
    }

    @Override
    public TipoBien consultarTipoBien() {
        return this.tipo;
    }

    @Override
    public double consultarValor() {
        return this.valor;
    }

    @Override
    public void imprimirMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void mostrarMenu() {
        
    }

    @Override
    public int obtenerOpcion() {
        return 0;
    }

    @Override
    public void imprimirError(String mensaje) {
        
    }
}
