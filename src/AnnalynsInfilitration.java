/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
public class AnnalynsInfilitration {
    public static boolean canFastAttack(boolean knightIsAwake){
        return knightIsAwake == false;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake){
        return (!archerIsAwake && prisonerIsAwake);
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, 
                                          boolean prisonerIsAwake, boolean petDogIsPresent){
        if(petDogIsPresent && archerIsAwake) return true;
        else return prisonerIsAwake && knightIsAwake && knightIsAwake;
    }
}
