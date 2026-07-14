/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import Sensor;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Yosef S
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors = new ArrayList<>();
    @Override
    public void setOn(){
        for(Sensor s : sensors)
            s.setOn();
    }
    @Override
    public void setOff(){
        for(Sensor s : sensors)
            s.setOff();
    }
    @Override
    public boolean isOn(){
        for(Sensor s : sensors){
            if(!s.isOn())
                return false;
        }
        return true;
    }
    @Override
    public int read(){
        int sum = 0;
        int avg;
        if(isOn()){
          for(Sensor s : sensors){
            sum += s.read();
          }
          avg = sum / this.sensors.size();
          return avg;  
        } else{
            throw new IllegalStateException("AverageSensor is off.");
        } 
    }
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
}
