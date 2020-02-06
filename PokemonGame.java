import java.io.*;
import java.util.Scanner;

public class PokemonGame{
    public static void main(String args[]){
        Pokemon generated = new Pokemon("KoyKing");
        System.out.println("What will your pokemon do.... \noption: Eat, Attack, Sleep, Run");
        Scanner scan = new Scanner(System.in);
        String choose = scan.next();
        scan.close();

        if(choose.equals("Eat")){
            eat(choose);
        }else if(choose.equals("Attack")){
            attack(choose);
        }else if(choose.equals("Sleep")){
            sleep(choose);
        }else if(choose.equals("Run")){
            run(choose);
        }
    }

    static void eat(String choose) {
        System.out.println("KoyKing eat a berry.");
    }

    static void attack(String choose) {
        System.out.println("KoyKing attack !");
    }

    static void sleep(String choose) {
        System.out.println("KoyKing is sleep.");
    }

    static void run(String choose) {
        System.out.println("KoyKing ran away.");
    }
}