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
    StandardSensor ten = new StandardSensor(10);
    StandardSensor minusFive = new StandardSensor(-5);

    System.out.println(ten.read());
    System.out.println(minusFive.read());

    System.out.println(ten.isOn());
    ten.setOff();
    System.out.println(ten.isOn());
}
}
