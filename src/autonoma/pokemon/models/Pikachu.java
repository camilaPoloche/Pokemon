/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.models;

/**
 *
 * @author maria
 */
public class Pikachu extends Pokemon implements PokemonElectrico {

    public Pikachu(String numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }

    
    @Override
    public String atacarPlacaje() {
         return "soy pikachu y estoy atacando con placaje";
    }

    @Override
    public String atacarArañazo() {
          return "soy pikachu y estoy atacando con arañazo";
    }

    @Override
    public String atacarMordisco() {
          return "soy pikachu y estoy atacando con mordisco";
    }

    @Override
    public String atacarImpacTrueno() {
         return "soy pikachu y estoy atacando con immpacto de trueno";
    }

    @Override
    public String atacarPunioTrueno() {
         return "soy pikachu y estoy atacando con puño de tueno";
    }

    @Override
    public String atacarRayo() {
         return "soy pikachu y estoy atacando con rayo";
    }

    @Override
    public String atacarRayoCarga() {
         return "soy pikachu y estoy atacando con rayo de carga";
    }
    
    

  
    
    
    
    
}
