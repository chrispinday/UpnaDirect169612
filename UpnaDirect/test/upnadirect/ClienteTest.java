/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package upnadirect;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void constructorValido_creaClienteCorrectamente() {
        // Arrange
        int anioNacimiento = 1990;
        double salario = 50000.0;

        // Act
        Cliente cliente = new Cliente(anioNacimiento, salario);

        // Assert
        assertEquals(salario, cliente.getSalario(), 0.001);
        assertEquals(LocalDate.now().getYear() - anioNacimiento,cliente.getEdad());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorConAnioInvalido_lanzaExcepcion() {
        // Arrange
        int anioNacimientoInvalido = 1800;
        double salario = 30000.0;

        // Act
        new Cliente(anioNacimientoInvalido, salario);

        // Assert
    }
    
}
