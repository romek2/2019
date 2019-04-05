/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author nroma
 */
public class CardNumber {
    
    private int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    private int number;
    
    public int getnumber(){
        int x = (int) (Math.random() * 10);
         return  this.number = numbers[x];
        
    }
    
    public String number(){
        return " "+ number;
    }
    
}
