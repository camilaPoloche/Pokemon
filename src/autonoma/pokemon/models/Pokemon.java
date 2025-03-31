/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 *
 * @author maria
 */
public abstract class Pokemon {
    
    private String numPokedex;
    private String nombre;
    private float peso;
    private String temporada;

    public Pokemon(String numPokedex, String nombre, float peso, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }

    public String getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(String numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    
    public abstract String atacarPlacaje();
    
    public abstract String atacarArañazo();
    
    public abstract String atacarMordisco();
}
