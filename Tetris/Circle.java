// IATRAKIS IOANNIS AM 5116
public class Circle extends Shape {

    public Circle(int emvadwn) {
        super(emvadwn);
    }

    public double computeArea() {
        return (Math.PI / 4) * getEmSquare();
    }

    public String getType() {
        return "Circle";
    }

}
