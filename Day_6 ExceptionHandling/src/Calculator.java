/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
public class Calculator {
    public int factorial(int num){
        int fact = 1;
         if(num > 0){
             while(num > 1){
                 fact *= num;
                 num--;
             }
         } else {
             throw new IllegalArgumentException("-ve value is not allowed");
         }
         return fact;
    }
    public int binomialCoefficient(int n, int k){
        if(n < 0 || k < 0 || n < k)
            throw new IllegalArgumentException("Invalid input.");
        else
            return factorial(n)/(factorial(k)*factorial(n-k));
    }
}
