/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yosef S
 */
public class Person {
    private String pname;
    private int page;
    public Person(String pname, int page){
        if(!(pname != null && pname.isEmpty() && pname.length() > 40 && page >= 0 && page <= 120))
            throw new IllegalArgumentException("Invalid argument is provided");
        else{
            this.pname = pname;
            this.page = page;
        }
    }
}
