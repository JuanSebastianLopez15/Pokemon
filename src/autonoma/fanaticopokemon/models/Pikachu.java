package autonoma.fanaticopokemon.models;

/**
 *
 * @autor Juan Sebastian Lopez Guzman y Cristian Salazar
 * @since 28032025
 * @version 1.0
 */
public class Pikachu extends Pokemon implements PokemonElectrico {
    
    /**
    * Crea una instancia de la clase Pikachu
    *
    * @param     nombre   Nombre del pokemon
    * @since 28032025
    * 
    */
    public Pikachu(String nombre) {
        super(nombre);
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
        return "Soy " + getNombre() + " y estoy atacando con Araniazo";
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

    /**
    * Ejecuta el ataque de impactrueno
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarImpactrueno() {
        return "Soy " + getNombre() + " y estoy atacando con Impactrueno";
    }

    /**
    * Ejecuta el ataque de puño trueno
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarPunioTrueno() {
        return "Soy " + getNombre() + " y estoy atacando con PunioTrueno"; 
    }

    /**
    * Ejecuta el ataque de rayo
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarRayo() {
        return "Soy " + getNombre() + " y estoy atacando con Rayo";
    }

    /**
    * Ejecuta el ataque de rayo carga
    *
    * @return    El nombre del pokemon y el nombre del ataque
    * @since 28032025
    * 
    */
    @Override
    public String atacarRayoCarga() {
        return "Soy " + getNombre() + " y estoy atacando con RayoCarga";
    }
    
}
