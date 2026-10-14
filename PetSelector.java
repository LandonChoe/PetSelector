//By landon choe 10/14/26
//Pet selector chooses your pet based on your name, fav color, and fav season
import java.util.Scanner;

public class PetSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite color (red, blue, green): ");
        String color = scanner.next();
        System.out.print("Enter your favorite season (winter, spring, summer, fall): ");
        String season = scanner.next();
        System.out.print("Enter your name: ");
        String name = scanner.next();
        String color1 = "red";
        String color2 = "blue";
        String color3 = "green";
        String season1 = "summer";
        String season2 = "fall";
        String season3 = "winter";
        String season4 = "spring";
        String constanants = "bcdfghjklmnpqrstvwxyz";
        String vowels = "aeiou";
        boolean consta = true;
        boolean pet = false;
        boolean idiot = false;
        name = name.substring(0, 1);
        if (constanants.indexOf(name) >= 0) {
            consta = true;
        }
        else {
            consta = false;
        }
        if ("redgreenblue".indexOf(color) < 0) {
            idiot = true;
        }
        if (!color.equals(color1) && !color.equals(color2) && !color.equals(color3)){
            idiot = true;
        }
        if (!season.equals(season1) && !season.equals(season2) && !season.equals(season3) && !season.equals(season4)){
            idiot = true;
        }
        if (idiot){
            System.out.println("You are an idiot, try again and spell it correctly.");
        }
    if (!idiot) {
        if (color.equals(color2) && season.equals(season2)){
        System.out.println("You can have an alligator for a pet!");
        pet = true;
        }
        if (color.equals(color2) && season.equals(season4)){
        System.out.println("You can have an ostrich for a pet!");
        pet = true;
        }
        if (color.equals(color3) && season.equals(season3) && (consta)){
        System.out.println("You can have an giraffe for a pet!");
        pet = true;
        }
        if (color.equals(color3) && (season.equals(season1) || season.equals(season4))){
        System.out.println("You can have an dog for a pet!");
        pet = true;
        }
        if (color.equals(color1) && (consta)){
            System.out.println("You can have a panda for a pet!");
            pet = true;
        }
        if (color.equals(color1) && (!consta)){
            System.out.println("You can have a porcupine for a pet!");
            pet = true;
        }
        if (season.equals(season1) && (!color.equals(color1)) && (!(color.equals(color3) && (season.equals(season1) || season.equals(season4))))){
            System.out.println("You can have a pony for a pet!");
            pet = true;
        }
        if (consta && color.equals(color2) && (season.equals(season3) || season.equals(season4)) && (!(color.equals(color2) && season.equals(season4)))){
            System.out.println("You can have a Axolotl for a pet!");
            pet = true;
        }
    }
        if (!pet && !idiot){
            System.out.println("You get a rock for a pet.");
        }
        scanner.close();
    }
}
