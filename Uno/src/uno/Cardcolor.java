/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.ArrayList;

/**
 *
 * @author nroma
 */
public class Cardcolor{
    
    private String[] colors = {"red", "blue","green","yellow"};
    private String color;
    
    
    
    public String getColor(){
        int x;
       do{ x =  (int) (Math.random()* 10);
       
       }
        while (x>=4);
    
        color =  colors[x];
        
        
        
       return this.color = color;
    }
    
    public String color(){
        return color;
    }
    
}
