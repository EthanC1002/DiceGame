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
public class Game 
{

    public static void main(String[] args) 
    {
        int score1 = 0;
        int score2 = 0;
        Die die1 = new Die();
        Die die2 = new Die();
        Scanner scan1 = new Scanner(System.in);
        
        
        System.out.println("Do you want to play the game? 1 (yes) or 0 (no): ");
        int n = scan1.nextInt();
        
            while (n == 1)
            {
                System.out.println("Which die does user 1 want to use? (pick '1' or '2'): ");
                n = scan1.nextInt();
                    if (n == 1)
                    {
                        die1.Throw();
                        System.out.println("The value from die 1 is: " + die1.getRoll() + ". Roll added to user 1 score.");
                        System.out.println();
                        score1 += die1.getRoll();
                    } else 
                        if (n == 2)
                    {
                        die2.Throw();
                        System.out.println("The value from die 2 is: " + die2.getRoll() + ". Roll added to user 1 score.");
                        System.out.println();
                        score1 += die2.getRoll();
                    } 
                
                System.out.println("Which die does user 2 want to use? (pick '1' or '2'): ");
                n = scan1.nextInt();
                    if (n == 1)
                    {
                        die1.Throw();
                        System.out.println("The value from die 1 is: " + die1.getRoll() + ". Roll added to user 2 score.");
                        System.out.println();
                        score2 += die1.getRoll();
                    } else if (n == 2)
                    {
                        die2.Throw();
                        System.out.println("The value from die 2 is: " + die2.getRoll() + ". Roll added to user 2 score.");
                        System.out.println();
                        score2 += die2.getRoll();
                    }
                
                System.out.println("Do you want to play the game? 1 (yes) or 0 (no): ");
                n = scan1.nextInt();
            }
            
                System.out.print("User 1 score is: " + score1 + ". User 2 score is: " + score2);
                if (score1 == score2)
                {
                    System.out.println(". So Tie Game!");
                } else if (score1 > score2)
                {
                    System.out.println(". So Winner is User 1!");
                } else 
                {
                    System.out.println(". So Winner is User 2!");
                } 
    }
    
}
