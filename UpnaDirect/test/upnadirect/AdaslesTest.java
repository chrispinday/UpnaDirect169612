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
public class AdaslesTest {
    
    public AdaslesTest() {
    }
    
    @Test
    public void clienteMenor20_Vehiculo_ObtieneImporte1800YComision90() {
        // Arrange
        Aseguradora adasles = new Adasles();
        Cliente cliente = new Cliente(2007, 25000);
        Bien bien = new Bien(TipoBien.VEHICULO, 30000);
        // Act
        Oferta oferta = adasles.obtenerOferta(cliente, bien);
        // Assert
        assertEquals(1800, oferta.getImporte(), 0.001);
        assertEquals(90,oferta.getComision());
    }
    
    @Test
    public void clienteMayor20_Vehiculo_ObtieneImporte600YComision6() {
        // Arrange
        Aseguradora adasles = new Adasles();
        Cliente cliente = new Cliente(1990, 25000);
        Bien bien = new Bien(TipoBien.VEHICULO, 30000);
        // Act
        Oferta oferta = adasles.obtenerOferta(cliente, bien);
        // Assert
        assertEquals(600, oferta.getImporte(), 0.001);
        assertEquals(6,oferta.getComision());
    }
    
}
