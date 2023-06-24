
// IATRAKIS IOANNIS AM 5116
import java.util.LinkedList;
import java.util.Scanner;

public class Player {
    private LinkedList<Shape> Stack = new LinkedList<Shape>();
    private double points = 0.0;
    private int stackSize;

    public Player(int stackSize) {
        this.stackSize = stackSize;
    }

    public void playShape(Shape shape) {
        Scanner input = new Scanner(System.in);
        System.out.println("Incoming shape: " + shape);
        System.out.println("Do you want to accept? (y/n)");
        String answer = input.next();
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("Do you want to accept? (y/n)");
            answer = input.next();
        }

        if (answer.equals("y") && !isStackFull()) {
            if (Stack.size() == 0) {
                Stack.addFirst(shape);
                points = points + shape.computeArea();
                System.out.println("Added " + shape.computeArea() + " points");
                return;
            }
            if (shape.sameArea(Stack.getFirst()) && shape.sameType(Stack.getFirst())) {
                points = points + 10 * shape.computeArea();
                System.out.println("10X points! and Top shapes removed");
                System.out.println("Added " + 10 * shape.computeArea() + " points");
                Stack.removeFirst();
                return;

            } else if (shape.sameArea(Stack.getFirst())) {
                points = points + 10 * shape.computeArea();
                System.out.println("10X points!");
                System.out.println("Added " + 10 * shape.computeArea() + " points");

            } else if (shape.sameType(Stack.getFirst())) {
                points = points + shape.computeArea();
                System.out.println("Added " + shape.computeArea() + " points");
                System.out.println("Top shapes removed");
                Stack.removeFirst();
                return;
            } else {
                points = points + shape.computeArea();
                System.out.println("Added " + shape.computeArea() + " points");
            }
            Stack.addFirst(shape);
        }
    }

    public boolean isStackFull() {
        if (Stack.size() == stackSize) {
            return true;
        }
        return false;
    }

    public void printStack() {
        int size = Stack.size();
        System.out.println("Current stack:");
        for (Shape element : Stack) {
            System.out.println("      " + size + ": " + element);
            size--;
        }
    }

    public double getPoints() {
        return points;
    }

}
