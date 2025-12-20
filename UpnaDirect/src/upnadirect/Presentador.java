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
    private ServicioOfertas servicioOfertas;
    private Cliente cliente;
    private Bien bien;
    
    public Presentador(IVista vista, ServicioOfertas servicioOfertas) {
        this.vista = vista;
        this.servicioOfertas = servicioOfertas;
    }
    
    public void admitirCliente() {
        int anioNac = this.vista.consultarAnioNacimiento();
        double salario = this.vista.consultarSalario();
        try {
            this.cliente = new Cliente(anioNac, salario);
            this.vista.imprimirMensaje("Cliente registrado con éxito");
        } catch(IllegalArgumentException e) {
            cliente = null;
            this.vista.imprimirError(e.getMessage());
        }
    }
    
    public void admitirBien() {
        TipoBien tipoBien = this.vista.consultarTipoBien();
        double valor = this.vista.consultarValor();
        try {
            this.bien = new Bien(tipoBien, valor);
            this.vista.imprimirMensaje("bien registrado con éxito");
        } catch(IllegalArgumentException e) {
            bien = null;
            this.vista.imprimirError(e.getMessage());
        }
    }
    
    public void calcularMejorOferta() {
        if (this.cliente == null || this.bien == null) {
            this.vista.imprimirError("Debes registrar primero el usuario y el bien");
        }
        Oferta oferta = servicioOfertas.obtenerMejorOferta(this.cliente, this.bien);
        this.vista.imprimirMensaje("La mejor oferta para el cliente " + "(edad: " + cliente.getEdad() + ", salario: " 
                + cliente.getSalario() + " ) y bien (tipo: " + bien.getTipo() +  ", valor: " + bien.getValor() + ") es...");
        this.vista.imprimirMensaje(oferta.getNombreAsegurador() + " | " + oferta.getImporte() + " | " + oferta.getComision());
        resetClienteYBien();
    }

    private void resetClienteYBien() {
        this.cliente = null;
        this.bien = null;
    }
    
    public void ejecutar() {
        int opcion = 0;
        while (opcion != 4) {
            this.vista.mostrarMenu();
            opcion = this.vista.obtenerOpcion();
            switch (opcion) {
                case 1: admitirCliente();
                    break;
                case 2: admitirBien();
                    break;
                case 3: calcularMejorOferta();
                    break;
                case 4: this.vista.imprimirMensaje("Se pulso salir (4)");;
                    break;
                default: this.vista.imprimirMensaje("Introduzca opcion valida");
                    break;
            }
        }
        this.vista.imprimirMensaje("Fin del programa!!!");
    }
    
}
