package rps4;

import java.util.Scanner;

public class Player {
    static String name1;
    static String name2;
    static String botName = "CPU";
        
    public static void playerNames(){
        Scanner k = new Scanner (System.in);
        System.out.println("Player 1, please enter your name.");
        name1 = k.next();
        System.out.println("Player 2, please enter your name.");
        name2 = k.next();        
    }
    
    
}
