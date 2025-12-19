/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upnadirect;

/**
 *
 * @author alumno
 */
public class ServicioOfertas {
    private Aseguradora mafro;
    private Aseguradora lineaIndirecta;
    private Aseguradora adasles;
    
    public ServicioOfertas(Aseguradora mafro, Aseguradora lineaIndirecta, Aseguradora adasles) {
        this.mafro = mafro;
        this.lineaIndirecta = lineaIndirecta;
        this.adasles = adasles;
    }
    
    public Oferta obtenerMejorOferta(Cliente cliente, Bien bien) {
        Oferta ofertaMafro = mafro.obtenerOferta(cliente, bien);
        Oferta ofertaLineaInd = lineaIndirecta.obtenerOferta(cliente, bien);
        Oferta ofertaAdasles = adasles.obtenerOferta(cliente, bien);
        
        
        
        return null;
    }
}
