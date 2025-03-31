/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 *
 * @author maria
 */
public class Squirtle extends Pokemon implements PokemonAgua {

    public Squirtle(String numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    
    
    @Override
    public String atacarPlacaje() {
       return "soy squirtle y estoy atacando con placaje";
    }

    @Override
    public String atacarArañazo() {
       return "soy squirtle y estoy atacando con arañazo";
        
    }

    @Override
    public String atacarMordisco() {
        return "soy squirtle y estoy atacando con mordisco";
    }

    @Override
    public String atacarHidroBommba() {
        return "soy squirtle y estoy atacando con hidrobomba";
    }

    @Override
    public String atacarPistolaAgua() {
        return "soy squirtle y estoy atacando con pistola de agua";
    }

    @Override
    public String atacarBurbuja() {
        return "soy squirtle y estoy atacando con burbuja";
    }

    @Override
    public String atacarHidroPulso() {
          return "soy squirtle y estoy atacando con hidropulso";
    }
    
}
