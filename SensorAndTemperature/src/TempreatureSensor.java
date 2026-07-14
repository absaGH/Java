import java.util.Random;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
public class TempreatureSensor implements Sensor{
    private boolean sensorState;
    @Override
    public void setOn(){
        this.sensorState = true;
    }
    @Override
    public void setOff(){
        this.sensorState = false;
    }
    @Override
    public boolean isOn(){
        return this.sensorState;
    }
    @Override
    public int read(){
        if(this.sensorState){
            return (new Random().nextInt(61) - 30);
        }
        else{
             throw new IllegalStateException("The temperature sensor is off.");
        }
    }
}
