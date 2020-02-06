import java.io.*;
//Things pokemon do {eat(berry), attack, sleep, faint, run} // HP, level, PP
public class Pokemon{

        // String pokemonName = "KoyKing";
        // int healthPoint = 100;
        // int powerPoints = 3;
        // int Level = 5;
        // String inventory[2] = {"berry"};

        public void Pokemon(String name){
                String pokemonName = name;
                String inventory[] = {"berry"};
                int healthPoint = 100;
                int powerPoints = 3;
                int Level = 5;

                System.out.println("Name: " + pokemonName);
                System.out.println("Hp: " + healthPoint);
                System.out.println("Pp: " + powerPoints);
                System.out.println("Lv: " + Level);
                System.out.println("Inv: " + inventory[0]);
        }
}