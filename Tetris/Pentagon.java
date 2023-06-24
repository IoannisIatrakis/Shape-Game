// IATRAKIS IOANNIS AM 5116
public class Pentagon extends Shape {

    public Pentagon(int emvadwn) {
        super(emvadwn);
    }

    public double computeArea() {
        return (3 * getEmSquare()) / (double) 4;
    }

    public String getType() {
        return "Pentagon";
    }

}
