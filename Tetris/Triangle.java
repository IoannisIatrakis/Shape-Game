// IATRAKIS IOANNIS AM 5116
public class Triangle extends Shape {

    public Triangle(int emvadwn) {
        super(emvadwn);
    }

    public double computeArea() {
        return getEmSquare() / (double) 2;
    }

    public String getType() {
        return "Triangle";
    }

}
