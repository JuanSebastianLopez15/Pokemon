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
public class Pikachu extends Pokemon implements PokemonElectrico {

    public Pikachu(String nombre) {
        super(nombre);
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

    @Override
    public String atacarImpactrueno() {
        return "Soy " + getNombre() + " y estoy atacando con Impactrueno";
    }

    @Override
    public String atacarPunioTrueno() {
        return "Soy " + getNombre() + " y estoy atacando con PunioTrueno"; 
    }

    @Override
    public String atacarRayo() {
        return "Soy " + getNombre() + " y estoy atacando con Rayo";
    }

    @Override
    public String atacarRayoCarga() {
        return "Soy " + getNombre() + " y estoy atacando con RayoCarga";
    }
    
}
