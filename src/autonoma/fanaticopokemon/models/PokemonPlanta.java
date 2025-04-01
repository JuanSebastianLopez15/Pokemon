/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.fanaticopokemon.models;

/**
 *
 * @autor Juan Sebastian Lopez y Cristian Salazar Arenas
 * @since 29032025
 * @version 1.0
 */
public interface PokemonPlanta {
    
    /**
    * Ejecuta el ataque de Paralizar
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 29032025
    */
    public abstract String atacarParalizar();
    /**
    * Ejecuta el ataque de Drenaje
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 29032025
    */
    public abstract String atacarDrenaje();
    /**
    * Ejecuta el ataque de Hoja Afilada
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 29032025
    */
    public abstract String atacarHojaAfilada();
    /**
    * Ejecuta el ataque de Látigo Cepa
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 29032025
    */
    public abstract String atacarLatigoCepa();
}
