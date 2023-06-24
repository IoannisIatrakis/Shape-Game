
// IATRAKIS IOANNIS AM 5116
import java.util.Scanner;

public class ShapeGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give the number of shapes per type:");
        int eachShape = input.nextInt();
        System.out.print("Give the size of the stack for the player:");
        int size = input.nextInt();

        ShapeGenerator generator = new ShapeGenerator(eachShape);
        Player player = new Player(size);

        while (generator.hasShape() && !player.isStackFull()) {
            player.playShape(generator.nextShape());
            System.out.println("Player has " + player.getPoints() + " points");
            System.out.println();
            player.printStack();
            System.out.println();

        }
        System.out.println("GAME OVER");
    }
}
