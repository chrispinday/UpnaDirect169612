/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class ProgramaTest {
    
    @Test
    public void clienteNacido2005Salario15000_Vehiculo30000_ObtieneOfertaLineaIndirecta_900_9() {
        // Arrange
        Aseguradora mafro = new Mafro();
        Aseguradora lineaIndirecta = new LineaIndirecta();
        Aseguradora adasles = new Adasles();
        ServicioOfertas servicioOfertas = new ServicioOfertas(mafro, lineaIndirecta, adasles);
        VistaFalsa vistaFalsa = new VistaFalsa(2005, 15000, TipoBien.VEHICULO, 30000);
        Presentador presentador = new Presentador(vistaFalsa, servicioOfertas);
        
        // Act
        presentador.admitirCliente();
        presentador.admitirBien();
        presentador.calcularMejorOferta();
        
        // Assert
        assertEquals("ADASLES | 600 | 6", vistaFalsa.getMensaje());
        //profesor en el enunciado aparecia que debia dar linea indirecta, pero como ya es 2025, el cliente
        //ya no es menor de 20, parece que falto actualizar el enunciado y esta como del 2024 (19 años)
        
    }
    
    
}
