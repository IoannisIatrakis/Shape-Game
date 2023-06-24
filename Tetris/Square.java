// IATRAKIS IOANNIS AM 5116
public class Square extends Shape {

    public Square(int emvadwn) {
        super(emvadwn);
    }

    public double computeArea() {
        return getEmSquare();
    }

    public String getType() {
        return "Square";
    }

}