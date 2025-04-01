package autonoma.fanaticopokemon.models;

/**
 *
 * @autor Juan Sebastian Lopez Guzman y Cristian Salazar Arenas
 * @since 28032025
 * @version 1.0
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta{

    /**
    * Crea una instancia de la clase Bulbasaur
    *
    * @param     nombre   Nombre del pokemon
    * @since 28032025
    */
    public Bulbasaur(String nombre) {
        super(nombre);
    }
    
    /**
    * Ejecuta el ataque de paralizar
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarParalizar() {
        return "Soy " + getNombre() + " y estoy atacando con Paralizar";
    }
    
    /**
    * Ejecuta el ataque de drenar
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarDrenaje() {
        return "Soy " + getNombre() + " y estoy atacando con Drenaje";
    }

    /**
    * Ejecuta el ataque de hoja afilada
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarHojaAfilada() {
        return "Soy " + getNombre() + " y estoy atacando con Hoja Afilada";
    }
    
    
    /**
    * Ejecuta el ataque de latigo cepa
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarLatigoCepa() {
        return "Soy " + getNombre() + " y estoy atacando con LatigoCepa";
    }
    
    /**
    * Ejecuta el ataque placaje
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
    * Ejecuta el ataque arañazo
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarAraniazo() {
        return "Soy " + getNombre() + " y estoy atacando con Araniazo";
    }
    
    
    /**
    * Ejecuta el ataque mordisco
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
