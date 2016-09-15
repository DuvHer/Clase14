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
public class Main {
    public static void main(String[] args){
        
        Wheel ld1=new Wheel("Mic",10);
        Wheel ld2=new Wheel("Mic",10);
        Wheel[] front = {ld1,ld2};
        
        Wheel lt1=new Wheel("Mic",10);
        Wheel lt2=new Wheel("Mic",10);
        Wheel[] rear = {lt1,lt2};
        
        Car carro =new Car("Ferra",front,rear);
        System.out.println(carro);
        
    }
}
