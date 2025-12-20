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
public class MafroTest {
    
    public MafroTest() {
    }

    @Test
    public void clienteMenor20YVehiculo_ObtieneImporte500YComision5() {
        // Arrange
        Aseguradora mafro = new Mafro();
        Cliente cliente = new Cliente(2007, 25000);
        Bien bien = new Bien(TipoBien.VEHICULO, 10000);
        // Act
        Oferta oferta = mafro.obtenerOferta(cliente, bien);
        // Assert
        assertEquals(500, oferta.getImporte(), 0.001);
        assertEquals(5,oferta.getComision());
    }
    @Test
    public void clienteSalarioMenor20000ViviendaValorMAyor200000_ObtieneImporte6000YComision180() {
        // Arrange
        Aseguradora mafro = new Mafro();
        Cliente cliente = new Cliente(2007, 18000);
        Bien bien = new Bien(TipoBien.VIVIENDA, 300000);
        // Act
        Oferta oferta = mafro.obtenerOferta(cliente, bien);
        // Assert
        assertEquals(6000, oferta.getImporte(), 0.001);
        assertEquals(180,oferta.getComision());
    }
    
}
