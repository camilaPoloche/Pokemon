/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pokemon.main;

import autonoma.pokemon.models.Bulbasaur;
import autonoma.pokemon.models.Charmander;
import autonoma.pokemon.models.Pikachu;
import autonoma.pokemon.models.Pokemon;
import autonoma.pokemon.models.PokemonAgua;
import autonoma.pokemon.models.PokemonElectrico;
import autonoma.pokemon.models.Squirtle;

/**
 * Modelo que representa el main - inicio
 * @author Camila
 * @since 20250331
 * @version 1.0
 */
public class PokemonInicio {
    public static void main(String[] args) {
        
        Charmander charmander = new Charmander ("2", "Charmander", (float) 3.1, "segunda temporada");
        Pokemon pokemonA = new Charmander ("2","Charmander", (float) 5.0, "Segunda temporada");
        Pokemon pokemonB = new Bulbasaur ("7","Bulbasaur", (float) 4.8,"Primera temporada");
        PokemonAgua pokemonC = new Squirtle ("1", "Squirtle", (float) 2.3,"Primera temporada");
        PokemonElectrico pokemonD = new Pikachu ("9", "Pikachu", (float) 6.2, "primera temporada");
        
      
        System.out.println(charmander.atacarLanzaLlamas()+ "\n") ;
        System. out.println(pokemonA.atacarArañazo ()+ "(n") ;
        System.out.println(pokemonB.atacarMordisco()+ "\n");
        System. out.println (pokemonC.atacarHidroBommba()+ "\n");
        System.out.println(pokemonD.atacarImpacTrueno() + "\n");
       
    }
}
