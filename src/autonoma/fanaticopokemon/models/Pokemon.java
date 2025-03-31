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
public abstract class Pokemon {
    
    private int numPokedex;
    private String nombre;
    private float peso;
    private String temporada;
    
    //Contructor

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    public abstract String atacarPlacaje();
    public abstract String atacarAraniazo();
    public abstract String atacarMordisco();
    
}
