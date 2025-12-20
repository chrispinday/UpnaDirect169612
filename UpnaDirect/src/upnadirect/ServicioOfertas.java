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
        Oferta ofMafro = mafro.obtenerOferta(cliente, bien);
        Oferta ofLineaInd = lineaIndirecta.obtenerOferta(cliente, bien);
        Oferta ofAdasles = adasles.obtenerOferta(cliente, bien);
        
        Oferta menor = ofMafro;
        if (esMenor(ofLineaInd, menor)) {
            menor = ofLineaInd;
        }
        if (esMenor(ofAdasles, menor)) {
            menor = ofAdasles;
        }
        
        return menor;
    }
    
    private static boolean esMenor(Oferta a, Oferta b) {
        if (a.getImporte() < b.getImporte()) {
            return true;
        }
        if (a.getImporte() == b.getImporte() &&
            a.getComision() > b.getComision()) {
            return true;
        }
        return false;
    }
}
