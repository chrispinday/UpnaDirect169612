/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package upnadirect;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class LineaIndirectaTest {
    
    public LineaIndirectaTest() {
    }

    @Test
    public void clienteVehiculoMenor20000_ObtieneImporte600YComision6() {
        // Arrange
        Aseguradora linea = new LineaIndirecta();
        Cliente cliente = new Cliente(2001, 25000);
        Bien bien = new Bien(TipoBien.VEHICULO, 15000);
        // Act
        Oferta oferta = linea.obtenerOferta(cliente, bien);
        // Assert
        assertEquals(600, oferta.getImporte(), 0.001);
        assertEquals(6,oferta.getComision());
    }
    @Test
    public void clienteViviendaMenor150000_ObtieneImporte4000YComision160() {
        // Arrange
        Aseguradora linea = new LineaIndirecta();
        Cliente cliente = new Cliente(2001, 25000);
        Bien bien = new Bien(TipoBien.VIVIENDA, 100000);
        // Act
        Oferta oferta = linea.obtenerOferta(cliente, bien);
        // Assert
        assertEquals(4000, oferta.getImporte(), 0.001);
        assertEquals(160,oferta.getComision());
    }
    
}
