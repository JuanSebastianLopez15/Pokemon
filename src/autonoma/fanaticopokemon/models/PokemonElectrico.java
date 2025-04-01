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
public interface PokemonElectrico {
    
    /**
    * Ejecuta el ataque de Impactrueno
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 29032025
    */
    public abstract String atacarImpactrueno();
    /**
    * Ejecuta el ataque de Puño Trueno
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 29032025
    */
    public abstract String atacarPunioTrueno();
    /**
    * Ejecuta el ataque de Rayo
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 29032025
    */
    public abstract String atacarRayo();
    /**
    * Ejecuta el ataque de Rayo Carga
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 29032025
    */
    public abstract String atacarRayoCarga();
    
}
