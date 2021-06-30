package Class2T.example2;

public class Circle extends GeometricFigure{
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*(radio*radio);
    }
}
