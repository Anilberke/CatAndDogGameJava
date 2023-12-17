import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Enter a dog name: ");
        Scanner scan = new Scanner(System.in);
        String nameDog = scan.nextLine();
        Dog dog = new Dog(nameDog);
        dog.bark();
        System.out.println("Enter a cat name: ");

        String nameCat = scan.nextLine();
        Cat cat = new Cat(nameCat);
        cat.meow();
        Game game = new Game();

        for(int i = 1; i <= game.getMAX_NUMBER_0F_ROUNDS() ; i++){
            System.out.println("Round: "+i );
            System.out.println(nameCat+" x Position is: "+cat.getX_axis()+" y Position is: "+cat.getY_axis());
            System.out.println(nameDog+" x Position is: "+dog.getX_axis()+" y Position is: "+dog.getY_axis());
            if(game.isGameOver(dog,cat)){
                System.out.println("Game is over :(");
                break;
            }
            else if (game.calculateDistance(dog,cat) <= 5){
                System.out.println(nameCat + " and " + nameDog + " are fighting now");

            }
            dog.move();
            cat.move();




        }



    }
}