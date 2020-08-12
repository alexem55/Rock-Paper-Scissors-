package rps4;

import java.util.Random;
import java.util.Scanner;

public class Game extends Player{
    
    static char choice1;
    static char choice2;  
    static char tool = 'n';
           
    public static void playerChoice(){
        Scanner k = new Scanner(System.in);
        
        System.out.println(name1 + ", please choose 'R' for ROCK, 'P' for PAPER, or 'S' for SCISSORS");
        String player1Input = k.next();
        choice1 = player1Input.charAt(0);
        
        System.out.println(name2 + ", please choose 'R' for ROCK, 'P' for PAPER, or 'S' for SCISSORS");
        String player2Input = k.next();
        choice2 = player2Input.charAt(0);
        System.out.println();
    }
    
    public static char computerChoice(){
        Random r = new Random();
        int randomNumber = r.nextInt(3);
                
        switch(randomNumber){
            case 0: tool = 'r';
                    break;
            case 1: tool = 'p';
                    break;
            case 2: tool = 's';
                    break;
        }
        return tool;
    }
    
    public static void combos(){
        Scanner k = new Scanner(System.in);
        if ((choice1 == choice2) && (choice1 == tool) && (choice2 == tool)){
            System.out.println("It's a tie! All players chose the same object. Choose again.");
            do{ Game.playerChoice();
                Game.computerChoice();
                Game.combos();
              }      
                while(true);
        }
        else if ((choice1 != choice2) && (choice1 != tool) && (choice2 != tool)){
            System.out.println("All players chose different objects. Choose again.");
            do{
                Game.playerChoice();
                Game.computerChoice();
                Game.combos();
              }      
                while(true);
            }        
        if (choice1 == choice2){
            System.out.println(botName + " looses. " + name1 + " and " + name2 + " play again.");
            Game.playerChoice();
            if (choice1 == choice2){
                System.out.println("It's a tie! Both players chose the same object.");
                }
                else if(choice1 != choice2){
                //SCISSORS
                    if(choice1 == 's' && choice2 == 'p'){
                        System.out.println(name1 + " WINS! Scissors beats paper!");
                        }
                else if(choice2 == 's' && choice1 == 'p'){
                        System.out.println(name2 + " WINS! Scissors beats paper!");
                        }
                //PAPER
                    if(choice1 == 'p' && choice2 == 'r'){
                        System.out.println(name1 + " WINS! Paper beats rock!");
                        }
                else if(choice2 == 'p' && choice1 == 'r'){
                        System.out.println(name2 + " WINS! Paper beats rock!");
                        }   
                //ROCK
                    if(choice1 == 'r' && choice2 == 's'){
                        System.out.println(name1 + " WINS! Rock beats scissors!");
                        }
                else if(choice2 == 'r' && choice1 == 's'){
                        System.out.println(name2 + " WINS! Rock beats scissors!");
                        }
                }
        }   
        else if (choice1 == tool){
             Game.computerChoice();
             System.out.println(name2 + " looses. " + name1 + " and " + botName + " play again.");
             System.out.println(name1 + ", please choose 'R' for ROCK, 'P' for PAPER, or 'S' for SCISSORS");
             String player1Input = k.next();
             choice1 = player1Input.charAt(0);
            if (choice1 == tool){
                System.out.println("It's a tie! Both players chose the same object.");
                }
                else if(choice1 != tool){
                //SCISSORS
                    if(choice1 == 's' && tool == 'p'){
                        System.out.println(name1 + " WINS! Scissors beats paper!");
                        }
                else if(tool == 's' && choice1 == 'p'){
                        System.out.println(botName + " WINS! Scissors beats paper!");
                        }
                //PAPER
                    if(choice1 == 'p' && tool == 'r'){
                        System.out.println(name1 + " WINS! Paper beats rock!");
                        }
                else if(tool == 'p' && choice1 == 'r'){
                        System.out.println(botName + " WINS! Paper beats rock!");
                        }   
                //ROCK
                    if(choice1 == 'r' && tool == 's'){
                        System.out.println(name1 + " WINS! Rock beats scissors!");
                        }
                else if(tool == 'r' && choice1 == 's'){
                        System.out.println(botName + " WINS! Rock beats scissors!");
                        }
                }
        }
        if (choice2 == tool){
             Game.computerChoice();
             System.out.println(name1 + " looses. " + name2 + " and " + botName + " play again.");
             System.out.println(name2 + ", please choose 'R' for ROCK, 'P' for PAPER, or 'S' for SCISSORS");
             String player1Input = k.next();
             choice2 = player1Input.charAt(0);
            if (choice2 == tool){
                System.out.println("It's a tie! Both players chose the same object.");
                }
                else if(choice2 != tool){
                //SCISSORS
                    if(choice2 == 's' && tool == 'p'){
                        System.out.println(name2 + " WINS! Scissors beats paper!");
                        }
                else if(tool == 's' && choice2 == 'p'){
                        System.out.println(botName + " WINS! Scissors beats paper!");
                        }
                //PAPER
                    if(choice2 == 'p' && tool == 'r'){
                        System.out.println(name2 + " WINS! Paper beats rock!");
                        }
                else if(tool == 'p' && choice2 == 'r'){
                        System.out.println(botName + " WINS! Paper beats rock!");
                        }   
                //ROCK
                    if(choice2 == 'r' && tool == 's'){
                        System.out.println(name2 + " WINS! Rock beats scissors!");
                        }
                else if(tool == 'r' && choice2 == 's'){
                        System.out.println(botName + " WINS! Rock beats scissors!");
                        }
                }
            }            
        }
    } 




            


