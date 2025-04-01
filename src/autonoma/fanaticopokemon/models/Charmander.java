package autonoma.fanaticopokemon.models;

/**
 *
 * @autor Juan Sebastian Lopez y Cristian Salazar Arenas
 * @since 29032025
 * @version 1.0
 */
public class Charmander extends Pokemon implements PokemonFuego{

    /**
    * Crea una instancia de la clase Charmander
    *
    * @param     nombre   Nombre del pokemon
    * @since 28032025
    * 
    */
    public Charmander(String nombre) {
        super(nombre);
    }
    
    /**
    * Ejecuta el ataque de puño de fuego
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarPinioFuego() {
        return "Soy " + getNombre() + " y estoy atacando con Pinion Fuego";
    }

    /**
    * Ejecuta el ataque de ascuas
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarAscuas() {
        return "Soy " + getNombre() + " y estoy atacando con Ascuas";
    }

    /**
    * Ejecuta el ataque de lanzallamas
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarLanzaLlamas() {
        return "Soy " + getNombre() + " y estoy atacando con Lanzallamas";
    }
    

    /**
    * Ejecuta el ataque de placaje
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarPlacaje() {
        return "Soy " + getNombre() + " y estoy atacando con Placaje";
    }
    
    /**
    * Ejecuta el ataque de arañazo
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarAraniazo() {
        return "Soy " + getNombre() + " y estoy atacando con Arañazo"; 
    }
    
    /**
    * Ejecuta el ataque de mordisco
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarMordisco() {
        return "Soy " + getNombre() + " y estoy atacando con Mordisco";
    }
    
}
