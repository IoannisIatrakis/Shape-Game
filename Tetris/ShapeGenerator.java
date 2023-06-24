
// IATRAKIS IOANNIS AM 5116
import java.util.Random;

public class ShapeGenerator {
    private int numberOfShapes;
    private Shape[] board;
    private Random randomGenerator = new Random();
    private int[] size = { 1, 2, 3, 4, 8, 12, 16 };

    public ShapeGenerator(int numberOfEachShape) {
        this.numberOfShapes = 4 * numberOfEachShape;
        board = new Shape[4 * numberOfEachShape];
        initializeShapes();
    }

    private void initializeShapes() {
        int randomPosition = randomGenerator.nextInt(size.length);
        for (int i = 0; i < numberOfShapes; i = i + 4) {
            Square square = new Square(size[randomPosition]);
            board[i] = square;
            randomPosition = randomGenerator.nextInt(size.length);
            Triangle triangle = new Triangle(size[randomPosition]);
            board[i + 1] = triangle;
            randomPosition = randomGenerator.nextInt(size.length);
            Pentagon pentagon = new Pentagon(size[randomPosition]);
            board[i + 2] = pentagon;
            randomPosition = randomGenerator.nextInt(size.length);
            Circle circle = new Circle(size[randomPosition]);
            board[i + 3] = circle;
        }
        for (int i = 0; i < board.length; i++) {
            randomPosition = randomGenerator.nextInt(board.length);
            Shape help = board[i];
            board[i] = board[randomPosition];
            board[randomPosition] = help;
        }
    }

    private void push(int random) {
        Shape help = board[numberOfShapes - 1];
        board[numberOfShapes - 1] = board[random];
        board[random] = help;
    }

    public Shape nextShape() {
        int randomPosition = randomGenerator.nextInt(numberOfShapes);
        Shape test = board[randomPosition];
        push(randomPosition);
        numberOfShapes--;
        return test;
    }

    public boolean hasShape() {
        if (numberOfShapes == 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        String help = " ";
        for (int i = 0; i < numberOfShapes; i++) {
            help += board[i] + "  ";
        }
        return help;
    }

    public static void main(String[] args) {
        ShapeGenerator generator = new ShapeGenerator(2);
        System.out.println(generator.toString());
        System.out.println();
        while (generator.hasShape()) {
            System.out.println("Selected shape : " + generator.nextShape());
            System.out.println(generator.toString());
        }
    }

}
