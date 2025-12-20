/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

import java.time.LocalDate;


/**
 *
 * @author alumno
 */
class Cliente{
    private int anioNacimiento;
    private double salario;
    
    public Cliente(int anioNacimiento, double salario) {
        validarAnioNacimiento(anioNacimiento);
        this.anioNacimiento = anioNacimiento;
        this.salario = salario;
    }
    
    public int getEdad() {
        return LocalDate.now().getYear() - this.anioNacimiento;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    private void validarAnioNacimiento(int anio) {
        if (anio <= 1900 && anio > LocalDate.now().getYear()) {
            throw new IllegalArgumentException(
                    "El año de nacimiento debe estar dentro del rango <1900 - año actual]"
            );
        }
    }
}
