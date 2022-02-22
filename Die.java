/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceGame;

/**
 *
 * @author ethan
 */

import java.util.*;
import java.lang.Math;
public class Die 
{
    
    //declare fields
    private int dValue;
    private int rand;
    
    //default constructor
    public Die() 
    {
        dValue = 0;
    }
    
    //throw method
    public void Throw() 
    {
        rand = (int) ((Math.random() * 10));
        
        if (rand < 1) 
        {
            rand = rand + 1;
        }   else if (rand > 6)
        {
            while (rand > 6) 
            {
                rand = (int) ((Math.random() * 10) + 1);
            }
        }
    }
    
    //get and set methods
    public int getRoll()
    {
        dValue = rand;
        return dValue;
    }
         
}
