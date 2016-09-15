/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14;

/**
 *
 * @author Estudiante
 */
public class Car {
    private String marca;

    Wheel [] front;
    Wheel [] rear;
    Engine m;

    public Car(String marca, Wheel[] front, Wheel[] rear) {
        
        this.marca = marca;
        //Agregación
        this.front = front;
        this.rear = rear;
        
        //Composición
        this.m = new Engine("Honda",10000);
    }
    
    
}
