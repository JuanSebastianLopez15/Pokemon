/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.fanaticopokemon.models;

/**
 *
 * @autor Juan Sebastian Lopez Guzman
 * @since 28032025
 * @version 1.0
 */
public class Squirtle extends Pokemon implements PokemonAgua{

    public Squirtle(String nombre) {
        super(nombre);
    }

    @Override
    public String atacarHidroBomba() {
        return "Soy " + getNombre() + " y estoy atacando con HidroBomba";    
    }

    @Override
    public String atacarPostolaAgua() {
        return "Soy " + getNombre() + " y estoy atacando con PistolaAgua";
    }

    @Override
    public String atacarBurbuja() {
        return "Soy " + getNombre() + " y estoy atacando con Burbuja";
    }

    @Override
    public String atacarHidropulso() {
        return "Soy " + getNombre() + " y estoy atacando con Hidropulso";
    }

    @Override
    public String atacarPlacaje() {
        return "Soy " + getNombre() + " y estoy atacando con Placaje";
    }

    @Override
    public String atacarAraniazo() {
        return "Soy " + getNombre() + " y estoy atacando con Araniazo";
    }

    @Override
    public String atacarMordisco() {
        return "Soy " + getNombre() + " y estoy atacando con Mordisco";
    }


    
    
}
