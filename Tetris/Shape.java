// IATRAKIS IOANNIS AM 5116
public abstract class Shape {
    private int EmSquare;

    public Shape(int EmSquare) {
        this.EmSquare = EmSquare;
    }

    public abstract double computeArea();

    public abstract String getType();

    public boolean sameArea(Shape other) {
        if (this.computeArea() == other.computeArea()) {
            return true;
        }
        return false;
    }

    public boolean sameType(Shape other) {
        if (this.getType().equals(other.getType())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return getType() + " " + computeArea();
    }

    public int getEmSquare() {
        return EmSquare;
    }

}