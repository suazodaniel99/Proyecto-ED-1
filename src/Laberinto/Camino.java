/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laberinto;

/**
 *
 * @author Suazo
 */
public class Camino extends Casilla{
    
    public boolean recorrido;
    public boolean ruta;
    
    public Camino(int y, int x) {
        super(y, x);
        recorrido = false;
        ruta = false;
    }
    
}
