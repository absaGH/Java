/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
public class SensorMain {
    public static void main(String[] args) {
    /*StandardSensor ten = new StandardSensor(10);
    StandardSensor minusFive = new StandardSensor(-5);

    System.out.println(ten.read());
    System.out.println(minusFive.read());

    System.out.println(ten.isOn());
    ten.setOff();
    System.out.println(ten.isOn());*/
    /*TempreatureSensor sensObj = new TempreatureSensor();
    sensObj.setOn();
    System.out.println(sensObj.read());
    sensObj.setOff();
    try{
      System.out.println(sensObj.read());
    }catch(Exception e){
        System.out.println(e.getMessage());
    }*/
    Sensor kumpula = new TempreatureSensor();
    kumpula.setOn();
    System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

    Sensor kaisaniemi = new TempreatureSensor();
    Sensor helsinkiVantaaAirport = new TempreatureSensor();

    AverageSensor helsinkiRegion = new AverageSensor();
    helsinkiRegion.addSensor(kumpula);
    helsinkiRegion.addSensor(kaisaniemi);
    helsinkiRegion.addSensor(helsinkiVantaaAirport);

    helsinkiRegion.setOn();
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
 }
}