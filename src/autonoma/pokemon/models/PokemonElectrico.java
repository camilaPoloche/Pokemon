/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 * Modelo que permite representar un pokemon electrico
 * @author Mariana
 * @since 20250331
 * @version 1.0
 */
public interface PokemonElectrico {
    
    /**
     * Modela el metodo de atacar impacto trueno
     * @return String 
    */
    public abstract String atacarImpacTrueno();
    
    /**
     * Modela el metodo de atacar puño trueno
     * @return String 
    */
    public abstract String atacarPunioTrueno();
    
    /**
     * Modela el metodo de atacar rayo
     * @return String 
    */
    
    public abstract String atacarRayo();
    
    /**
     * Modela el metodo de atacar rayo carga
     * @return String 
    */
    
    public abstract String atacarRayoCarga();
    
}
