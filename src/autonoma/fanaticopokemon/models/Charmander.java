/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.fanaticopokemon.models;

/**
 *
 * @autor Juan Sebastian Lopez
 * @since 29032025
 * @version 1.0
 */
public class Charmander extends Pokemon implements PokemonFuego{

    public Charmander(String nombre) {
        super(nombre);
    }
    
    
    @Override
    public String atacarPinioFuego() {
        return "Soy " + getNombre() + " y estoy atacando con Pinion Fuego";
    }

    @Override
    public String atacarAscuas() {
        return "Soy " + getNombre() + " y estoy atacando con Ascuas";
    }

    @Override
    public String atacarLanzaLlamas() {
        return "Soy " + getNombre() + " y estoy atacando con Lanzallamas";
    }

    @Override
    public String atacarPlacaje() {
        return "Soy " + getNombre() + " y estoy atacando con Placaje";
    }

    @Override
    public String atacarAraniazo() {
        return "Soy " + getNombre() + " y estoy atacando con Arañazo"; 
    }

    @Override
    public String atacarMordisco() {
        return "Soy " + getNombre() + " y estoy atacando con Mordisco";
    }

    
}
