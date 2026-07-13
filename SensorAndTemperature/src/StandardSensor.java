/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Sensor;

/**
 *
 * @author Yosef S
 */
public class StandardSensor implements Sensor {
    private int data;
    public StandardSensor(int data){
        this.data = data;
    }
    public void setOn(){
    }
    public void setOff(){
    }
    public boolean isOn(){
        return true;
    }
    public int read(){
        return this.data;
    }
}
