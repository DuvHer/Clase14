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
public class Engine {
    
    private String marca;
    private int potencia;
    Wheel [] axle;
    
    public Engine(){
        this.marca="Honda";
        this.potencia=10000;
    }

    public Engine(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
      
    }

    public void setAxle(Wheel[] axle) {
        this.axle = axle;
    }   

    @Override
    public String toString() {
        return "Engine{" + "marca=" + marca + ", potencia=" + potencia + ", axle=" + axle + '}';
    }
    
}
