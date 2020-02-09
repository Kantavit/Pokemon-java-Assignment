import java.io.*;
import java.util.Arrays;

public class Pokemon{

        // private String name;
        // private String type;
        // private String inventory[];
        // private String weakness[];
        // private String gender[];
        // private int healthPoint;
        // private int powerPoints;
        // private int level;

        public Pokemon(String pokemonName, String pokemonType){
                String inventory[] = {"berry"};
                String weakness[] = {"Electric", "Grass"};
                String gender = "male";
                int healthPoint = 100;
                int powerPoints = 3;
                int level = 5;
                System.out.println("-----------------------------");
                System.out.println("Name: " + pokemonName);
                System.out.println("Type: " + pokemonType);
                System.out.println("Gender: " + gender);
                System.out.println("HP: " + healthPoint);
                System.out.println("PP: " + powerPoints);
                System.out.println("Lv: " + level);
                System.out.println("Weakness: " + Arrays.toString(weakness));
                System.out.println("Inv: " + Arrays.toString(inventory));
                System.out.println("-----------------------------");
        }
}