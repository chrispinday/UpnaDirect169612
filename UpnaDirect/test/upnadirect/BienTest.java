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
public class BienTest {
    
    public BienTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void vehiculoMayor50000NoValido() {
        //Arrange
        TipoBien tipo = TipoBien.VEHICULO;
        double valor = 100000;
        //Act
        Bien bien = new Bien(tipo, valor);
        //Assertt
    }
    @Test(expected = IllegalArgumentException.class)
    public void viviendaMenor50000NoValido() {
        //Arrange
        TipoBien tipo = TipoBien.VIVIENDA;
        double valor = 1000;
        //Act
        Bien bien = new Bien(tipo, valor);
        //Assertt
    }
    @Test
    public void vehiculoMenor50000Valido() {
        //Arrange
        TipoBien tipo = TipoBien.VEHICULO;
        double valor = 12000;
        //Act
        Bien bien = new Bien(tipo, valor);
        //Assert: no hace falta verificar (implicito)
    }
    

    
}
