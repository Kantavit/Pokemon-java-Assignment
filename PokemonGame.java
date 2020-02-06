import java.io.*;
import java.util.Scanner;

public class PokemonGame{
    public static void main(String args[]){
        //Pokemon generated = new Pokemon("KoyKing");
        System.out.println("What will your pokemon do.... \noption: Eat, Attack, Sleep, Faint, Run");
        Scanner scan = new Scanner(System.in);
        String choose = scan.nextLine();
        scan.close();
        System.out.println(choose);
        if(choose == "Eat"){
            eat(choose);
        }else if(choose == "Attack"){
            System.out.println("Attack !!!");
        }else if(choose == "Sleep"){
            System.out.println("sleep");
        }else if(choose == "Faint"){
            System.out.println("faint!");
        }else if(choose == "Run"){
            System.out.println("run!!!");
        }
    }
    static void eat(String choose) {
        System.out.println("KoyKing just eat a berry");
    }
}