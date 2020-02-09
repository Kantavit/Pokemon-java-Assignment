import java.io.*;
import java.util.Scanner;

public class PokemonGame{
    public static void main(String args[]){
        Pokemon generated = new Pokemon("Koiking", "water");
        System.out.println("What will your pokemon do.... \noption: Eat, Attack, Sleep, Run");
        Scanner scan = new Scanner(System.in);
        System.out.print("> ");
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
        System.out.println("Koiking eat a berry.");
    }

    static void attack(String choose) {
        System.out.println("Koiking attack !");
    }

    static void sleep(String choose) {
        System.out.println("Koiking is sleep.");
    }

    static void run(String choose) {
        System.out.println("Koiking ran away.");
    }
}