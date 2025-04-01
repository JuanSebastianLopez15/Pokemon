/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.fanaticopokemon.models;

/**
 *
 * @autor Juan Sebastian Lopez Guzman y Cristian Salazar Arenas
 * @since 28032025
 * @version 1.0
 */
public class Squirtle extends Pokemon implements PokemonAgua{
    /**
    * Crea una instancia de la clase Squirtle
    *
    * @param nombre Nombre del pokemon
    * @since 28032025
    */
    public Squirtle(String nombre) {
        super(nombre);
    }
    /**
    * Ejecuta el ataque de HidroBomba
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    */
    @Override
    public String atacarHidroBomba() {
        return "Soy " + getNombre() + " y estoy atacando con HidroBomba";    
    }
    /**
    * Ejecuta el ataque de PistolaAgua
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    */
    @Override
    public String atacarPostolaAgua() {
        return "Soy " + getNombre() + " y estoy atacando con PistolaAgua";
    }
    /**
    * Ejecuta el ataque de Burbuja
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    */
    @Override
    public String atacarBurbuja() {
        return "Soy " + getNombre() + " y estoy atacando con Burbuja";
    }
    /**
    * Ejecuta el ataque de Hidropulso
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    */
    @Override
    public String atacarHidropulso() {
        return "Soy " + getNombre() + " y estoy atacando con Hidropulso";
    }
    /**
    * Ejecuta el ataque de Placaje
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    */
    @Override
    public String atacarPlacaje() {
        return "Soy " + getNombre() + " y estoy atacando con Placaje";
    }
    /**
    * Ejecuta el ataque de Arañazo
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    */
    @Override
    public String atacarAraniazo() {
        return "Soy " + getNombre() + " y estoy atacando con Araniazo";
    }
    /**
    * Ejecuta el ataque de Mordisco
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    */
    @Override
    public String atacarMordisco() {
        return "Soy " + getNombre() + " y estoy atacando con Mordisco";
    }


    
    
}
