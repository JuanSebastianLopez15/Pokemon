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
public class Bulbasaur extends Pokemon implements PokemonPlanta{

    public Bulbasaur(String nombre) {
        super(nombre);
    }

    @Override
    public String atacarParalizar() {
        return "Soy " + getNombre() + " y estoy atacando con Paralizar";
    }

    @Override
    public String atacarDrenaje() {
        return "Soy " + getNombre() + " y estoy atacando con Drenaje";
    }

    @Override
    public String atacarHojaAfilada() {
        return "Soy " + getNombre() + " y estoy atacando con Hoja Afilada";
    }

    @Override
    public String atacarLatigoCepa() {
        return "Soy " + getNombre() + " y estoy atacando con LatigoCepa";
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
