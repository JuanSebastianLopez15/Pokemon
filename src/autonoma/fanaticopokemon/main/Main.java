/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.fanaticopokemon.main;

import autonoma.fanaticopokemon.models.Bulbasaur;
import autonoma.fanaticopokemon.models.Charmander;
import autonoma.fanaticopokemon.models.Pikachu;
import autonoma.fanaticopokemon.models.PokemonAgua;
import autonoma.fanaticopokemon.models.PokemonElectrico;
import autonoma.fanaticopokemon.models.PokemonFuego;
import autonoma.fanaticopokemon.models.PokemonPlanta;
import autonoma.fanaticopokemon.models.Squirtle;

/**
 * @autor Juan Sebastian Lopez Guzman
 * @since 28032025
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Pokémon
        PokemonFuego charmander = new Charmander("Charmander");
        PokemonPlanta bulbasaur = new Bulbasaur("Bulbasaur");
        PokemonAgua squirtle = new Squirtle("Squirtle");
        PokemonElectrico pikachu = new Pikachu("Pikachu");

        // Ataques de Charmander
        System.out.println(charmander.atacarAscuas());
        System.out.println(charmander.atacarLanzaLlamas());
        System.out.println(charmander.atacarPinioFuego());

        // Ataques de Bulbasaur
        System.out.println(bulbasaur.atacarParalizar());
        System.out.println(bulbasaur.atacarHojaAfilada());
        System.out.println(bulbasaur.atacarLatigoCepa());
        System.out.println(bulbasaur.atacarDrenaje());

        // Ataques de Squirtle
        System.out.println(squirtle.atacarBurbuja());
        System.out.println(squirtle.atacarHidroBomba());
        System.out.println(squirtle.atacarHidropulso());
        System.out.println(squirtle.atacarPostolaAgua());

        // Ataques de Pikachu
        System.out.println(pikachu.atacarImpactrueno());
        System.out.println(pikachu.atacarPunioTrueno());
        System.out.println(pikachu.atacarRayo());
        System.out.println(pikachu.atacarRayoCarga());
    }
}
