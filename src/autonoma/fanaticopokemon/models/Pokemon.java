package autonoma.fanaticopokemon.models;

/**
 *
 * @autor Juan Sebastian Lopez Guzman y Cristian Salazar Arenas
 * @since 28032025
 * @version 1.0
 */
public abstract class Pokemon {
    
    /**
    * Número asignado a un pokemon en la pokedex
    */
    private int numPokedex;
    
    /**
    * Nombre asignado al pokemon
    */
    private String nombre;
    
    /**
    * Peso del pokemon
    */
    private float peso;
    
    /**
    * Temporada en la que salió el pokemon
    */
    private String temporada;
    
    // Método constructor

    /**
    * Crea una instancia de la clase Pokemon
    *
    * @param     nombre   Nombre del pokemon
    * @since 28032025
    * 
    */
    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getters y setters
    
    /**
    * Accede al nombre del pokemon
    *
    * @return    El nombre del pokemon
    * @since 28032025
    * 
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * Modifica el nombre del pokemon
    * 
    * @since 28032025
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Métodos adicionales
    
    /**
    * Ejecuta el ataque de placaje
    * 
    * @since 28032025
    */
    public abstract String atacarPlacaje();
    
    /**
    * Ejecuta el ataque de arañazo
    * 
    * @since 28032025
    */
    public abstract String atacarAraniazo();
    
    /**
    * Ejecuta el ataque de mordisco
    * 
    * @since 28032025
    */
    public abstract String atacarMordisco();
    
}
