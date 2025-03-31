/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 * Modelo que permite representar un pokemon de agua
 * @author Mariana
 * @since 20250331
 * @version 1.0
 */
public interface PokemonAgua {
    
    
    /**
     * Modela el metodo de atacar hidrobomba
     * @return String 
    */
    public abstract String atacarHidroBommba();
    
    /**
     * Modela el metodo de atacar pistola agua
     * @return String 
    */
    public abstract String atacarPistolaAgua();
    
    /**
     * Modela el metodo de atacar burbuja
     * @return String 
    */
    public abstract String atacarBurbuja();
    
    /**
     * Modela el metodo de atacar hidropulso
     * @return String 
    */
    public abstract String atacarHidroPulso();
    
}
